package examples

import semantics.domains._
import syntax.ast.Statement._
import syntax.ast._


/**
  * Created by asal on 15/01/2016.
  */
trait FSM extends Example {
  override val wellRooted = true

  override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
    ClassDefinition("Model", Map("machines" -> FieldDefinition(Class("FiniteStateMachine"), ManyOpt, Ordinary)),
                             Map(),
                             superclass = Some(Class("NamedElement"))),
    ClassDefinition("NamedElement", Map(), Map("name" -> FieldDefinition(Class("String"), Req, Ordinary)), isAbstract = true),
    ClassDefinition("FiniteStateMachine", Map("states" -> FieldDefinition(Class("State"), ManyReq, Bidirectional(oppositeOf = "machine"))),
                                          Map("initial" -> FieldDefinition(Class("State"), Req, Ordinary)),
      superclass = Some(Class("NamedElement"))),
    ClassDefinition("State", Map("leavingTransitions" -> FieldDefinition(Class("Transition"), ManyOpt, Bidirectional(oppositeOf = "source"))),
                             Map("machine" -> FieldDefinition(Class("FiniteStateMachine"), Req, Bidirectional(oppositeOf = "states")) ),
      superclass = Some(Class("NamedElement"))),
    ClassDefinition("Transition", Map(), Map("source" -> FieldDefinition(Class("State"), Req, Bidirectional(oppositeOf = "leavingTransitions")),
                                             "target" -> FieldDefinition(Class("State"), Req, Ordinary),
                                             "input" -> FieldDefinition(Class("String"), Req, Ordinary),
                                             "output" -> FieldDefinition(Class("String"), Opt, Ordinary)))
  )

  override val pres: Set[SMem] = {
    val stack = Map("model" -> SetSymbol(-1), "idleString" -> SetSymbol(-2))
    Set(
      SMem(SStack.initial(Set("model"), stack),
        SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("Model"), Set(), Req),
          SetSymbol(-2) -> SSymbolDesc(Class("String"), Set(), Req)), Map(), Map(), Map(), Set()))
    )
  }
}

object CheckMachineSeparation1 extends FSM {
  override val excludedBranches = Set(BranchPoint(6,0))

  override val prog: Statement = stmtSeq(
    `new`("isValid", Class("Any")),
    loadField("model_machines", Var("model"), "machines"),
    `for`("fsm", MSet(Var("model_machines")), stmtSeq(
      loadField("fsm_states", Var("fsm"), "states"),
      `for`("state", MSet(Var("fsm_states")), stmtSeq(
        loadField("state_leavingTransitions", Var("state"), "leavingTransitions"),
        `for`("transition", MSet(Var("state_leavingTransitions")), stmtSeq(
          loadField("transition_target", Var("transition"), "target"),
          `if`(SetSubEq(Var("transition_target"), Var("fsm_states")), stmtSeq(), assignVar("isValid", SetLit(Seq())))
        ))
      ))
    ))
  )
}

object CheckMachineSeparation2 extends FSM {
  override val prog: Statement = stmtSeq(
    `new`("isValid", Class("Any")),
    `for`("transition", MatchStar(Var("model"), Class("Transition")), stmtSeq(
      loadField("transition_source", Var("transition"), "source"),
      loadField("transition_source_machine", Var("transition_source"), "machine"),
      loadField("transition_target", Var("transition"), "target"),
      loadField("transition_target_machine", Var("transition_target"), "machine"),
      `if`(Eq(Var("transition_source_machine"), Var("transition_target_machine")), stmtSeq(), assignVar("isValid", SetLit(Seq())))
    ))
  )
}

object AddIdleLoops1 extends FSM {
  override val prog: Statement = `for`("state", MatchStar(Var("model"), Class("State")), stmtSeq(
    `new`("idleTransition", Class("Transition")),
    loadField("state_leavingTransitions", Var("state"), "leavingTransitions"),
    assignField(Var("state"), "leavingTransitions", Union(Var("state_leavingTransitions"), Var("idleTransition"))),
    assignField(Var("idleTransition"), "source", Var("state")),
    assignField(Var("idleTransition"), "target", Var("state")),
    assignField(Var("idleTransition"), "input", Var("idleString"))
  ))
}


object AddIdleLoops2 extends FSM {
  override val prog: Statement = `for`("state", MatchStar(Var("model"), Class("State")), stmtSeq(
    assignVar("hasIdle", SetLit(Seq())),
    `for`("transition", MatchStar(Var("state"), Class("Transition")), stmtSeq(
      loadField("transition_input", Var("transition"), "input"),
      `if`(Eq(Var("transition_input"), Var("idleString")), `new`("hasIdle", Class("Any")) , stmtSeq())
    )), `if`(Eq(Var("hasIdle"), SetLit(Seq())), stmtSeq(
          `new`("idleTransition", Class("Transition")),
          loadField("state_leavingTransitions", Var("state"), "leavingTransitions"),
          assignField(Var("state"), "leavingTransitions", Union(Var("state_leavingTransitions"), Var("idleTransition"))),
          assignField(Var("idleTransition"), "source", Var("state")),
          assignField(Var("idleTransition"), "target", Var("state")),
          assignField(Var("idleTransition"), "input", Var("idleString"))
       ), stmtSeq())
  ))
}