package syntax

import helper._
import scalaz._, Scalaz._

package object ast {
  type Fields = String
  type Vars = String
  type Symbols = Int

  def not[T <: ASTType](p : BoolExpr[T]) : BoolExpr[T] = p match {
    case Not(Not(p)) => not(p)
    case Not(p) => p
    case p => Not(p)
  } //Smart constructor

  def or[T <: ASTType](p1 : BoolExpr[T], p2 : BoolExpr[T]): BoolExpr[T] = Not(And(Not(p1), Not(p2)))

  def equiv[T <: ASTType](e1: SetExpr[T], e2: SetExpr[T])(implicit t: T): BoolExpr[T]
    = And(BagSubEquiv[Any, T](ASTType.elim(None : Option[Any], ()), e1, e2), BagSubEquiv[Any, T](ASTType.elim(None : Option[Any], ()), e2, e1))

  implicit class RichDefs(defs: Map[Class, ClassDefinition]){
    val childfields: Set[Fields] = defs.values.flatMap(_.children.keys).toSet
    val reffields: Set[Fields]   = defs.values.flatMap(_.refs.keys).toSet

    // Consolidate supertypes and subtypes fields

    def maxClass(c: Class, c2: Class): Option[Class] = {
      if (subtypesOrSelf(c).contains(c2)) c.some
      else if (subtypesOrSelf(c2).contains(c)) c2.some
      else none
    }

    def minClass(c: Class, c2: Class): Option[Class] = {
      if (subtypesOrSelf(c).contains(c2)) c2.some
      else if (subtypesOrSelf(c2).contains(c)) c.some
      else none
    }

    def lub(c: Class, c2: Class): Class = {
      maxClass(c, c2).cata(identity,
        (supertypes(c) intersect supertypes(c2)).foldLeft(none[Class])({ (st, c) =>
          st.cata(c2 => minClass(c, c2), c.some)
        }).get
      )
    }

    def childrenOf(cs: Set[Class]): Map[Fields, FieldDefinition] = cs.map(defs).flatMap(_.children).toMap

    def refsOf(cs: Set[Class]): Map[Fields, FieldDefinition] = cs.map(defs).flatMap(_.refs).toMap

    def fieldType(c : Class, f : Fields): Option[FieldDefinition] = {
      val selforsupers = Set(c) ++ supertypes(c)
      (childrenOf(selforsupers) ++ refsOf(selforsupers)).get(f)
    }

    def supertypes(c : Class): Set[Class] = {
      defs(c).superclass.toSet.|>(s => s ++ s.flatMap(supertypes)) + Class("Any")
    }

    def definingClass(c : Class, f : Fields): Class = {
      if (defs(c).children.contains(f) || defs(c).refs.contains(f)) c
      else definingClass(defs(c).superclass.get, f)
    }

    val directSubtypes: Map[Class, Set[Class]] = defs.mapValues(_ => Set[Class]()) ++ {
      defs.values.foldLeft(Map[Class, Set[Class]]())((m : Map[Class, Set[Class]], cd: ClassDefinition) =>
        cd.superclass.cata(sup => m.adjust(sup)(_ + Class(cd.name)), m)
      )
    } + (Class("Any") -> defs.values.toSet.filter(c => c.name != "Any" && c.superclass.isEmpty).map(c => Class(c.name)))

    val subtypes: Map[Class, Set[Class]] = directSubtypes.trans()

    val subtypesOrSelf: Map[Class, Set[Class]] =
      subtypes.map(((c : Class, sts : Set[Class]) => (c, sts + c)).tupled)

    {
      val commoncr = childfields intersect reffields
      assert(commoncr.isEmpty, s"There are overlapping names used for fields and references: ${commoncr.mkString(", ")}")
    }
  }
}
