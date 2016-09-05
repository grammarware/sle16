package examples

import semantics.domains._
import syntax.ast
import syntax.ast._
import syntax.ast.Statement._

/**
  * Created by asal on 25/05/2016.
  */
trait ATLModelZooTransformation extends Example { }

// This example is a bit traditionalist, but we wanted to pick something from the transformation Zoo
object FamiliesToPersonsTransformation extends ATLModelZooTransformation {
  override val wellRooted = true
  override val delta = 6
  override val beta = 3
  override val excludedBranches = Set(BranchPoint(2,1) /* There must be at least two members (father and mother) in each family */
    , BranchPoint(22,0) /* Not female means not mother */, BranchPoint(24,1) /* Not female means not daughter */,
      BranchPoint(40,0) /* Female means not father */, BranchPoint(44,0) /* Female means not son */)
  override val classDefs = Shared.stdClassDefs ++ Set(
    // Family meta-model
    ClassDefinition("Family", Map("father" -> FieldDefinition(Class("Member"), Req, Bidirectional(oppositeOf = "familyFather")),
      "mother" -> FieldDefinition(Class("Member"), Req, Bidirectional(oppositeOf = "familyMother")),
      "sons" -> FieldDefinition(Class("Member"), ManyOpt, Bidirectional(oppositeOf = "familySon")),
      "daughters" -> FieldDefinition(Class("Member"), ManyOpt, Bidirectional(oppositeOf = "familyDaughter"))),
      Map("lastName" -> FieldDefinition(Class("String"), Req, Ordinary))),
    ClassDefinition("Member", Map(), Map("firstName" -> FieldDefinition(Class("String"), Req, Ordinary),
      "familyFather" -> FieldDefinition(Class("Family"), Opt, Bidirectional(oppositeOf = "father")),
      "familyMother" -> FieldDefinition(Class("Family"), Opt, Bidirectional(oppositeOf = "mother")),
      "familySon" -> FieldDefinition(Class("Family"), Opt, Bidirectional(oppositeOf = "sons")),
      "familyDaughter" -> FieldDefinition(Class("Family"), Opt, Bidirectional(oppositeOf = "daughters")))),
    // Person meta-model
    ClassDefinition("Person", Map(), Map("fullName" -> FieldDefinition(Class("String"), Req, Ordinary)), isAbstract = true),
    ClassDefinition("Male", Map(), Map(), superclass = Some(Class("Person"))),
    ClassDefinition("Female", Map(), Map(), superclass = Some(Class("Person")))
  )
  override val pres: Set[SMem] = Set(SMem(SStack.initial(Set("families"), Map("families" -> SetSymbol(-1))),
    SHeap.initial(Map(SetSymbol(-1) -> SSymbolDesc(Class("Family"), Set(), ManyOpt)), Map(), Map(), Map(), Set())))
  override val prog: Statement = {
    def isFemaleHelper(self: SetExpr[IsProgram.type], outVar: Vars): Statement = stmtSeq(
      loadField("self_familyMother", self, "familyMother"),
      loadField("self_familyDaughter", self, "familyDaughter"),
      `if`(Not(Eq(Var("self_familyMother"), SetLit(Seq()))),
        `new`(outVar, Class("Any")),
        `if`(Not(Eq(Var("self_familyDaughter"), SetLit(Seq()))),
          `new`(outVar, Class("Any")),
          assignVar(outVar, SetLit(Seq()))
        )
      )
    )
    def familyNameHelper(self: SetExpr[IsProgram.type], outVar: Vars): Statement = stmtSeq(
      loadField("self_familyFather", self, "familyFather"),
      loadField("self_familyMother", self, "familyMother"),
      loadField("self_familySon", self, "familySon"),
      loadField("self_familyDaughter", self, "familyDaughter"),
      `if`(Not(Eq(Var("self_familyFather"), SetLit(Seq()))),
        loadField(outVar, Var("self_familyFather"), "lastName"),
        `if`(Not(Eq(Var("self_familyMother"), SetLit(Seq()))),
          loadField(outVar, Var("self_familyMother"), "lastName"),
          `if`(Not(Eq(Var("self_familySon"), SetLit(Seq()))),
            loadField(outVar, Var("self_familySon"), "lastName"),
            loadField(outVar, Var("self_familyDaughter"), "lastName")
          )
        ))
    )
    stmtSeq(
    assignVar("persons", SetLit(Seq())),
      `for`("member", MatchStar(Var("families"), Class("Member")), stmtSeq(
        isFemaleHelper(Var("member"), "isFemale"),
        `if`(Not(Eq(Var("isFemale"), SetLit(Seq()))),
          stmtSeq(
            `new`("female", Class("Female")),
            familyNameHelper(Var("member"), "familyName"),
            loadField("member_firstName", Var("member"), "firstName"),
            `new`("fullName", Class("Concat")),
            assignField(Var("fullName"), "s1", Var("member_firstName")),
            assignField(Var("fullName"), "s2", Var("familyName")),
            assignField(Var("female"), "fullName", Var("fullName")),
            assignVar("persons", Union(Var("persons"), Var("female")))
          ),
          stmtSeq(
            `new`("male", Class("Male")),
            familyNameHelper(Var("member"), "familyName"),
            loadField("member_firstName", Var("member"), "firstName"),
            `new`("fullName", Class("Concat")),
            assignField(Var("fullName"), "s1", Var("member_firstName")),
            assignField(Var("fullName"), "s2", Var("familyName")),
            assignField(Var("male"), "fullName", Var("fullName")),
            assignVar("persons", Union(Var("persons"), Var("male")))
          )
        )
      ))
    )
    }
  }

  object ClassToRelationalTransformation extends ATLModelZooTransformation {
    override val delta = 6

    override val wellRooted = true

    override val excludedBranches = Set(BranchPoint(22,2), BranchPoint(54,2))

    override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
      // Class meta-model
      ClassDefinition("NamedElt", Map(), Map("name" -> FieldDefinition(Class("String"), Req, Ordinary)), isAbstract = true),
      ClassDefinition("Classifier", Map(), Map(), superclass = Some(Class("NamedElt")), isAbstract = true),
      ClassDefinition("DataType", Map(), Map("_Type" -> FieldDefinition(Class("Type"), Opt, Tracking)), superclass = Some(Class("Classifier"))),
      ClassDefinition("Class", Map("attributes" -> FieldDefinition(Class("Attribute"), ManyOpt, Bidirectional(oppositeOf = "owner"))),
        Map("isAbstract" -> FieldDefinition(Class("Unit"), Opt, Ordinary),"super" -> FieldDefinition(Class("Class"), Opt, Ordinary), "_Table" -> FieldDefinition(Class("Table"), Opt, Tracking)), superclass = Some(Class("Classifier"))),
      ClassDefinition("Attribute", Map(),
        Map("isMultivalued" -> FieldDefinition(Class("Unit"), Opt, Ordinary), "type" -> FieldDefinition(Class("Classifier"), Req, Ordinary),
          "owner" -> FieldDefinition(Class("Class"), Req, Bidirectional(oppositeOf = "attributes")),
          "_Column" -> FieldDefinition(Class("Column"), Opt, Tracking)), superclass = Some(Class("NamedElt"))),
      ClassDefinition("Package", Map("classifiers" -> FieldDefinition(Class("Classifier"), ManyOpt, Ordinary)), Map()),
      // Relational meta-model
      ClassDefinition("Named", Map(), Map("name" -> FieldDefinition(Class("String"), Req, Ordinary)), isAbstract = true),
      ClassDefinition("Table", Map("columns" -> FieldDefinition(Class("Column"), ManyOpt, Ordinary)),
        Map("key" -> FieldDefinition(Class("Column"), Req, Ordinary)), superclass = Some(Class("Named"))),
      ClassDefinition("Column", Map(), Map("type" -> FieldDefinition(Class("Type"), Req, Ordinary)), superclass = Some(Class("Named"))),
      ClassDefinition("Type", Map(), Map(), superclass = Some(Class("Named"))),
      ClassDefinition("Schema", Map("tables" -> FieldDefinition(Class("Table"), ManyOpt, Ordinary), "types" -> FieldDefinition(Class("Type"), ManyOpt, Ordinary)), Map())
    )
    override val pres: Set[SMem] = Set(SMem(SStack.initial(Set("package", "integer_name"),Map("package" -> SetLit(Seq(Symbol(-1))),
      "integer_name" -> SetSymbol(-2))),
      SHeap.initial(Map(SetSymbol(-2) -> SSymbolDesc(Class("Int"), Set(), Req)), Map(Symbol(-1) -> UnknownLoc(Class("Package"), Set())), Map(), Map(), Set())))
    override val prog: Statement = {
      stmtSeq(
        `new`("objectIdType", Class("Type")),
        assignField(Var("objectIdType"), "name", Var("integer_name")),
        // Create new Schema to hold things
        `new`("schema", Class("Schema")),
        // rule DataType2Type
        `for`("dt", MatchStar(Var("package"), Class("DataType")), stmtSeq(
            loadField("dt_name", Var("dt"), "name"),
            `if`(Eq(Var("dt_name"), Var("integer_name")), stmtSeq(
                assignField(Var("dt"), "_Type", Var("objectIdType"))
              ), stmtSeq(
                `new`("type", Class("Type")),
                 assignField(Var("dt"), "_Type", Var("type")),
                 assignField(Var("type"), "name", Var("dt_name")),
                 loadField("schema_types", Var("schema"), "types"),
                 assignField(Var("schema"), "types", Union(Var("schema_types"), Var("type")))
              ))
        )),
        `new`("idString", Class("String")),
        `new`("objectIdString", Class("String")),
        `for`("at", MatchStar(Var("package"), Class("Attribute")), stmtSeq(
          loadField("at_type", Var("at"), "type"),
          loadField("at_isMultivalued", Var("at"), "isMultivalued"),
          `for`("_", Match(Var("at_type"), Class("DataType")),
            `if`(Eq(Var("at_isMultivalued"), SetLit(Seq())),
              // rule SingleValuedDataTypeAttribute2Column
              stmtSeq(
                loadField("at_name", Var("at"), "name"),
                loadField("at_type_Type", Var("at_type"), "_Type"),
                `new`("column", Class("Column")),
                assignField(Var("column"), "name", Var("at_name")),
                assignField(Var("column"), "type", Var("at_type_Type")),
                assignField(Var("at"), "_Column", Var("column"))
              ),
              // rule MultiValuedDataTypeAttribute2Column
              stmtSeq(
                loadField("at_owner", Var("at"), "owner"),
                loadField("at_owner_name", Var("at_owner"), "name"),
                loadField("at_name", Var("at"), "name"),
                loadField("at_type_Type", Var("at_type"), "_Type"),
                `new`("tableName", Class("Concat")),
                assignField(Var("tableName"), "s1", Var("at_owner_name")),
                assignField(Var("tableName"), "s2", Var("at_name")),
                `new`("idName", Class("Concat")),
                assignField(Var("idName"), "s1", Var("at_owner_name")),
                assignField(Var("idName"), "s2", Var("idString")),
                `new`("id", Class("Column")),
                assignField(Var("id"), "name", Var("idName")),
                assignField(Var("id"), "type", Var("objectIdType")),
                `new`("value", Class("Column")),
                assignField(Var("value"), "name", Var("at_name")),
                assignField(Var("value"), "type", Var("at_type_Type")),
                `new`("table", Class("Table")),
                assignField(Var("table"), "name", Var("tableName")),
                assignField(Var("table"), "key", Var("id")), // !!! Actually missing in example ATL transformation
                assignField(Var("table"), "columns", Union(Var("id"), Var("value"))),
                loadField("schema_tables", Var("schema"), "tables"),
                assignField(Var("schema"), "tables", Union(Var("schema_tables"), Var("table")))
              )
            )),
          `for`("_", Match(Var("at_type"), Class("Class")),
            `if`(Eq(Var("at_isMultivalued"), SetLit(Seq())),
              // rule ClassAttribute2Column
              stmtSeq(
                loadField("at_name", Var("at"), "name"),
                `new`("column_name", Class("Concat")),
                assignField(Var("column_name"), "s1", Var("at_name")),
                assignField(Var("column_name"), "s2", Var("idString")),
                `new`("column", Class("Column")),
                assignField(Var("column"), "name", Var("column_name")),
                assignField(Var("column"), "type", Var("objectIdType")),
                assignField(Var("at"), "_Column", Var("column"))
              ),
              // rule MultiValuedClassAttribute2Column
              stmtSeq(
                loadField("at_owner", Var("at"), "owner"),
                loadField("at_owner_name", Var("at_owner"), "name"),
                loadField("at_name", Var("at"), "name"),
                `new`("tableName", Class("Concat")),
                assignField(Var("tableName"), "s1", Var("at_owner_name")),
                assignField(Var("tableName"), "s2", Var("at_name")),
                `new`("idName", Class("Concat")),
                assignField(Var("idName"), "s1", Var("at_owner_name")),
                assignField(Var("idName"), "s2", Var("idString")),
                `new`("id", Class("Column")),
                assignField(Var("id"), "name", Var("idName")),
                assignField(Var("id"), "type", Var("objectIdType")),
                `new`("foreignKey", Class("Column")),
                assignField(Var("foreignKey"), "name", Var("at_name")),
                assignField(Var("foreignKey"), "type", Var("objectIdType")),
                `new`("table", Class("Table")),
                assignField(Var("table"), "name", Var("tableName")),
                assignField(Var("table"), "key", Var("id")), // !!! Actually missing in example ATL transformation
                assignField(Var("table"), "columns", Union(Var("id"), Var("foreignKey"))),
                loadField("schema_tables", Var("schema"), "tables"),
                assignField(Var("schema"), "tables", Union(Var("schema_tables"), Var("table")))
              )))
        )),
        // rule Class2Table
        `for`("class", MatchStar(Var("package"), Class("Class")), stmtSeq(
          loadField("class_name", Var("class"), "name"),
          loadField("class_attributes", Var("class"), "attributes"),
          `new`("key", Class("Column")),
          assignField(Var("key"), "name", Var("objectIdString")),
          assignField(Var("key"), "type", Var("objectIdType")),
          assignVar("cols", Var("key")),
          `for`("at", MSet(Var("class_attributes")), stmtSeq(
            loadField("at_isMultivalued", Var("at"), "isMultivalued"),
            `if`(Eq(Var("at_isMultivalued"), SetLit(Seq())),
              stmtSeq(
                loadField("at_Column", Var("at"), "_Column"),
                assignVar("cols", Union(Var("cols"), Var("at_Column")))
              ),
              stmtSeq()
          ))),
          `new`("table", Class("Table")),
          assignField(Var("table"), "name", Var("class_name")),
          assignField(Var("table"), "key", Var("key")),
          assignField(Var("table"), "columns", Var("cols")), // TODO Handle bidirectional assignment in executors
          loadField("schema_tables", Var("schema"), "tables"),
          assignField(Var("schema"), "tables", Union(Var("schema_tables"), Var("table")))
        ))
      )
    }
  }

  object PathExp2PetriNetTransformation extends ATLModelZooTransformation {
    override val delta = 6
    override val wellRooted = true
    // Particularly interesting because it requires an ordering of resolution of elements which I am not sure is supported
    // by other frameworks
    override val classDefs: Set[ClassDefinition] = Shared.stdClassDefs ++ Set(
      // Shared
      ClassDefinition("Element", Map(), Map("name" -> FieldDefinition(Class("String"), Req, Ordinary)), isAbstract = true),
      // PathExp meta-model
      ClassDefinition("PathExp", Map("transitions" -> FieldDefinition(Class("PETransition"), ManyOpt, Ordinary),
                                     "states" -> FieldDefinition(Class("State"), ManyReq, Ordinary)), Map(), superclass = Some(Class("Element"))),
      ClassDefinition("State", Map(), Map("outgoing" -> FieldDefinition(Class("PETransition"), ManyOpt, Bidirectional(oppositeOf = "source")),
                                          "incoming" -> FieldDefinition(Class("PETransition"), ManyOpt, Bidirectional(oppositeOf = "target")),
                                          "_Place" -> FieldDefinition(Class("Place"), Opt, Tracking))),
      ClassDefinition("PETransition", Map(), Map("source" -> FieldDefinition(Class("State"), Req, Bidirectional(oppositeOf = "outgoing")), // To avoid name clash
                                                 "target" -> FieldDefinition(Class("State"), Req, Bidirectional(oppositeOf = "incoming")),
                                                 "_PNTransition" -> FieldDefinition(Class("PNTransition"), Opt, Tracking),
                                                 "_PN_OA" -> FieldDefinition(Class("TransToPlaceArc"), Opt, Tracking),
                                                 "_PN_IA" -> FieldDefinition(Class("PlaceToTransArc"), Opt, Tracking)), superclass = Some(Class("Element"))),
      // PetriNet meta-model
      ClassDefinition("PetriNet", Map("transitions" -> FieldDefinition(Class("PNTransition"), ManyOpt, Ordinary),
                                      "arcs" -> FieldDefinition(Class("Arc"), ManyOpt, Ordinary),
                                      "places" -> FieldDefinition(Class("Place"), ManyReq, Ordinary)), Map(), superclass = Some(Class("Element"))),
      ClassDefinition("PNTransition", Map(), Map("outgoing" -> FieldDefinition(Class("TransToPlaceArc"), ManyOpt, Bidirectional(oppositeOf = "source")),
                                                 "incoming" -> FieldDefinition(Class("PlaceToTransArc"), ManyOpt, Bidirectional(oppositeOf = "target"))), superclass = Some(Class("Element"))), // To avoid name clash
      ClassDefinition("Place", Map(), Map("outgoing" -> FieldDefinition(Class("PlaceToTransArc"), ManyOpt, Bidirectional(oppositeOf = "source")),
                                          "incoming" -> FieldDefinition(Class("TransToPlaceArc"), ManyOpt, Bidirectional(oppositeOf = "target"))), superclass = Some(Class("Element"))),
      ClassDefinition("Arc", Map(), Map("weight" -> FieldDefinition(Class("Int"), Req, Ordinary)), superclass = Some(Class("Element"))),
      ClassDefinition("TransToPlaceArc", Map(), Map("source" -> FieldDefinition(Class("PNTransition"), Req, Bidirectional(oppositeOf = "outgoing")),
                                                    "target" -> FieldDefinition(Class("Place"), Req, Bidirectional(oppositeOf = "incoming"))), superclass = Some(Class("Arc"))),
      ClassDefinition("PlaceToTransArc", Map(), Map("source" -> FieldDefinition(Class("Place"), Req, Bidirectional(oppositeOf = "outgoing")),
                                                    "target" -> FieldDefinition(Class("PNTransition"), Req, Bidirectional(oppositeOf = "incoming"))), superclass = Some(Class("Arc")))
    )
    override val pres: Set[SMem] = Set(SMem(SStack.initial(Set("pe"),Map("pe" -> SetLit(Seq(Symbol(-1))))), SHeap.initial(Map(), Map(Symbol(-1) -> UnknownLoc(Class("PathExp"), Set())), Map(), Map(), Set())))
    override val prog: Statement = stmtSeq(
      assignVar("places", SetLit(Seq())),
      assignVar("transitions", SetLit(Seq())),
      `new`("emptyString", Class("Empty")),
      `new`("int1", Class("Int")),
      // rule State2Place -- Part 1 -- creating the places
      `for`("st", MatchStar(Var("pe"), Class("State")), stmtSeq(
        `new`("place", Class("Place")),
        assignField(Var("st"), "_Place", Var("place")),
        assignField(Var("place"), "name", Var("emptyString")),
        assignVar("places", Union(Var("places"), Var("place")))
      )),
      // rule Transition2Transition
      `for`("tr", MatchStar(Var("pe"), Class("PETransition")), stmtSeq(
        `new`("pntr", Class("PNTransition")),
        assignField(Var("tr"), "_PNTransition", Var("pntr")),
        loadField("tr_name", Var("tr"), "name"),
        assignField(Var("pntr"), "name", Var("tr_name")),
        `new`("pnia", Class("PlaceToTransArc")),
        assignField(Var("tr"), "_PN_IA", Var("pnia")),
        assignField(Var("pntr"), "incoming", Var("pnia")),
        loadField("tr_source", Var("tr"), "source"),
        loadField("tr_source_Place", Var("tr_source"), "_Place"),
        assignField(Var("pnia"), "source", Var("tr_source_Place")),
        assignField(Var("pnia"), "target", Var("pntr")),
        assignField(Var("pnia"), "weight", Var("int1")),
        `new`("pnoa", Class("TransToPlaceArc")),
        assignField(Var("tr"), "_PN_OA", Var("pnoa")),
        assignField(Var("pntr"), "outgoing", Var("pnoa")),
        assignField(Var("pnoa"), "source", Var("pntr")),
        loadField("tr_target", Var("tr"), "target"),
        loadField("tr_target_Place", Var("tr_target"), "_Place"),
        assignField(Var("pnoa"), "target", Var("tr_target_Place")),
        assignField(Var("pnia"), "weight", Var("int1")),
        assignVar("transitions", Union(Var("transitions"), Var("pntr")))
      )),
      // rule State2Place -- Part 2 -- connecting things together
      `for`("st", MatchStar(Var("pe"), Class("State")), stmtSeq(
        loadField("st_Place", Var("st"), "_Place"),
        assignVar("pnoas", SetLit(Seq())),
        loadField("st_incoming", Var("st"), "incoming"),
        `for`("inc", MSet(Var("st_incoming")), stmtSeq(
          loadField("inc_PN_OA", Var("inc"), "_PN_OA"),
          assignVar("pnoas", Union(Var("pnoas"), Var("inc_PN_OA")))
        )),
        assignField(Var("st_Place"), "incoming", Var("pnoas")),
        assignVar("pnias", SetLit(Seq())),
        loadField("st_outgoing", Var("st"), "outgoing"),
        `for`("outg", MSet(Var("st_outgoing")), stmtSeq(
          loadField("outg_PN_IA", Var("outg"), "_PN_IA"),
          assignVar("pnias", Union(Var("pnias"), Var("outg_PN_IA")))
        )),
        assignField(Var("st_Place"), "outgoing", Var("pnias"))
      )),
      // rule PathExp2PetriNet
      `new`("pn", Class("PetriNet")),
      loadField("pe_name", Var("pe"), "name"),
      assignField(Var("pn"), "name", Var("pe_name")),
      assignField(Var("pn"), "places", Var("places")),
      assignField(Var("pn"), "transitions", Var("transitions")),
      assignVar("arcs", SetLit(Seq())),
      `for`("pntr", MSet(Var("transitions")), stmtSeq(
        loadField("pnia", Var("pntr"), "_PN_IA"),
        loadField("pnoa", Var("pntr"), "_PN_OA"),
        assignVar("arcs", Union(Var("arcs"), Union(Var("pnia"), Var("pnoa"))))
      )),
      assignField(Var("pn"), "arcs", Var("arcs"))
    )
  }
