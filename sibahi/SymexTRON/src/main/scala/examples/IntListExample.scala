package examples

import semantics.domains._
import syntax.ast._
import syntax.ast.Statement._

/**
  * Created by asal on 15/01/2016.
  */
trait IntListExample extends Example {
  override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
    new ClassDefinition("IntList", Map("next" -> FieldDefinition(Class("IntList"), Opt, Ordinary)),
                                   Map("data" -> FieldDefinition(Class("Int"), Req, Ordinary)))
  )

}

object IntListContainsElementExample extends IntListExample {
  override val pres: Set[SMem] = {
    val stack = Map("list" -> SetSymbol(-1), "elem" -> SetLit(Seq(Symbol(-2))))
    Set(
      SMem(SStack.initial(Set(),stack),
        SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("IntList"), Set(), Opt)), Map(Symbol(-2) -> UnknownLoc(Class("Int"), Set())), Map(), Map(), Set()))
    )
  }
  override val prog: Statement = stmtSeq(
    assignVar("containselem", SetLit(Seq()))
    , `for`("sublist", MatchStar(Var("list"), Class("IntList")), stmtSeq(
      loadField("sublist_data", Var("sublist"), "data")
      ,`if`(Eq(Var("elem"), Var("sublist_data"))
        , `new`("containselem", Class("Any"))
        , stmtSeq())
    ))
  )
}

object IntListHeadTailEqExample extends IntListExample {
  override val pres: Set[SMem] = {
    val stack = Map("list" -> SetSymbol(-1))
    Set(
      SMem(SStack.initial(Set(),stack),
        SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("IntList"), Set(), Opt)), Map(), Map(), Map(), Set()))
    )
  }
  override val prog: Statement = `if`(Eq(Var("list"), SetLit(Seq())),
      `new`("res", Class("Any"))
    , stmtSeq(
        loadField("head", Var("list"), "data")
      , loadField("list_next", Var("list"), "next")
      , `if`(Eq(Var("list_next"), SetLit(Seq())),
          `new`("res", Class("Any"))
        , stmtSeq(fix(Var("list_next"), stmtSeq(
             loadField("list_next_next", Var("list_next"), "next")
          , `if`(Eq(Var("list_next_next"), SetLit(Seq())),
                loadField("tail", Var("list_next"), "data")
              , assignVar("list_next", Var("list_next_next"))
            ))
          )
        , `if`(Eq(Var("head"), Var("tail")),
            `new`("res", Class("Any")),
             assignVar("res", SetLit(Seq()))
           ))
        )
      )
    )
}
