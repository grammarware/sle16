package examply

// Interfaces --------------------------------------------------------------------------------------

interface Node
interface Expr: Node
interface Stmt: Node
interface Decl: Node
interface Type: Node

// Expressions -------------------------------------------------------------------------------------

data class MethodCall (
    val left: Expr,
    val right: FunCall)
    : Expr

data class FieldAccess (
    val left: Expr,
    val name: String)
    : Expr

data class Sum (
    val left: Expr,
    val right: Expr)
    : Expr

data class Diff (
    val left: Expr,
    val right: Expr)
    : Expr

data class Assign (
    val left: Expr, val right: Expr): Expr

data class Lambda (
    val params: List<TypedIdentifier>,
    val body: List<Stmt>)
    : Expr

data class ThisCall (
    val params: List<Expr>)
    : Expr

object This: Expr

data class SuperCall (
    val params: List<Expr>)
    : Expr

data class FunCall (
    val name: String,
    val params: List<Expr>)
    : Expr

data class CtorCall (
    val klass: String, val params: List<Expr>, val body: List<Decl>?)
    : Expr

data class Identifier (
    val name: String)
    : Expr

data class StringLit (
    val value: String)
    : Expr

data class IntegerLit (
    val value: Int)
    : Expr

// Types -------------------------------------------------------------------------------------------

data class SimpleType(
    val name: String)
    : Type

data class FunType (
    val params: List<Type>,
    val returnType: Type)
    : Type

// Helper ------------------------------------------------------------------------------------------

data class TypedIdentifier (
    val iden: String,
    val type: Type?)
    : Node

// Statements & Declarations -----------------------------------------------------------------------

data class If (
    val cond: Expr,
    val body: List<Stmt>)
    : Stmt

data class While (
    val cond: Expr,
    val body: List<Stmt>)
    : Stmt

object Break: Stmt

object Skip: Stmt

object Continue: Stmt

data class Return (
    val expr: Expr?)
    : Stmt

data class Val (
    val iden: TypedIdentifier,
    val value: Expr?)
    : Stmt, Decl

data class Var (
    val iden: TypedIdentifier,
    val value: Expr?)
    : Stmt, Decl

data class Fun (
    val name: String,
    val params: List<TypedIdentifier>,
    val returnType: Type?,
    val body: List<Stmt>)
    : Stmt, Decl

data class Alias (
    val defined: String,
    val aliased: Type)
    : Decl

data class Constructor (
    val params: List<TypedIdentifier>,
    val body: List<Stmt>)
    : Decl

data class Class (
    val name: String,
    val superclass: SimpleType?,
    val body: List<Decl>)
    : Decl

// Top-Level ---------------------------------------------------------------------------------------

data class Import (
    val pkg: List<String>,
    val klass: String)
    : Node

data class File (
    val imports: List<Import>,
    val classes: List<Class>)
    : Node

// -------------------------------------------------------------------------------------------------
