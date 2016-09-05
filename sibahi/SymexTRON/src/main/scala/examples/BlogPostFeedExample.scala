package examples

import semantics.domains._
import syntax.ast._
import syntax.ast.Statement._

/**
  * Created by asal on 15/01/2016.
  */
trait BlogPostFeedExample extends Example {
  override val pres: Set[SMem] = {
    val stack = Map("post" -> SetLit(Seq(Symbol(-1))))
    Set(
      SMem(SStack.initial(Set(), stack), SHeap.initial(Map(), Map(Symbol(-1) -> UnknownLoc(Class("Post"), Set())), Map(), Map(), Set()))
    )
  }

  override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
      ClassDefinition("Title", Map(), Map("value" -> FieldDefinition(Class("String"), Req, Ordinary)))
    , ClassDefinition("CapitalisedTitle", Map(), Map(), Some(Class("Title")))
    , ClassDefinition("Timestamp", Map(), Map("value" -> FieldDefinition(Class("Int"), Req, Ordinary)))
    , ClassDefinition("Post", Map(), Map())
    , ClassDefinition("SinglePost", Map("title" -> FieldDefinition(Class("Title"), Req, Ordinary),
                                        "timestamp" -> FieldDefinition(Class("Timestamp"), Req, Ordinary)), Map(), Some(Class("Post")))
    , ClassDefinition("AggregatePost", Map("content" -> FieldDefinition(Class("Post"), ManyOpt, Ordinary)), Map(), Some(Class("Post")))
  )
}

object BlogPostFeedTimestampsExample extends BlogPostFeedExample {
  override val prog: Statement = stmtSeq(
     assignVar("timestamps", SetLit(Seq()))
   , `for`("ts", MatchStar(Var("post"), Class("Timestamp")), stmtSeq(
        assignVar("timestamps", Union(Var("timestamps"), Var("ts")))
    ))
  )
}

object BlogPostFeedCapitaliseTitlesExample extends BlogPostFeedExample {
  override val prog: Statement = `for`("sp", MatchStar(Var("post"), Class("SinglePost")), stmtSeq(
      loadField("sp_title", Var("sp"), "title")
    , loadField("sp_title_value", Var("sp_title"), "value")
    , `new`("new_sp_title", Class("CapitalisedTitle"))
    , assignField(Var("new_sp_title"), "value", Var("sp_title_value"))
    , assignField(Var("sp"), "title", Var("new_sp_title"))
  ))
}