package semantics

import helper.Counter
import semantics.domains.SHeap._
import semantics.domains.SpatialDesc._
import semantics.domains._
import syntax.ast._

import scalaz.concurrent.Task
import scalaz.stream._
import scalaz._, Scalaz._

import helper._

/**
  * Created by asal on 10/03/2016.
  */
class LazyInitializer(symcounter: Counter, loccounter: Counter, defs: Map[Class, ClassDefinition], optimistic: Boolean = false) {
  private
  def mkAbstractSpatialDesc(loc : Loc, cl : Class, notinstof : Set[Class], heap: SHeap): (SpatialDesc, SHeap) = {
    val clSupers = defs.supertypes(cl)
    val (newssvltionc, children) = unfoldFieldSet(loc, defs.childrenOf(clSupers))
    val (newssvltionr, refs) = unfoldFieldSet(loc, defs.refsOf(clSupers))
    (SpatialDesc(cl, notinstof, AbstractDesc, children, refs, Map()), _sh_ssvltion.modify(_ ++ newssvltionc ++ newssvltionr)(heap))
  }

  def findLocs(syms: Seq[Symbol], excluded: Set[Loc], heap: SHeap): Process0[String \/ (Seq[Loc], SHeap)] = {
    def relevantLocs(nheap: SHeap, cl: Class, notinstof: Set[Class]): Set[Loc] = {
      // TODO: Filter safely
      nheap.locOwnership.filter { case (loc, ownership) => ownership match {
        case Unfolded => true
        case NewlyCreated => false
      }
      }.filter { case (loc, _) => defs.subtypesOrSelf(cl).contains(nheap.currentSpatial(loc).cl) &&
         !notinstof.any(notc => defs.subtypesOrSelf(notc).contains(nheap.currentSpatial(loc).cl)) }.keySet.diff(excluded)
    }
    def addNewLoc(sym: Symbol, newLoc: Loc, sdesc: SpatialDesc, ownership: Ownership, nheap: SHeap): SHeap = {
      val nnheap = (_sh_svltion.modify(_ + (sym -> Loced(newLoc))) andThen
        _sh_locOwnership.modify(_ + (newLoc -> ownership)) andThen
        _sh_initSpatial.modify(_ + (newLoc -> sdesc)) andThen
        _sh_currentSpatial.modify(_ + (newLoc -> sdesc))) (nheap)
      nnheap
    }
    def assignLoc(sym: Symbol, excluded: Seq[Loc], cl: Class, notinstof: Set[Class], heap: SHeap): Process0[String \/ (Loc, SHeap)] = {
      val newLoc = Loc(loccounter.++)
      val (sdesc, nheap) = mkAbstractSpatialDesc(newLoc, cl, notinstof, heap)
      // TODO Think if relevantLocs need updating after negative constraints were added to locs
      val aliasLocs = relevantLocs(nheap, cl, notinstof) diff excluded.toSet
      val nnheap: SHeap = addNewLoc(sym, newLoc, sdesc, Unfolded, nheap)
      Process((newLoc, nnheap).right) ++
        (for (loc <- Process.emitAll(aliasLocs.toSeq)) yield {
          (loc, (_sh_initSpatial.modify(sp => sp.updated(loc, sp(loc).copy(notinstof = sp(loc).notinstof ++ notinstof))) `andThen`
                  _sh_currentSpatial.modify(sp => sp.updated(loc, sp(loc).copy(notinstof = sp(loc).notinstof ++ notinstof))) `andThen`
                   _sh_svltion.modify(_ + (sym -> Loced(loc))))(nheap)).right
        })
    }
    syms.foldLeft(EitherT.right[Process0, String, (Seq[Loc], SHeap)](Process((Seq[Loc](), heap)))) { (st, sym) =>
      heap.svltion.get(sym).cata({
        case Loced(l) =>
          for {
            (locs, heap) <- st
          } yield (locs :+ l, heap)
        case UnknownLoc(cl, notinstof) =>
          for {
            (locs, heap) <- st
            (loc, nheap) <- EitherT(assignLoc(sym, locs, cl, notinstof, heap))
          } yield (locs :+ loc, nheap)
      }, EitherT.left[Process0, String, (Seq[Loc], SHeap)](Process(s"No such symbol: $sym")))
    }.run
  }

  def unfoldFieldSet(loc: Loc, fieldSet: Map[Fields, FieldDefinition]): (SetSymbolValuation, Map[Fields, SetExpr[IsSymbolic.type]]) = {
    fieldSet.foldLeft((Map(): SetSymbolValuation, Map[Fields, SetExpr[IsSymbolic.type]]())) { (st, fieldkv) =>
      val (svltion, fields) = st
      fieldkv match {
        case (f, FieldDefinition(cl, crd, ft)) =>
          ft match {
            case Tracking =>
              (svltion, fields + (f -> SetLit(Seq())))
            case _ =>
              val sym = SetSymbol(symcounter.++)
              (svltion + (sym -> SSymbolDesc(cl, Set(), crd)), fields + (f -> sym))
          }
      }
    }
  }

  def unfold(loc: Loc, targetField : Fields, heap: SHeap): Process0[String \/ (SpatialDesc, SHeap)] = {
    def containsTargetField(psdesc: SpatialDesc): Boolean = {
      psdesc.children.contains(targetField) || psdesc.refs.contains(targetField)
    }
    def unfoldPartial(c: Class, notinstof: Set[Class], dt: PartialDesc, children: Map[Fields, SetExpr[IsSymbolic.type]],
                      refs: Map[Fields, SetExpr[IsSymbolic.type]], descendantpool: DescendantPools, heap: SHeap): Process0[String \/ (SpatialDesc, SHeap)] = {
      val err = Process(s"Location ${PrettyPrinter.pretty(loc)} of type ${c.name} has no field $targetField".left)
      if (!optimistic) {
        err }
      else {
        (if(dt.hasExact) err else Process()) ++ (for {
          nc <- EitherT[Process0,String,Class](Process.emitAll(dt.possible.toSeq).map(_.right))
          cd <- EitherT[Process0, String, ClassDefinition](defs.get(nc).cata(_.right, s"No such class: ${nc.name}".left).point[Process0])
          (psdesc, nheap) = unfoldAbstract(SpatialDesc(c, notinstof, AbstractDesc, children, refs, descendantpool), cd, heap)
          res <- EitherT[Process0, String, (SpatialDesc, SHeap)](
            if (containsTargetField(psdesc)) (psdesc, nheap).right.point[Process0]
              // TODO Something smelly here, look at it when having time (we don't use it in evaluation so not so important now)
            else unfoldPartial(psdesc.cl, psdesc.notinstof, psdesc.desctype.asInstanceOf[PartialDesc], psdesc.children, psdesc.refs, psdesc.descendantpools, nheap))
        } yield res).run
      }
    }
    def unfoldAbstract(sdesc: SpatialDesc, cd: ClassDefinition, heap: SHeap): (SpatialDesc, SHeap) = {
      val (newsslvtionc, newchildren) = unfoldFieldSet(loc, cd.children ++ cd.refs)
      val (newsslvtionr, newrefs) = unfoldFieldSet(loc, cd.refs)
      val psdesctype = PartialDesc(hasExact = true, defs.directSubtypes(sdesc.cl))
      val pschildren = sdesc.children ++ newchildren
      val psrefs = sdesc.refs ++ newrefs
      val psdesc = (_sd_desctype.set(psdesctype) andThen
        _sd_children.set(pschildren) andThen
        _sd_refs.set(psrefs)) (sdesc)
      val nheap = (_sh_currentSpatial.modify(_ + (loc -> psdesc)) andThen
        _sh_initSpatial.modify(_ + (loc -> psdesc)) andThen
        _sh_ssvltion.modify(_ ++ newsslvtionc ++ newsslvtionr))(heap)
      (psdesc, nheap)
    }
    heap.currentSpatial.get(loc).cata({ sdesc =>
      if (containsTargetField(sdesc)) Process((sdesc, heap).right)
      else sdesc.desctype match {
        case ExactDesc => Process(s"Location ${PrettyPrinter.pretty(loc)} of type ${sdesc.cl.name} has no field $targetField".left)
        case AbstractDesc =>
          defs.get(sdesc.cl).cata({ cd =>
            val (psdesc, nheap) = unfoldAbstract(sdesc, cd, heap)
            if (containsTargetField(psdesc)) Process((psdesc, nheap).right)
            else unfoldPartial(psdesc.cl, psdesc.notinstof, psdesc.desctype.asInstanceOf[PartialDesc], psdesc.children, psdesc.refs, psdesc.descendantpools, nheap)
          }, Process(s"No such class: ${sdesc.cl.name}".left))
        case dt@PartialDesc(hasExact, possible) => unfoldPartial(sdesc.cl, sdesc.notinstof, dt, sdesc.children, sdesc.refs, sdesc.descendantpools, heap)
      }
    }, Process(s"No such location: ${PrettyPrinter.pretty(loc)}".left))
  }

}
