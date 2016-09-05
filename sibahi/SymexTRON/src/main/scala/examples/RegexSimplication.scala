package examples

import semantics.domains.{SSymbolDesc, SHeap, SStack, SMem}
import syntax.ast.Statement._
import syntax.ast._


trait RegexSimplication extends Example {
  override val beta = 3

  override val classDefs =
    Shared.stdClassDefs ++
    Set (
      ClassDefinition("Regex", Map(), Map()),
      ClassDefinition("RegexRef", Map("value" -> FieldDefinition(Class("Regex"), Req, Ordinary)), Map()),
      ClassDefinition("Char", Map(), Map(), superclass = Some(Class("Regex"))),
      ClassDefinition("CharA", Map(), Map(), superclass = Some(Class("Char"))),
      ClassDefinition("CharB", Map(), Map(), superclass = Some(Class("Char"))),
      ClassDefinition("CharC", Map(), Map(), superclass = Some(Class("Char"))),
      ClassDefinition("Epsilon", Map(), Map(), superclass = Some(Class("Regex"))),
      ClassDefinition("Alt", Map("left" -> FieldDefinition(Class("RegexRef"), Req, Ordinary),
                                 "right" -> FieldDefinition(Class("RegexRef"), Req, Ordinary)), Map(), superclass = Some(Class("Regex"))),
      ClassDefinition("Seq", Map("left" -> FieldDefinition(Class("RegexRef"), Req, Ordinary),
                                 "right" -> FieldDefinition(Class("RegexRef"), Req, Ordinary)), Map(), superclass = Some(Class("Regex"))),
      ClassDefinition("Star", Map("inner" -> FieldDefinition(Class("RegexRef"), Req, Ordinary)), Map(), superclass = Some(Class("Regex")))
    )
  override val pres: Set[SMem] = Set(
    SMem(SStack.initial(Set(), Map("regex" -> SetSymbol(-1))),
      SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("RegexRef"), Set(), Req)),Map(),Map(), Map(), Set()))
  )
}


// Relies on deep `equivalence` feature, which is currently unsupported
object RegexAltSimplification extends RegexSimplication {
  override val excludedBranches = Set(BranchPoint(0,0), BranchPoint(3,2))

  override val prog: Statement = {
    `for`("r_ref", MatchStar(Var("regex"), Class("RegexRef")), stmtSeq(
      loadField("r", Var("r_ref"), "value"),
      `for`("alt", Match(Var("r"), Class("Alt")), stmtSeq(
        loadField("alt_r", Var("alt"), "right"),
        loadField("alt_l", Var("alt"), "left"),
        loadField("alt_r_value", Var("alt_r"), "value"),
        loadField("alt_l_value", Var("alt_l"), "value"),
        `if`(equiv(Var("alt_r_value"), Var("alt_l_value")), stmtSeq(
          assignField(Var("r_ref"), "value", Var("alt_r_value"))
        ), stmtSeq())
      ))
    ))
  }
}

object RegexEpsSeqSimplification extends RegexSimplication {
  override val excludedBranches = Set(BranchPoint(0,0), BranchPoint(3,2), BranchPoint(9,2))

  override val prog: Statement = {
    `for`("r_ref", MatchStar(Var("regex"), Class("RegexRef")), stmtSeq(
      loadField("r", Var("r_ref"), "value"),
      `for`("seq", Match(Var("r"), Class("Seq")), stmtSeq(
        loadField("seq_r", Var("seq"), "right"),
        loadField("seq_l", Var("seq"), "left"),
        loadField("seq_r_value", Var("seq_r"), "value"),
        loadField("seq_l_value", Var("seq_l"), "value"),
        `for`("_", Match(Var("seq_r_value"), Class("Epsilon")), stmtSeq(
          assignField(Var("r_ref"), "value", Var("seq_l_value"))
        ))
      ))
    ))
  }
}

object RegexStarSimplification extends RegexSimplication {
  override val excludedBranches = Set(BranchPoint(0,0), BranchPoint(3,2), BranchPoint(9,2), BranchPoint(10,2))

  override val prog: Statement = {
    `for`("r_ref", MatchStar(Var("regex"), Class("RegexRef")), stmtSeq(
      loadField("r", Var("r_ref"), "value"),
      `for`("seq", Match(Var("r"), Class("Seq")), stmtSeq(
        loadField("seq_r", Var("seq"), "right"),
        loadField("seq_l", Var("seq"), "left"),
        loadField("seq_r_value", Var("seq_r"), "value"),
        loadField("seq_l_value", Var("seq_l"), "value"),
        `for`("star", Match(Var("seq_l_value"), Class("Star")),
          `for`("alt", Match(Var("seq_r_value"), Class("Alt")), stmtSeq(
            loadField("alt_r", Var("alt"), "right"),
            loadField("alt_l", Var("alt"), "left"),
            loadField("alt_r_value", Var("alt_r"), "value"),
            loadField("alt_l_value", Var("alt_l"), "value"),
            loadField("star_i", Var("star"), "inner"),
            loadField("star_i_value", Var("star_i"), "value"),
            `for`("_", Match(Var("alt_r_value"), Class("Epsilon")),
              `if`(equiv(Var("star_i_value"), Var("alt_l_value")),
                assignField(Var("r_ref"), "value", Var("star_i_value")),
                stmtSeq()
            )))
        )
      ))
    )))
  }
}
