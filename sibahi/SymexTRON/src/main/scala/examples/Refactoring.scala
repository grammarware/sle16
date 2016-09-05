package examples

import semantics.domains._
import syntax.ast.Statement._
import syntax.ast._

trait Refactoring extends Example {
  override val classDefs = FullClassModel.allDefs
}

object RenameFieldRefactoring extends Refactoring {

  override val pres: Set[SMem] = {
    val packageId = -1
    val classId = -2
    val oldFieldId = -3
    val newFieldId = -4
    val packageClassesId = -5
    val classFieldsId = -6
    val classMethodsId = -7
    val classNameId = -8
    val classSuperId = -9

    val inputStack = SStack.initial(Set(),Map("package" -> SetLit(Seq(Symbol(packageId))), "class" -> SetLit(Seq(Symbol(classId))),
      "old_field" -> SetLit(Seq(Symbol(oldFieldId))), "new_field" -> SetLit(Seq(Symbol(newFieldId)))))
    val inputHeap = SHeap.initial(
      Map(SetSymbol(packageClassesId) -> SSymbolDesc(Class("Class"), Set(), ManyOpt)
        , SetSymbol(classFieldsId) -> SSymbolDesc(Class("Field"), Set(), ManyOpt)
        , SetSymbol(classMethodsId) -> SSymbolDesc(Class("Method"), Set(), ManyOpt)
        , SetSymbol(classSuperId) -> SSymbolDesc(Class("Class"), Set(), Opt)
      )
      , Map(Symbol(packageId) -> Loced(Loc(packageId)),
        Symbol(classId) -> Loced(Loc(classId)),
        Symbol(oldFieldId) -> UnknownLoc(Class("Field"), Set()),
        Symbol(newFieldId) -> UnknownLoc(Class("Field"), Set()),
        Symbol(classNameId) -> UnknownLoc(Class("String"), Set()))
      , Map(Loc(packageId) -> Unfolded, Loc(classId) -> Unfolded)
      , Map(Loc(packageId) -> SpatialDesc(Class("Package"), Set(), ExactDesc, Map("classes" -> Union(SetSymbol(packageClassesId), SetLit(Seq(Symbol(classId))))), Map(), Map()),
            Loc(classId) -> SpatialDesc(Class("Class"), Set(), ExactDesc, Map("fields" -> Union(SetSymbol(classFieldsId), SetLit(Seq(Symbol(oldFieldId)))),
          "methods" -> SetSymbol(classMethodsId))
          , Map("name" -> SetLit(Seq(Symbol(classNameId))),
            "super" -> SetSymbol(classSuperId)), Map()))
      , Set(
        Eq(SetLit(Seq()), ISect(SetSymbol(packageClassesId), SetLit(Seq(Symbol(classId))))),
        Eq(SetLit(Seq()), ISect(SetSymbol(classFieldsId), SetLit(Seq(Symbol(oldFieldId))))),
        Not(Eq(SetLit(Seq(Symbol(newFieldId))), SetLit(Seq(Symbol(oldFieldId)))))
      )
    )
    Set(SMem(inputStack, inputHeap))
  }

  // Input:: package: Package, class: Class, old_field : Field, new_field : Field
  override val prog: Statement = stmtSeq(
    loadField("class_fields", Var("class"), "fields")
    , assignField(Var("class"), "fields", Union(Diff(Var("class_fields"), Var("old_field")), Var("new_field")))
    , `for`("faexpr", MatchStar(Var("package"), Class("FieldAccessExpr")), stmtSeq(
        loadField("faexpr_field_name", Var("faexpr"), "field_name")
      , loadField("old_field_name", Var("old_field"), "name")
      , loadField("faexpr_target", Var("faexpr"), "target")
      , loadField("faexpr_target_type", Var("faexpr_target"), "type")
      , `if`(And(Eq(Var("faexpr_field_name"), Var("old_field_name")),
        Eq(Var("class"), Var("faexpr_target_type")))
        , stmtSeq(
          loadField("new_field_name", Var("new_field"), "name")
          , assignField(Var("faexpr"), "field_name", Var("new_field_name")))
        , stmtSeq()
      )
    ))
  )
}

object RenameMethodRefactoring extends Refactoring {

  override val pres: Set[SMem] = {
    val packageId = -1
    val classId = -2
    val oldMethodId = -3
    val newMethodId = -4
    val packageClassesId = -5
    val classFieldsId = -6
    val classMethodsId = -7
    val classNameId = -8
    val classSuperId = -9

    val inputStack = SStack.initial(Set(),Map("package" -> SetLit(Seq(Symbol(packageId))), "class" -> SetLit(Seq(Symbol(classId))),
      "old_method" -> SetLit(Seq(Symbol(oldMethodId))), "new_method" -> SetLit(Seq(Symbol(newMethodId)))))
    val inputHeap = SHeap.initial(
      Map(SetSymbol(packageClassesId) -> SSymbolDesc(Class("Class"), Set(), ManyOpt)
        , SetSymbol(classFieldsId) -> SSymbolDesc(Class("Field"), Set(), ManyOpt)
        , SetSymbol(classMethodsId) -> SSymbolDesc(Class("Method"), Set(), ManyOpt)
        , SetSymbol(classSuperId) -> SSymbolDesc(Class("Class"), Set(), Opt)
      ),
      Map(Symbol(packageId) -> Loced(Loc(packageId)),
        Symbol(classId) -> Loced(Loc(classId)),
        Symbol(oldMethodId) -> UnknownLoc(Class("Method"), Set()),
        Symbol(newMethodId) -> UnknownLoc(Class("Method"), Set()),
        Symbol(classNameId) -> UnknownLoc(Class("String"), Set())),
      Map(Loc(packageId) -> Unfolded, Loc(classId) -> Unfolded),
      Map(Loc(packageId) -> SpatialDesc(Class("Package"), Set(), ExactDesc, Map("classes" -> Union(SetSymbol(packageClassesId), SetLit(Seq(Symbol(classId))))), Map(), Map()),
          Loc(classId) -> SpatialDesc(Class("Class"), Set(), ExactDesc
          , Map("fields" -> SetSymbol(classFieldsId),
            "methods" -> Union(SetSymbol(classMethodsId), SetLit(Seq(Symbol(oldMethodId)))))
          , Map("name" -> SetLit(Seq(Symbol(classNameId))),
            "super" -> SetSymbol(classSuperId)), Map()))
      , Set(
        Eq(SetLit(Seq()), ISect(SetSymbol(packageClassesId), SetLit(Seq(Symbol(classId))))),
        Eq(SetLit(Seq()), ISect(SetSymbol(classMethodsId), SetLit(Seq(Symbol(oldMethodId))))),
        Not(Eq(SetLit(Seq(Symbol(newMethodId))), SetLit(Seq(Symbol(oldMethodId)))))
      )
    )
    Set(SMem(inputStack, inputHeap))
  }

  // Input:: package: Package, class: Class, old_method : Method, new_method : Method
  //Assumes overloading is allowed (but arity must be different), things are semantically checked, and that the transformation is applicable
  override val prog: Statement = stmtSeq(
    loadField("class_methods", Var("class"), "methods")
    , assignField(Var("class"), "methods", Union(Diff(Var("class_methods"), Var("old_method")), Var("new_method")))
    , `for`("mcexpr", MatchStar(Var("package"), Class("MethodCallExpr")), stmtSeq(
      loadField("mcexpr_method_name", Var("mcexpr"), "method_name")
      , loadField("old_method_name", Var("old_method"), "name")
      , loadField("old_method_params", Var("old_method"), "params")
      , loadField("mcexpr_target", Var("mcexpr"), "target")
      , loadField("mcexpr_target_type", Var("mcexpr_target"), "type")
      , loadField("mcexpr_args", Var("mcexpr"), "args")
      , `new`("paramsmatched", Class("Any"))
      , `for`("omp", MSet(Var("old_method_params")), stmtSeq(
        assignVar("parammatched", SetLit(Seq()))
        , loadField("omp_name", Var("omp"), "name")
        , `for`("mcea", MSet(Var("mcexpr_args")), stmtSeq(
          loadField("mcea_name", Var("mcea"), "name"),
          `if`(Eq(Var("omp_name"), Var("mcea_name")),
            assignVar("parammatched", Var("paramsmatched"))
            , stmtSeq())
        ))
        , `if`(Eq(Var("parammatched"), SetLit(Seq()))
          , assignVar("paramsmatched", SetLit(Seq()))
          , stmtSeq())
      ))
      , `if`(And(And(Eq(Var("mcexpr_method_name"), Var("old_method_name")),
        Eq(Var("class"), Var("mcexpr_target_type"))),
        or(And(Eq(Var("old_method_params"), SetLit(Seq())), Eq(Var("mcexpr_args"), SetLit(Seq()))),
          Not(Eq(Var("paramsmatched"), SetLit(Seq())))))
        , stmtSeq(loadField("new_method_name", Var("new_method"), "name")
          , assignField(Var("mcexpr"), "method_name", Var("new_method_name")))
        , stmtSeq()
      )
    ))
  )
}

object ExtractSuperclassRefactoring extends Refactoring {
  override val pres: Set[SMem] = {
    val packageId = -1
    val class1Id = -2
    val class2Id = -3
    val scnameId = -4
    val packageClassesId = -5

    val inputStack = SStack.initial(Set(), Map("package" -> SetLit(Seq(Symbol(packageId))), "class1" -> SetLit(Seq(Symbol(class1Id))),
      "class2" -> SetLit(Seq(Symbol(class2Id))), "sc_name" -> SetLit(Seq(Symbol(scnameId)))))
    val inputHeap = SHeap.initial(
      Map(SetSymbol(packageClassesId) -> SSymbolDesc(Class("Class"), Set(), ManyOpt)),
      Map(
        Symbol(packageId) -> Loced(Loc(packageId)),
        Symbol(scnameId) -> UnknownLoc(Class("String"), Set()),
        Symbol(class1Id) -> UnknownLoc(Class("Class"), Set()),
        Symbol(class2Id) -> UnknownLoc(Class("Class"), Set())),
      Map(Loc(packageId) -> Unfolded),
      Map(Loc(packageId) -> SpatialDesc(Class("Package"), Set(), ExactDesc, Map("classes" -> Union(Union(SetSymbol(packageClassesId), SetLit(Seq(Symbol(class2Id)))), SetLit(Seq(Symbol(class2Id))))), Map(), Map())),
      Set()
    )
    Set(SMem(inputStack, inputHeap))
  }

  // Input:: class1 : Class, class2 : Class, sc_name : String
  override val prog: Statement = stmtSeq(
    `new`("sclass", Class("Class"))
    , loadField("package_classes", Var("package"), "classes")
    , assignField(Var("package"), "classes", Union(Var("package_classes"), Var("sclass")))
    , assignField(Var("class1"), "super", Var("sclass"))
    , assignField(Var("class2"), "super", Var("sclass"))
    , assignField(Var("sclass"), "name", Var("sc_name"))
    // Pull up relevant fields
    , assignVar("new_sclass_fields", SetLit(Seq()))
    , assignVar("rem_class1_fields", SetLit(Seq()))
    , assignVar("rem_class2_fields", SetLit(Seq()))
    , loadField("class1_fields", Var("class1"), "fields")
    , loadField("class2_fields", Var("class2"), "fields")
    , `for`("c1f", MSet(Var("class1_fields")), stmtSeq(
      `for`("c2f", MSet(Var("class2_fields")), stmtSeq(
        loadField("c1f_name", Var("c1f"), "name")
        , loadField("c2f_name", Var("c2f"), "name")
        , loadField("c1f_type", Var("c1f"), "type")
        , loadField("c2f_type", Var("c2f"), "type")
        , `if`(And(Eq(Var("c1f_name"), Var("c2f_name")),
          Eq(Var("c2f_type"), Var("c2f_type")))
          , stmtSeq(
            `new`("scf", Class("Field"))
            , assignField(Var("scf"), "name", Var("c1f_name"))
            , assignField(Var("scf"), "type", Var("c1f_type"))
            , assignVar("new_sclass_fields", Union(Var("new_sclass_fields"), Var("scf")))
            , assignVar("rem_class1_fields", Union(Var("rem_class1_fields"), Var("c1f")))
            , assignVar("rem_class2_fields", Union(Var("rem_class2_fields"), Var("c2f")))
          )
          , stmtSeq())
      ))
    ))
    , assignField(Var("class1"), "fields", Diff(Var("class1_fields"), Var("rem_class1_fields")))
    , assignField(Var("class2"), "fields", Diff(Var("class2_fields"), Var("rem_class2_fields")))
    , assignField(Var("sclass"), "fields", Var("new_sclass_fields"))
  )
}

object ReplaceDelegationWithInheritance extends Refactoring {
  override val excludedBranches = Set(BranchPoint(21, 2))

  override val pres: Set[SMem] = {
        val classId          = -1
        val fieldId          = -2
        val classFieldsId    = -3
        val classMethodsId   = -4
        val classNameId      = -5
        val classSuperId     = -6

        val inputStack = SStack.initial(Set(), Map("class" -> SetLit(Seq(Symbol(classId))),
                             "field" -> SetLit(Seq(Symbol(fieldId)))))
        val inputHeap = SHeap.initial(
          Map(SetSymbol(classFieldsId) -> SSymbolDesc(Class("Field"), Set(), ManyOpt),
              SetSymbol(classMethodsId) -> SSymbolDesc(Class("Method"), Set(), ManyOpt),
              SetSymbol(classSuperId) -> SSymbolDesc(Class("String"), Set(), Opt)),
          Map(Symbol(classId) -> Loced(Loc(classId)),
              Symbol(fieldId) -> UnknownLoc(Class("Field"), Set()),
              Symbol(classNameId) -> UnknownLoc(Class("String"), Set())),
          Map(Loc(classId) -> Unfolded),
          Map(Loc(classId) -> SpatialDesc(Class("Class"), Set(), ExactDesc
            , Map("fields" -> Union(SetSymbol(classFieldsId), SetLit(Seq(Symbol(fieldId))))
              ,   "methods" -> SetSymbol(classMethodsId)), Map("name" -> SetLit(Seq(Symbol(classNameId))), "super" -> SetSymbol(classSuperId)), Map())),
          Set(Eq(SetLit(Seq()), ISect(SetSymbol(classFieldsId), SetLit(Seq(Symbol(fieldId))))))
        )
        Set(SMem(inputStack, inputHeap))
  }

  // Assumes that methods that have the same name as the delegate are delegated methods and that field is private
  // class: Class, field : Field
  override val prog : Statement = stmtSeq(
      loadField("class_fields", Var("class"), "fields")
    , loadField("field_type", Var("field"), "type")
    , assignField(Var("class"), "super", Var("field_type"))
    // Remove all delegated methods
    , loadField("field_type_methods", Var("field_type"), "methods")
    , loadField("class_methods", Var("class"), "methods")
    , assignVar("class_new_methods", SetLit(Seq()))
    , `for`("ftm", MSet(Var("field_type_methods")), stmtSeq(
        `for`("cm", MSet(Var("class_methods")), stmtSeq(
              loadField("ftm_name", Var("ftm"), "name")
            , loadField("cm_name", Var("cm"), "name")
            , `if`(Not(Eq(Var("ftm_name"), Var("cm_name")))
                  , assignVar("class_new_methods", Union(Var("class_new_methods"), Var("cm")))
                  , stmtSeq())
          ))
      ))
    , assignField(Var("class"), "methods", Var("class_new_methods"))
    // Replace other delegations with calls to the object itself
    , `for`("mcexpr", MatchStar(Var("class"), Class("MethodCallExpr")), stmtSeq(
          loadField("mcexpr_target", Var("mcexpr"), "target")
        , assignVar("MCEXPR_TARGET", SetLit(Seq()))
        , `for`("mcx", Match(Var("mcexpr_target"), Class("FieldAccessExpr")),
                  assignVar("MCEXPR_TARGET", Var("mcx"))
           )
        , `if`(not(Eq(Var("MCEXPR_TARGET"), SetLit(Seq())))
              , stmtSeq(
                  loadField("mcexpr_target_target", Var("mcexpr_target"), "target")
                , loadField("mcexpr_target_target_type", Var("mcexpr_target_target"), "type")
                , loadField("mcexpr_target_field_name", Var("mcexpr_target"), "field_name")
                , loadField("field_name", Var("field"), "name")
                , `if`(And(Eq(Var("field_name"), Var("mcexpr_target_field_name")),
                         Eq(Var("class"), Var("mcexpr_target_target_type")))
                      , assignField(Var("mcexpr"), "target", Var("mcexpr_target_target"))
                      , stmtSeq()))
                , stmtSeq())
      ))
    // Remove the delegate field
    , assignField(Var("class"), "fields", Diff(Var("class_fields"), Var("field")))
    )
}
