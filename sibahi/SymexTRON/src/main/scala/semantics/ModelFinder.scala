package semantics

import helper._
import kodkod.ast._
import kodkod.engine.Solution.Outcome
import kodkod.engine.{Solution, AbortedException, Solver}
import kodkod.engine.satlab.{SATAbortedException, SATFactory}
import kodkod.engine.ucore.SCEStrategy
import kodkod.instance.{Bounds, Instance, TupleSet, Universe}
import semantics.domains.SMem._
import semantics.domains._
import syntax.ast._

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.language.higherKinds
import scalaz._, Scalaz._

class ModelFinder(defs: Map[Class, ClassDefinition], delta: Int) {

  private type StringE[T] = String \/ T

  var counter = 0

  object SymbolicSetRel {
    val self = Relation.unary("SymbolicSet")
    val locs = Relation.binary("SymbolicSet/locs")
    lazy val locsTyping = {
      val ss = Variable.unary("ss")
      ((ss.join(locs) in LocsRel.self) forAll (ss oneOf self)) and
        (locs.join(Expression.UNIV) in self)
    }
  }

  object LocsRel {
    val self = Relation.unary("Locs")
    val fields = Relation.ternary("Locs/fields")
    lazy val fieldsTyping = {
      val l = Variable.unary("l")
      val f = Variable.unary("f")
      val ol = Variable.unary("ol")
      (l.join(fields) in FieldsRel.self.product(self) and
        (f.join(l.join(fields)) in self forAll (f oneOf FieldsRel.self)) and
          ((l.join(fields).join(ol) in FieldsRel.self) forAll (ol oneOf self))
        ) forAll (l oneOf self) and
          (fields.join(Expression.UNIV).join(Expression.UNIV) in self)
    }
  }

  object VarsRel {
    val self = Relation.unary("Vars")
    val vals = Relation.binary("Vars/vals")
    val isRoot = Relation.unary("Vars/isRoot")
    lazy val valsTyping = {
      val v = Variable.unary("v")
      (v.join(vals) in LocsRel.self) forAll (v oneOf self) and
        (vals.join(Expression.UNIV) in self)
    }
  }

  object FieldsRel {
    val self = Relation.unary("Fields")
    val childs = Relation.unary("Fields@child")
    val refs = Relation.unary("Fields@ref")
    val fieldsrels = (defs.childfields ++ defs.reffields).map(f => (f, Relation.unary(s"Field$$$f"))).toMap
  }

  object SymbolsRel {
    val self = Relation.unary("Symbols")
    val loc = Relation.binary("Symbols/loc")
    lazy val locTyping = {
      val s = Variable.unary("s")
      s.join(loc).one and (s.join(loc) in LocsRel.self) forAll (s oneOf self) and
        (loc.join(Expression.UNIV) in self)
    }
  }

  object TypesRel {
    val self = Relation.unary("Types")
    val isSubType = Relation.binary("Types/isSubType")
    val standalone = Relation.unary("Types/standalone")
    val typeOfSet = Relation.binary("Types/typeOfSet")
    lazy val typeOfSetTyping = {
      val ss = Variable.unary("ss")
      (ss.join(typeOfSet).one and (ss.join(typeOfSet) in self) forAll (ss oneOf SymbolicSetRel.self)) and
        (typeOfSet.join(Expression.UNIV) in SymbolicSetRel.self)
    }
    val typeOfSym = Relation.binary("Types/typeOfSym")
    lazy val typeOfSymTyping = {
      val s = Variable.unary("s")
      (s.join(typeOfSym).lone and (s.join(typeOfSym) in self) forAll (s oneOf SymbolsRel.self)) and
        (typeOfSym.join(Expression.UNIV) in SymbolsRel.self)
    }
    val typeOfLoc = Relation.binary("Types/typeOfLoc")
    lazy val typeOfLocTyping = {
      val l = Variable.unary("l")
      (l.join(typeOfLoc).one and (l.join(typeOfLoc) in self)) forAll (l oneOf LocsRel.self) and
        (typeOfLoc.join(Expression.UNIV) in LocsRel.self)
    }
    lazy val typeOfLocTypeOfSymEquality = {
      val s = Variable.unary("s")
      val l = Variable.unary("l")
      ((s product l) in SymbolsRel.loc) implies (s.join(typeOfSym) eq l.join(typeOfLoc)) forAll
        ((s oneOf SymbolsRel.self) and (l oneOf LocsRel.self))
    }
    lazy val typeOfLocTypeOfSetSubtyping = {
      val l = Variable.unary("l")
      val ss = Variable.unary("ss")
      val t = Variable.unary("t")
      val ts = Variable.unary("ts")
      ((l.join(typeOfLoc) eq t) and (ss.join(typeOfSet) eq ts) and (l in ss.join(SymbolicSetRel.locs)) implies
        (ts in t.join(isSubType))) forAll
          ((l oneOf LocsRel.self) and (ss oneOf SymbolicSetRel.self) and (t oneOf self) and (ts oneOf self))
    }
    def typeOfFieldCorrectness(hasTracking: Boolean) = {
      val l = Variable.unary("l")
      val f = Variable.unary("f")
      val ol = Variable.unary("ol")
      val t = Variable.unary("t")
      val ot = Variable.unary("ot")
      val ote = Variable.unary("ote")
      allFormulae(defs.toList.map { case (c, cd) =>
        val supersOfC = defs.supertypes(c) + c
        val fieldsOfC = (defs.refsOf(supersOfC) ++ defs.childrenOf(supersOfC)).keySet
        val complementOfFieldsOfC = (defs.childfields ++ defs.reffields) diff fieldsOfC
        val fieldAbsence = allFormulae(complementOfFieldsOfC.toList.map { field =>
          (l.join(typeOfLoc) eq t) implies
            ((l product f product ol) in LocsRel.fields).not forAll
            ((ol oneOf LocsRel.self) and (l oneOf LocsRel.self) and
              (f oneOf FieldsRel.fieldsrels(field)) and (t oneOf TypesRel.typerels(c)))
        })
        val fieldTyping = allFormulae((cd.children ++ cd.refs).toList.map { case (field, FieldDefinition(oc, crd, ft)) =>
          val cardConstraint = (t in l.join(typeOfLoc).join(isSubType)) implies (crd match {
            case ManyReq => f.join(l.join(LocsRel.fields)).some
            case Req => f.join(l.join(LocsRel.fields)).one
            case ManyOpt => Formula.TRUE
            case Opt => f.join(l.join(LocsRel.fields)).lone
          }) forAll ((f oneOf FieldsRel.fieldsrels(field)) and (l oneOf LocsRel.self) and
            (t oneOf TypesRel.typerels(c)))
          val typingConstraint = (t in l.join(typeOfLoc).join(isSubType)) and ((l product f product ol) in LocsRel.fields) and (ot eq ol.join(typeOfLoc)) implies
            ((ot product ote) in TypesRel.isSubType)  forAll
            ((f oneOf FieldsRel.fieldsrels(field)) and (l oneOf LocsRel.self) and (ol oneOf LocsRel.self) and
              (t oneOf TypesRel.typerels(c)) and (ot oneOf TypesRel.self) and (ote oneOf TypesRel.typerels(oc)))
          val bidiConstraint = ft match {
            case Bidirectional(oppositeOf) =>
              val of = Variable.unary("of")
              (t in l.join(typeOfLoc).join(isSubType)) and ((l product f product ol) in LocsRel.fields) implies
                ((ol product of product l) in LocsRel.fields)  forAll
                ((f oneOf FieldsRel.fieldsrels(field)) and (of oneOf FieldsRel.fieldsrels(oppositeOf)) and (l oneOf LocsRel.self)
                  and (ol oneOf LocsRel.self) and (t oneOf TypesRel.typerels(c)))
            case Tracking =>
              if (hasTracking) Formula.TRUE
              else {
                (t in l.join(typeOfLoc).join(isSubType)) implies f.join(l.join(LocsRel.fields)).no forAll ((f oneOf FieldsRel.fieldsrels(field)) and (l oneOf LocsRel.self) and (t oneOf TypesRel.typerels(c)))
              }
            case Ordinary => Formula.TRUE
          }
          allFormulae(List(cardConstraint,typingConstraint, bidiConstraint))
        })
        allFormulae(List(fieldTyping, fieldAbsence))
      })
    }
    val typerels = defs.keys.map(c => (c,Relation.unary(s"Type$$${c.name}"))).toMap
  }

  object ReachabilityRel {
    val owner = Relation.binary("owner")
    lazy val ownerTyping = {
      val l = Variable.unary("l")
      (l.join(owner).lone and (l.join(owner) in LocsRel.self)) forAll(l oneOf LocsRel.self) and
        (owner.join(Expression.UNIV) in LocsRel.self)
    }
    lazy val ownerDefinition = {
      val l = Variable.unary("l")
      val ol = Variable.unary("ol")
      val f = Variable.unary("f")
      (((ol product l) in owner) iff
        ((l product f product ol) in LocsRel.fields `forSome` (f oneOf FieldsRel.childs))) forAll
                   ((l oneOf LocsRel.self) and (ol oneOf LocsRel.self))
    }
    lazy val owningFieldUniqueness = {
      val l = Variable.unary("l")
      val ol = Variable.unary("ol")
      val f = Variable.unary("f")
      val f2 = Variable.unary("f2")
      ((l product f product ol) in LocsRel.fields) and
        ((l product f2 product ol) in LocsRel.fields) implies (f eq f2) forAll
          ((l oneOf LocsRel.self) and (ol oneOf LocsRel.self) and (f oneOf FieldsRel.childs) and (f2 oneOf FieldsRel.childs))
    }
    lazy val ownerAcyclic = {
      val l = Variable.unary("l")
      ((l product l) in owner.closure).not forAll (l oneOf LocsRel.self)
    }
    val referencedBy = Relation.binary("referencedBy")
    lazy val referencedByTyping = {
      val l = Variable.unary("l")
      l.join(referencedBy) in LocsRel.self forAll(l oneOf LocsRel.self) and
        (referencedBy.join(Expression.UNIV) in LocsRel.self)
    }
    lazy val referencedByDefinition = {
      val l = Variable.unary("l")
      val ol = Variable.unary("ol")
      val f = Variable.unary("f")
      ((ol product l) in referencedBy) iff
        (((l product f product ol) in LocsRel.fields) `forSome` (f oneOf FieldsRel.refs)) forAll
              ((l oneOf LocsRel.self) and (ol oneOf LocsRel.self))
    }
    val reachableBy = Relation.binary("reachableBy")
    lazy val reachableByTyping = {
      val l = Variable.unary("l")
      l.join(reachableBy) in LocsRel.self forAll(l oneOf LocsRel.self) and
        (reachableBy.join(Expression.UNIV) in LocsRel.self)
    }
    lazy val reachableByDefinition = {
      val l = Variable.unary("l")
      val ol = Variable.unary("ol")
      ((ol product l) in reachableBy) iff
        (((ol product l) in owner.closure) or ((ol product l) in referencedBy.closure)) forAll ((l oneOf LocsRel.self) and (ol oneOf LocsRel.self))
    }
  }

  private
  def staticConstraints(hasTracking: Boolean) : List[Formula] = List(
   SymbolsRel.locTyping , SymbolicSetRel.locsTyping , LocsRel.fieldsTyping ,
   VarsRel.valsTyping , TypesRel.typeOfLocTyping , TypesRel.typeOfSymTyping , TypesRel.typeOfSetTyping ,
   TypesRel.typeOfLocTypeOfSetSubtyping , TypesRel.typeOfLocTypeOfSymEquality ,
   TypesRel.typeOfFieldCorrectness(hasTracking), ReachabilityRel.ownerTyping , ReachabilityRel.ownerDefinition ,
   ReachabilityRel.ownerAcyclic , ReachabilityRel.owningFieldUniqueness , ReachabilityRel.referencedByTyping ,
   ReachabilityRel.referencedByDefinition , ReachabilityRel.reachableByTyping , ReachabilityRel.reachableByDefinition
  )

  private
  def classPresenceConstraint(clazz: Class): Formula = {
    val v = Variable.unary("v")
    val l = Variable.unary("l")
    val ol = Variable.unary("ol")
    val t = Variable.unary("t")
    (ol in v.join(VarsRel.vals)) and
      ((l product ol) in ReachabilityRel.reachableBy.reflexiveClosure) and
        (l.join(TypesRel.typeOfLoc) eq t) `forSome`
          ((v oneOf VarsRel.self) and (ol oneOf LocsRel.self) and (l oneOf LocsRel.self)) forAll
            (t oneOf TypesRel.typerels(clazz))
  }

  private
  def fieldPresenceConstraint(fieldconstr: (Class, Fields, FieldMultiplicity)): Formula = {
    val (clazz, field, mult) = fieldconstr
    val v = Variable.unary("v")
    val ol = Variable.unary("ol")
    val l = Variable.unary("l")
    val f = Variable.unary("f")
    val t = Variable.unary("t")
    (ol in v.join(VarsRel.vals)) and
      ((l product ol) in ReachabilityRel.reachableBy.reflexiveClosure) and
        (t in l.join(TypesRel.typeOfLoc).join(TypesRel.isSubType)) and
            ({ val lf = f.join(l.join(LocsRel.fields))
              mult match {
                case ZeroMultiplicity => lf.no
                case OneMultiplicity => lf.one
                case SomeMultiplicity => lf.count.gt(IntConstant.constant(1))
              }
            }) `forSome`
              ((v oneOf VarsRel.self) and (ol oneOf LocsRel.self) and (l oneOf LocsRel.self)) forAll
                 ((t oneOf TypesRel.typerels(clazz)) and (f oneOf FieldsRel.fieldsrels(field)))
  }

  private
  def calculateBounds(symmap: Map[Symbol, Relation], ssymmap: Map[SetSymbol, Relation], locmap: Map[Loc, Relation], varmap: Map[String, Relation], varroots: Set[String]) : Bounds = {
    val additionallocs = {
      // See if .max works instead of maximum
      val maxid = try { locmap.keySet.toList.map(_.id).max + 1 } catch { case e:UnsupportedOperationException => 0 }
      (maxid until (maxid + delta)).map(Loc)
    }
    val locobjs = locmap.map{ case (loc, _) => (loc, s"loc'${loc.id}") }
    val additionalocobjs =  additionallocs.map{ loc => (loc, s"loc'${loc.id}") }.toMap
    val allLocobjs = locobjs ++ additionalocobjs
    val symobjs = symmap.map { case (sym, _) => (sym, s"sym'${sym.id}") }
    val ssymobjs = ssymmap.map { case (ssym, _) => (ssym, s"set'${ssym.id}") }
    val typeobjs = TypesRel.typerels.map { case (c, _) => (c, s"type'${c.name}") }
    val fieldobjs = FieldsRel.fieldsrels.map { case (field, _) => (field, s"field'$field") }
    val varobjs = varmap.map { case (vr, _) => (vr, s"var'$vr") }
    val atoms = symobjs.values ++ ssymobjs.values ++ typeobjs.values ++
                  allLocobjs.values ++ fieldobjs.values ++ varobjs.values
    val universe = new Universe(atoms.toSeq.asJava)
    val bounds = new Bounds(universe)
    val f = universe.factory

    bounds.boundExactly(SymbolsRel.self, f setOf (symobjs.values.toSeq :_*))

    for ((sym, rel) <- symmap) bounds.boundExactly(rel, f setOf symobjs(sym))

    val symLocUpper = f noneOf 2
    for (symid <- symobjs.values.toSeq; locid <- allLocobjs.values.toSeq) symLocUpper.add((f tuple symid) product (f tuple locid))

    bounds.bound(SymbolsRel.loc, symLocUpper)

    for ((ssym, rel) <- ssymmap) bounds.boundExactly(rel, f setOf ssymobjs(ssym))
    bounds.boundExactly(SymbolicSetRel.self, f setOf (ssymobjs.values.toSeq :_*))

    bounds.boundExactly(VarsRel.self, f setOf (varobjs.values.toSeq :_*))

    for ((vr, rel) <- varmap) bounds.boundExactly(rel, f setOf varobjs(vr))

    bounds.boundExactly(VarsRel.isRoot, f setOf (varroots.map(varobjs).toSeq :_*))

    val varvalsUpper = f noneOf 2
    for (varid <- varobjs.values.toSeq; locid <- allLocobjs.values.toSeq) varvalsUpper.add((f tuple varid) product (f tuple locid))
    bounds.bound(VarsRel.vals, varvalsUpper)


    for ((field, rel) <- FieldsRel.fieldsrels) bounds.boundExactly(rel, f setOf fieldobjs(field))

    bounds.boundExactly(FieldsRel.self, f setOf (fieldobjs.values.toSeq :_*))
    bounds.boundExactly(FieldsRel.childs, f setOf (fieldobjs.filterKeys(defs.childfields.contains).values.toSeq :_*))
    bounds.boundExactly(FieldsRel.refs, f setOf (fieldobjs.filterKeys(defs.reffields.contains).values.toSeq :_*))

    val ssetrellocsUpper = f noneOf 2
    for (locid <- allLocobjs.values.toSeq; sset <- ssymobjs.values) ssetrellocsUpper.add((f tuple sset) product (f tuple locid))
    bounds.bound(SymbolicSetRel.locs, ssetrellocsUpper)

    bounds.boundExactly(LocsRel.self, f setOf (allLocobjs.values.toSeq :_*))
    for ((loc, rel) <- locmap) bounds.boundExactly(rel, f setOf locobjs(loc))

    val locsfieldsUpper = f noneOf 3
    for (locid <- allLocobjs.values; fieldid <- fieldobjs.values; olocid <- allLocobjs.values.toSeq)
      locsfieldsUpper.add((f tuple locid) product (f tuple fieldid) product (f tuple olocid))
    bounds.bound(LocsRel.fields, locsfieldsUpper)

    for ((c, trelname) <- TypesRel.typerels) bounds.boundExactly(trelname, f setOf typeobjs(c))
    bounds.boundExactly(TypesRel.self, f setOf (typeobjs.values.toSeq :_*))

    val standaloneBounds = f noneOf 1

    defs.values.toSet.foreach[Unit](cd => if (cd.isStandalone) standaloneBounds.add(f tuple typeobjs(Class(cd.name))))
    bounds.boundExactly(TypesRel.standalone, standaloneBounds)

    val stBounds = f noneOf 2
    for ((c, sc) <- defs.subtypesOrSelf.toList.flatMap { case (c, scs) => scs.toList.map(sc => (c,sc)) }) {
      stBounds.add((f tuple typeobjs(sc)) product (f tuple typeobjs(c)))
    }
    bounds.boundExactly(TypesRel.isSubType, stBounds)
    val typeOfSetUpper = f noneOf 2
    for (ss <- ssymobjs.values.toSeq) {
      for (typ <- typeobjs.values.toSeq) {
        typeOfSetUpper.add((f tuple ss) product (f tuple typ))
      }
    }
    bounds.bound(TypesRel.typeOfSet, typeOfSetUpper)
    val typeOfSymUpper = f noneOf 2
    for (sid <- symobjs.values.toSeq) {
      for (typ <- typeobjs.values.toSeq) {
        typeOfSymUpper.add((f tuple sid) product (f tuple typ))
      }
    }
    bounds.bound(TypesRel.typeOfSym, typeOfSymUpper)
    val typeOfLocUpper = f noneOf 2
    for (lid <- allLocobjs.values.toSeq; typ <- typeobjs.filterKeys(c => !defs(c).isAbstract).values.toSeq) typeOfLocUpper.add((f tuple lid) product (f tuple typ))
    bounds.bound(TypesRel.typeOfLoc, typeOfLocUpper)

    val locReachUpper = f noneOf 2
    for (lid <- allLocobjs.values.toSeq; olid <- allLocobjs.values.toSeq) locReachUpper.add((f tuple lid) product (f tuple olid))
    bounds.bound(ReachabilityRel.owner, locReachUpper)
    bounds.bound(ReachabilityRel.referencedBy, locReachUpper)
    bounds.bound(ReachabilityRel.reachableBy, locReachUpper)
    bounds
  }

  private
  def translateBoolExpr(b : BoolExpr[IsSymbolic.type], symmap: Map[Symbol, Relation], ssymmap : Map[SetSymbol, Relation], isNegated: Boolean = false)
  : String \/ (List[Formula], Formula) = b match {
    case Eq(e1, e2) => translateBinaryBoolExpr(e1, _ eq _, e2, symmap, ssymmap, isNegated)
    case SetSubEq(e1, e2) =>  translateBinaryBoolExpr(e1, _ in _, e2, symmap, ssymmap, isNegated)
    case True() => (List(), if (isNegated) Formula.FALSE else Formula.TRUE).right
    case And(b1,b2) =>
      for {
        (cs1, eb1) <- translateBoolExpr(b1, symmap, ssymmap, isNegated)
        (cs2, eb2) <- translateBoolExpr(b2, symmap, ssymmap, isNegated)
      } yield (cs1 ++ cs2, if (isNegated) anyFormulae(List(eb1, eb2)) else allFormulae(List(eb1,eb2)))
    case Not(b0) => for {
        ebr <- translateBoolExpr(b0, symmap, ssymmap, !isNegated)
      } yield ebr
  }

  private
  def translateBinaryBoolExpr(e1: SetExpr[IsSymbolic.type], op: (Expression, Expression) => Formula, e2: SetExpr[IsSymbolic.type],
                              symmap: Map[Symbol, Relation], ssymmap: Map[SetSymbol, Relation], isNegated: Boolean): String \/ (List[Formula], Formula) = {
    for {
      (cs1, ee1) <- translateSetExpr(e1, symmap, ssymmap)
      (cs2, ee2) <- translateSetExpr(e2, symmap, ssymmap)
      formula = {
        val res = op(ee1, ee2)
        if (isNegated) res.not else res
      }
    } yield (cs1 ++ cs2, formula)
  }

  private
  def translateSetExpr(e : SetExpr[IsSymbolic.type], symmap: Map[Symbol, Relation], ssymmap : Map[SetSymbol, Relation]) : String \/ (List[Formula], Expression) = e match {
    case SetLit(es) =>
      val eet = if (es.isEmpty) Expression.NONE.right[String]
        else {
          val sym = Variable.unary("sym")
          es.toList.traverse[StringE, Formula] { case Symbol(ident) =>
            for {
              symrel <- symmap.get(Symbol(ident)).cata(_.right[String], s"Unknown symbol ${Symbol(ident)}".left)
            } yield sym eq symrel }.map { ees =>
            (anyFormulae(ees) comprehension (sym oneOf SymbolsRel.self)).join(SymbolsRel.loc) }
        }
      val s1 = Variable.unary("s1")
      val s2 = Variable.unary("s2")
      val diffConstraints = es.toList.traverseM[StringE, Formula] { case Symbol(ident) =>
          es.toList.traverse[StringE, Formula] {
            case Symbol(ident2) if ident != ident2 =>
              for {
                symrel1 <- symmap.get(Symbol(ident)).cata(_.right[String], s"Unknown symbol ${Symbol(ident)}".left)
                symrel2 <- symmap.get(Symbol(ident2)).cata(_.right[String], s"Unknown symbol ${Symbol(ident)}".left)
              } yield (symrel1.join(SymbolsRel.loc) eq symrel2.join(SymbolsRel.loc)).not
            case _ => Formula.TRUE.right[String]
          }
      }
      for {
        et <- eet
        cs <- diffConstraints
      } yield (cs, et)
    case Union(e1, e2) =>
      translateBinarySetExpr(e1, _ union _, e2, symmap, ssymmap)
    case Diff(e1, e2) =>
      translateBinarySetExpr(e1, _ difference _, e2, symmap, ssymmap)
    case ISect(e1, e2) =>
      translateBinarySetExpr(e1, _ intersection _, e2, symmap, ssymmap)
    case SetSymbol(ident) =>
      for {
        ssymrel <- ssymmap.get(SetSymbol(ident)).cata(_.right[String], s"Unkown set symbol ${SetSymbol(ident)}".left)
      } yield (List(), ssymrel.join(SymbolicSetRel.locs))
  }

  private
  def translateBinarySetExpr(e1: SetExpr[IsSymbolic.type], op: (Expression, Expression) => Expression, e2: SetExpr[IsSymbolic.type],
                             symmap: Map[Symbol, Relation], ssymmap : Map[SetSymbol, Relation]): String \/ (List[Formula], Expression) = {
    for {
      (cs1, ee1) <- translateSetExpr(e1,symmap, ssymmap)
      (cs2, ee2) <- translateSetExpr(e2,symmap, ssymmap)
    } yield (cs1 ++ cs2, op(ee1, ee2))
  }

  def concretise(smem: SMem, classesPresent: Set[Class] = Set(), fieldsPresent: Set[(Class,Fields, FieldMultiplicity)] = Set(), hasTracking: Boolean = false, wellRooted: Boolean = false): String \/ CMem = {
    concretisationConstraints(smem, hasTracking, wellRooted).flatMap{ case (cs, bs) =>
      val classesPresentConstraints = classesPresent.map(cl => classPresenceConstraint(cl)).toList
      val fieldsPresentConstraints = fieldsPresent.map(f => fieldPresenceConstraint(f)).toList
      //println(PrettyPrinter.pretty(smem, initial = true))
      findSolution(cs ++ classesPresentConstraints ++ fieldsPresentConstraints, bs) }.map{inst =>
      extractConcreteMemory(inst, _sm_initStack.get(smem).keySet)
    }
  }

  private
  def concretisationConstraints(smem: SMem, hasTracking : Boolean, wellRooted: Boolean): String \/ (List[Formula], Bounds) = {
    def cardConstraint(s: Expression, crd: Cardinality): Formula = crd match {
      case ManyReq => s.join(SymbolicSetRel.locs).some
      case Req => s.join(SymbolicSetRel.locs).one
      case ManyOpt => Formula.TRUE
      case Opt =>  s.join(SymbolicSetRel.locs).lone
    }

    val symmap = smem.heap.svltion.keySet.map(sym => sym -> Relation.unary(s"Sym$$${sym.id}")).toMap
    val ssymmap = smem.heap.ssvltion.keySet.map(ssym => ssym -> Relation.unary(s"SetSym$$${ssym.id}")).toMap
    val varmap = _sm_initStack.get(smem).keySet.map(vr => vr -> Relation.unary(s"Var$$$vr")).toMap
    val locmap = smem.heap.initSpatial.keySet.map(loc => loc -> Relation.unary(s"Loc$$${loc.id}")).toMap
    val varconstraints = _sm_initStack.get(smem).foldLeft(List[Formula]().right[String]) { (str, vinfo) =>
      val (vr, exp) = vinfo
      for {
        constraints <- str
        (expcs, eexp) <- translateSetExpr(exp, symmap, ssymmap)
        varconstraint = varmap(vr).join(VarsRel.vals) eq eexp
      } yield varconstraint :: expcs ++ constraints
    }
    val rootconstraints = if (wellRooted) {
      val l = Variable.unary("l")
      val ol = Variable.unary("ol")
      val v = Variable.unary("v")
      val t = Variable.unary("t")
      ((l in v.join(VarsRel.vals)) and (v in VarsRel.isRoot) `forSome` (v oneOf VarsRel.self)).not and
        ((t in l.join(TypesRel.typeOfLoc).join(TypesRel.isSubType) and (t in TypesRel.standalone)).not forAll (t oneOf TypesRel.self)) implies
               ((l product ol) in ReachabilityRel.owner `forSome` (ol oneOf LocsRel.self)) forAll (l oneOf LocsRel.self)

    } else Formula.TRUE
    val varroots = _sm_roots.get(smem)
    val ssvconstraints = smem.heap.ssvltion.toList.flatMap { case (ssym, ssdesc) =>
        val notinstofconstraints = ssdesc.notinstof.map(ncl => {
            val l = Variable.unary("l")
            (l in ssymmap(ssym).join(SymbolicSetRel.locs)) implies
              (TypesRel.typerels(ncl) in l.join(TypesRel.typeOfLoc).join(TypesRel.isSubType)).not forAll (l oneOf LocsRel.self)
          }
        ).toList
        notinstofconstraints ++ List(cardConstraint(ssymmap(ssym), ssdesc.crd),
          ssymmap(ssym).join(TypesRel.typeOfSet) eq TypesRel.typerels(ssdesc.cl))
    }
    val svconstraints = smem.heap.svltion.toList.flatMap { case (sym, sdesc) =>
      sdesc match {
        case Loced(loc) =>
          if (smem.heap.locOwnership(loc) match {
            case NewlyCreated => true
            case _ => false
          }) List()
          else List(symmap(sym).join(SymbolsRel.loc) eq locmap(loc))
        case UnknownLoc(cl, notinstof) =>
          val notinstofconstraints = notinstof.map(ncl =>
              (TypesRel.typerels(ncl) in symmap(sym).join(TypesRel.typeOfSym).join(TypesRel.isSubType)).not
          ).toList
          (TypesRel.typerels(cl) in symmap(sym).join(TypesRel.typeOfSym).join(TypesRel.isSubType)) :: notinstofconstraints
      }
    }
    val spatialConstraints = smem.heap.initSpatial.foldLeft(List[Formula]().right[String]) { (st, locinfo) =>
      val (loc, sdesc) = locinfo
      val ol = Variable.unary("ol")
      val t = Variable.unary("t")
      val t2 = Variable.unary("t2")
      val typeConstraint = (locmap(loc).join(TypesRel.typeOfLoc) eq t) implies
        (sdesc.desctype match {
          case ExactDesc => t eq t2
          case AbstractDesc => t2 in t.join(TypesRel.isSubType)
          case PartialDesc(hasExact, possible) =>
            val exactConstraint = if (hasExact) t eq t2 else Formula.TRUE
            val possibleConstraints = anyFormulae(possible.toList.map(c => TypesRel.typerels(c) in t.join(TypesRel.isSubType)))
            allFormulae(List(t2 in t.join(TypesRel.isSubType), anyFormulae(List(exactConstraint, possibleConstraints))))
        }) forAll ((t oneOf TypesRel.self) and (t2 oneOf TypesRel.typerels(sdesc.cl)))
      val notinstofconstraints = sdesc.notinstof.map(ncl =>
        (TypesRel.typerels(ncl) in locmap(loc).join(TypesRel.typeOfLoc).join(TypesRel.isSubType)).not
      ).toList
      for {
        constraints <- st
        dpConstraints <- sdesc.descendantpools.foldLeft(List[Formula]().right[String]) { (st, dpinfo) =>
          val (cl, ssym) = dpinfo
          for {
            constraints <- st
            (ssymcs, ssymexpr) <- translateSetExpr(ssym, symmap, ssymmap)
            dpconstraint = {
                (ol product locmap(loc) in ReachabilityRel.owner.closure and
                  (TypesRel.typerels(cl) in ol.join(TypesRel.typeOfLoc).join(TypesRel.isSubType))
                  comprehension (ol oneOf LocsRel.self)) eq ssymexpr
            }
          } yield dpconstraint :: ssymcs ++ constraints
        }
        fieldConstraints <- (sdesc.children ++ sdesc.refs).foldLeft(List[Formula]().right[String]) { (st, fieldinfo) =>
          val (field, fieldval) = fieldinfo
          for {
            constraints <- st
            (fieldcs, fieldvalexp) <- translateSetExpr(fieldval, symmap, ssymmap)
            fieldconstraint = {
              val ol = Variable.unary("ol")
              ((locmap(loc) product FieldsRel.fieldsrels(field) product ol) in LocsRel.fields) iff (ol in fieldvalexp) forAll (ol oneOf LocsRel.self)
            }
          } yield fieldconstraint :: fieldcs ++ constraints
        }
      } yield typeConstraint :: (notinstofconstraints ++ fieldConstraints ++ dpConstraints ++ constraints)
    }

    for {
      vcs <- varconstraints
      purecs <-
        smem.heap.pure.toList.traverseM[StringE, Formula] { be =>
          for {
            (cs, bec) <- translateBoolExpr(be, symmap, ssymmap, isNegated = false)
          } yield bec :: cs
        }
      // Consider using RWS monad
      scs <- spatialConstraints
      allConstraints = staticConstraints(hasTracking) ++ List(rootconstraints) ++ ssvconstraints ++ svconstraints ++ vcs ++ purecs ++ scs
      bounds = calculateBounds(symmap, ssymmap, locmap, varmap, varroots)
    } yield (allConstraints, bounds)
  }

  private
  def allFormulae(fs: List[Formula]): Formula = {
    implicit val allFormulaMonoid = Monoid.instance[Formula](_ and _, Formula.TRUE)
    fs.normalizeMonoidal
  }

  private
  def anyFormulae(fs: List[Formula]): Formula = {
    implicit val anyFormulaMonoid = Monoid.instance[Formula](_ or _, Formula.FALSE)
    fs.normalizeMonoidal
  }

  private
  def findSolution(constraints: List[Formula], bounds: Bounds): String \/ Instance = {
    def solveWith(factory: SATFactory, constraints: List[Formula], bounds: Bounds): Solution = {
      // Try Java based solver as backup
      val solver = new Solver
      solver.options.setLogTranslation(2)
      solver.options.setSolver(factory)
      solver.solve(allFormulae(constraints), bounds)
    }
    val solution = try {
      solveWith(SATFactory.plingeling(Runtime.getRuntime.availableProcessors, true), constraints, bounds)
    } catch {
      case ex: AbortedException if ex.getCause.isInstanceOf[SATAbortedException] =>
        solveWith(SATFactory.DefaultSAT4J, constraints, bounds)
    }
    solution.outcome match {
      case Outcome.SATISFIABLE | Outcome.TRIVIALLY_SATISFIABLE => solution.instance.right
      case Outcome.UNSATISFIABLE | Outcome.TRIVIALLY_UNSATISFIABLE =>
        //println(solution.outcome)
        val proof = solution.proof
        val core = if (proof != null) { proof.minimize(new SCEStrategy(proof.log)); proof.highLevelCore.keySet.toString } else "No core!"
        s""" |Unsatisfiable!
             |core:
             |$core
             |
             |constraints:
             |${constraints.mkString("\n")}
             |
             |bounds (relation):
             |${bounds.upperBounds.map{ case (rel, ts) => s"$rel: $ts" }.mkString("\n")}
             |bounds (ints):
             |${bounds.intBounds.values}""".stripMargin.left
    }
  }

  private
  def extractConcreteMemory(instance: Instance, vars: Set[Vars]): CMem = {
    def extractSet[K](ts: TupleSet): Set[K] = ts.foldLeft(Set[K]()) { (set, tuple) =>
      set + tuple.atom(0).asInstanceOf[K]
    }
    def extractMap[K,V](ts: TupleSet): Map[K,Set[V]] = ts.foldLeft(Map[K,Set[V]]()) { (map, tuple) =>
      map.adjust(tuple.atom(0).asInstanceOf[K])(_ + tuple.atom(1).asInstanceOf[V])
    }
    def extractTernary[A,B,C](ts: TupleSet): Set[(A,B,C)] = ts.foldLeft(Set[(A,B,C)]()) { (set, tuple) =>
      set + ((tuple.atom(0).asInstanceOf[A], tuple.atom(1).asInstanceOf[B], tuple.atom(2).asInstanceOf[C]))
    }
    val varVals = extractMap[String, String](instance.tuples(VarsRel.vals))
    val locName = extractSet[String](instance.tuples(LocsRel.self)).map { locstr =>
      val locname = locstr.replaceFirst("loc'", "").toInt
      (locstr, locname)
    }.toMap
    val typeOfLoc = extractMap[String, String](instance.tuples(TypesRel.typeOfLoc)).mapValues(_.head)
    val locFields = extractTernary[String, String, String](instance.tuples(LocsRel.fields))
    val stack = vars.map(v => (v, Set[Instances]())).toMap ++ varVals.keySet.foldLeft(Map[String, Set[Instances]]()) { (stack, vr) =>
      val varname = vr.replaceFirst("var'", "")
      stack + (varname -> varVals.get(vr).cata(_.map(locName), Set()))
    }
    val typeMap = typeOfLoc.foldLeft(Map[Instances, Class]()) { (typeMap, kv) =>
      val (loc, typ) = kv
      val typename = typ.replaceFirst("type'", "")
      typeMap + (locName(loc) -> Class(typename))
    }
    val (childRels, refRels) = locFields.partition { case (l,f,ss) => defs.childfields.contains(f.replaceFirst("field'","")) }
    def convertFieldmap(rels: Set[(String, String, String)]) : Map[Instances, Map[Fields, Set[Instances]]] = {
      rels.foldLeft(Map[Instances, Map[Fields, Set[Instances]]]()) { (map, rel) =>
        val (l, f, ol) = rel
        val locname = locName(l)
        val fieldname = f.replaceFirst("field'", "")
        val symLoc = locName(ol)
        map.updated(locname,
          map.get(locname).cata(fieldmap => fieldmap.updated(fieldname,
            fieldmap.get(fieldname).cata(locs => locs + symLoc, Set(symLoc))
          ), Map(fieldname -> Set(symLoc)))
        )
      }
    }
    val childMap = typeMap.mapValues(c => defs.childrenOf(defs.supertypes(c) + c).mapValues(_ => Set[Instances]())) |+| convertFieldmap(childRels)
    val refMap = typeMap.mapValues(c => defs.refsOf(defs.supertypes(c) + c).mapValues(_ => Set[Instances]())) |+| convertFieldmap(refRels)
    val extracted = CMem(stack, CHeap(typeMap, childMap, refMap))
    GarbageCollection.gc(extracted, resetlocs = true)
  }


  private[semantics]
  val typeInference = new TypeInference(defs)
}
