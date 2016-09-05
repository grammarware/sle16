package examples

import syntax.ast._


object Shared {
  val stdClassDefs = Set(
    ClassDefinition("String", Map(), Map(), isStandalone = true),
    ClassDefinition("Int", Map(), Map(), isStandalone = true),
    ClassDefinition("Any", Map(), Map()),
    ClassDefinition("Unit", Map(), Map(), isStandalone = true),
    ClassDefinition("Empty", Map(), Map(), superclass = Some(Class("String"))),
    ClassDefinition("Concat", Map(), Map("s1" -> FieldDefinition(Class("String"), Req, Ordinary), "s2" -> FieldDefinition(Class("String"), Req, Ordinary)), superclass = Some(Class("String")))
  )
}
