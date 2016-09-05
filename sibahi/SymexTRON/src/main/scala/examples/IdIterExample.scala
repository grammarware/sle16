package examples

import semantics.domains._
import syntax.ast.Statement._
import syntax.ast._

/**
  * Created by asal on 15/01/2016.
  */
object IdIterExample extends Example {
  override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
    ClassDefinition("IntSet", Map("data" -> FieldDefinition(Class("Int"), ManyOpt, Ordinary)), Map())
  )

  override val pres: Set[SMem] = {
    val stack = Map("X" -> SetSymbol(-1))
    Set(
      SMem(SStack.initial(Set(), stack),
        SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("IntSet"), Set(), ManyOpt)), Map(), Map(), Map(), Set()))
    )
  }

  override val prog: Statement = stmtSeq(
     assignVar("Y", SetLit(Seq()))
   , `for`("x", MSet(Var("X")), stmtSeq(
        assignVar("Y", Union(Var("x"), Var("Y")))
    ))
  )
}
