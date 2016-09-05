package examples

import semantics.domains._
import syntax.ast._

/**
  * Created by asal on 06/03/2016.
  */
trait SimpleBoxExample extends Example {

  override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
    ClassDefinition("IntBox", Map(), Map("unbox" -> FieldDefinition(Class("Int"), Req, Ordinary)))
  )

  override val pres: Set[SMem] = {
    val stack = Map("x" -> SetLit(Seq(Symbol(-1))), "y" -> SetLit(Seq(Symbol(-2))))
    Set(
      SMem(SStack.initial(Set(), stack),
        SHeap.initial(Map(), Map(Symbol(-1) -> UnknownLoc(Class("IntBox"), Set()),
          Symbol(-2) -> UnknownLoc(Class("IntBox"), Set())), Map(), Map(), Set()) )
    )
  }


}

object SimpleBoxSequentialLoadingExample extends SimpleBoxExample {
  import Statement._

  override val prog: Statement = stmtSeq(
      loadField("z", Var("x"), "unbox"),
      loadField("z", Var("y"), "unbox")
  )
}

object SimpleBoxBranchingLoadingExample extends SimpleBoxExample {
  import Statement._

  override val prog: Statement = `if`(Eq(Var("x"), Var("y")),
    loadField("z", Var("y"), "unbox")
    , loadField("z", Var("x"), "unbox")
  )
}

object SimpleBoxLoadingBranchingExample extends SimpleBoxExample {
  import Statement._

  override val prog: Statement = stmtSeq(
    loadField("z", Var("x"), "unbox"),
    `if`(Eq(Var("x"), Var("y")), stmtSeq(), stmtSeq())
  )
}
