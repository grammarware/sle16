package examples

import syntax.ast._

object FullClassModel {
  val classDefs = Set(
      ClassDefinition("Package", Map("classes" -> FieldDefinition(Class("Class"), ManyOpt, Ordinary)), Map())
    , ClassDefinition("Class",
                          Map("fields" -> FieldDefinition(Class("Field"), ManyOpt, Ordinary),
                              "methods" -> FieldDefinition(Class("Method"), ManyOpt, Ordinary)),
       Map("super" -> FieldDefinition(Class("Class"), Opt, Ordinary), "name" -> FieldDefinition(Class("String"), Req, Ordinary)))
   , ClassDefinition("Field", Map(),
                              Map("name" -> FieldDefinition(Class("String"), Req, Ordinary),
                                  "type" -> FieldDefinition(Class("Class"), Req, Ordinary)))
   , ClassDefinition("Method", Map("params" -> FieldDefinition(Class("Parameter"), ManyOpt, Ordinary),
                                   "body" -> FieldDefinition(Class("Statement"), Req, Ordinary)),
                        Map("name" -> FieldDefinition(Class("String"), Req, Ordinary),
                            "type" -> FieldDefinition(Class("Class"), Req, Ordinary)))
   , ClassDefinition("Parameter", Map(),
                           Map("name" -> FieldDefinition(Class("String"), Req, Ordinary),
                               "type" -> FieldDefinition(Class("Class"), Req, Ordinary)))
   , ClassDefinition("Statement", Map(), Map())
   , ClassDefinition("If", Map("then" -> FieldDefinition(Class("Statement"), Req, Ordinary),
                               "else" -> FieldDefinition(Class("Statement"), Opt, Ordinary),
                               "cond" -> FieldDefinition(Class("Expr"), Req, Ordinary)),
                               Map(), Some(Class("Statement")))
    , ClassDefinition("Return", Map("value" -> FieldDefinition(Class("Expr"), Req, Ordinary)),
                           Map(), Some(Class("Statement")))
    , ClassDefinition("Assign", Map("left" -> FieldDefinition(Class("AssignableExpr"), Req, Ordinary),
                                    "right" -> FieldDefinition(Class("Expr"), Req, Ordinary)), Map(), Some(Class("Statement")))
    , ClassDefinition("Expr", Map(), Map("type" -> FieldDefinition(Class("Class"), Req, Ordinary)))
    , ClassDefinition("AssignableExpr", Map(), Map(), Some(Class("Expr")))
    , ClassDefinition("FieldAccessExpr", Map("target" -> FieldDefinition(Class("Expr"), Req, Ordinary)),
                          Map("field_name" -> FieldDefinition(Class("String"), Req, Ordinary)),
                          Some(Class("AssignableExpr")))
    , ClassDefinition("MethodCallExpr", Map("target" -> FieldDefinition(Class("Expr"), Req, Ordinary),
                                            "args" -> FieldDefinition(Class("Arg"), ManyOpt, Ordinary)),
                          Map("method_name" -> FieldDefinition(Class("String"), Req, Ordinary)), Some(Class("Expr")))

    , ClassDefinition("Arg", Map("value" -> FieldDefinition(Class("Expr"), Req, Ordinary)), Map("name" -> FieldDefinition(Class("String"), Req, Ordinary)))
  )

  val allDefs = Shared.stdClassDefs ++ classDefs
}
