package norswap.javag

// Types -------------------------------------------------------------------------------------------

interface TypeBound

data class SuperBound (
    val type: Type)
    : TypeBound

data class ExtendsBound (
    val type: Type)
    : TypeBound

interface Type

data class PrimitiveType (
    val ann: List<Annotation>,
    val name: String)
    : Type

class Void()
    : Type

interface RefType
    : Type

data class Wildcard (
    val ann: List<Annotation>,
    val bounds: TypeBound?)
    : RefType

data class ClassType (
    val parts: List<ClassTypePart>)
    : RefType

data class ClassTypePart (
    val ann: List<Annotation>,
    val name: String,
    val targs: List<Type>)

data class ArrayType (
    val stem: Type,
    val dims: List<Dimension>)
    : RefType

data class Dimension (
    val ann: List<Annotation>)

data class TypeParam (
    val ann: List<Annotation>,
    val name: String,
    val bounds: List<Type>)

// Annotations -------------------------------------------------------------------------------------

interface AnnotationElement

interface Annotation: AnnotationElement

data class AnnotationElementList (
    val elems: List<AnnotationElement>)
    : AnnotationElement

data class NormalAnnotation (
    val name: List<String>,
    val elements: List<Pair<String, AnnotationElement>>)
    : Annotation

data class MarkerAnnotation (
    val name: List<String>)
    : Annotation

data class SingleElementAnnotation (
    val name: List<String>,
    val element: AnnotationElement)
    : Annotation

// Expressions -------------------------------------------------------------------------------------

interface Expr: AnnotationElement, Stmt

object Null

object Super
    : Expr

object This
    : Expr

data class SuperCall (
    val args: List<Expr>)
    : Expr

data class ThisCall (
    val args: List<Expr>)
    : Expr

data class Literal (
    val value: Any)
    : Expr

data class Identifier (
    val name: String)
    : Expr

data class ClassExpr (
    val type: Type)
    : Expr

data class DimExpr (
    val ann: List<Annotation>,
    val expr: Expr)

data class ArrayInit (
    val items: List<Expr>)
    : Expr

data class ArrayCtorCall (
    val type: Type,
    val dimExprs: List<DimExpr>,
    val dims: List<Dimension>,
    val init: Expr?)
    : Expr

data class CtorCall (
    val targs: List<Type>,
    val ann: List<Annotation>,
    val type: Type,
    val args: List<Expr>,
    val body: List<Decl>?)
    : Expr

data class DotIden (
    val op: Expr,
    val name: String)
    : Expr

data class DotThis (
    val op: Expr)
    : Expr

data class DotSuper (
    val op: Expr)
    : Expr

data class DotNew (
    val op: Expr,
    val ctor: CtorCall)
    : Expr

data class MethodCall (
    val op: Expr?,
    val targs: List<Type>,
    val name: String,
    val args: List<Expr>)
    : Expr

data class ArrayAccess (
    val op: Expr,
    val index: Expr)
    : Expr

data class PostIncrement (val op: Expr): Expr
data class PostDecrement (val op: Expr): Expr
data class PreIncrement  (val op: Expr): Expr
data class PreDecrement  (val op: Expr): Expr

data class MethodReference (
    val type: Type,
    val targs: List<Type>,
    val name: String)
    : Expr

data class NewReference (
    val type: Type,
    val targs: List<Type>)
    : Expr

data class Cast (
    val types: List<Type>,
    val op: Expr)
    : Expr

data class UnaryPlus    (val op: Expr): Expr
data class UnaryMinus   (val op: Expr): Expr
data class Complement   (val op: Expr): Expr
data class Not          (val op: Expr): Expr

data class Product          (val left: Expr, val right: Expr): Expr
data class Division         (val left: Expr, val right: Expr): Expr
data class Mod              (val left: Expr, val right: Expr): Expr
data class Sum              (val left: Expr, val right: Expr): Expr
data class Diff             (val left: Expr, val right: Expr): Expr
data class ShiftLeft        (val left: Expr, val right: Expr): Expr
data class ShiftRight       (val left: Expr, val right: Expr): Expr
data class BinaryShiftRight (val left: Expr, val right: Expr): Expr
data class Lower            (val left: Expr, val right: Expr): Expr
data class LowerEqual       (val left: Expr, val right: Expr): Expr
data class Greater          (val left: Expr, val right: Expr): Expr
data class GreaterEqual     (val left: Expr, val right: Expr): Expr
data class Equal            (val left: Expr, val right: Expr): Expr
data class NotEqual         (val left: Expr, val right: Expr): Expr
data class BinaryAnd        (val left: Expr, val right: Expr): Expr
data class Xor              (val left: Expr, val right: Expr): Expr
data class BinaryOr         (val left: Expr, val right: Expr): Expr
data class And              (val left: Expr, val right: Expr): Expr
data class Or               (val left: Expr, val right: Expr): Expr

data class Assign (
    val left: Expr,
    val right: Expr,
    val op: String)
    : Expr

data class InstanceOf (
    val expr: Expr,
    val type: Type)
    : Expr

data class Ternary (
    val cond: Expr,
    val ifPart: Expr,
    val elsePart: Expr)
    : Expr

// NOTE: body can be an expression
data class Lambda (
    val params: Parameters,
    val body: Stmt)
    : Expr

// Declarations  -----------------------------------------------------------------------------------

interface Modifier

enum class Keyword: Modifier {
    abstract,
    default,
    final,
    native,
    private,
    protected,
    public,
    static,
    synchronized,
    strictfp,
    transient,
    volatile
}

class Annnotation: Modifier

interface FormalParameter

data class IdenParameter (
    val mods: List<Modifier>,
    val type: Type,
    val name: String,
    val dims: List<Dimension>)
    : FormalParameter

data class ThisParameter (
    val mods: List<Modifier>,
    val type: Type,
    val qualifier: List<String>)
    : FormalParameter

data class VariadicParameter (
    val mods: List<Modifier>,
    val type: Type,
    val arrayMods: List<Annotation>,
    val name: String)
    : FormalParameter

interface Parameters

data class FormalParameters (
    val params: List<FormalParameters>)
    : Parameters

data class UntypedParameters (
    val params: List<String>)
    : Parameters

////

data class Package (
    val ann: List<Annotation>,
    val name: List<String>)

data class Import (
    val static: Boolean,
    val name: List<String>,
    val wildcard: Boolean)

////

interface Decl: Stmt

data class EnumConstant (
    val ann: List<Annotation>,
    val name: String,
    val params: List<Expr>?,
    val body: List<Decl>?)

// NOTE: should these really be nullable?
// TODO replace FormalParameters with List<FormalParameter>

enum class TypeDeclKind { ANNOTATION, CLASS, ENUM, INTERFACE }

data class TypeDecl (
    val kind: TypeDeclKind,
    val mods: List<Mod>,
    val name: String,
    val tparams: List<TypeParam>,
    val extends: List<Type>,
    val implements: List<Type>,
    val decls: List<Decl>)
    : Decl

data class EnumDecl (
    val decl: TypeDecl,
    val constants: List<EnumConstant>)
    : Decl

data class AnnotationElemDecl (
    val mods: List<Mod>,
    val type: Type,
    val name: String,
    val dims: List<Dimension>,
    val value: AnnotationElement?)
    : Decl

/*

AST concerns

- easy to build (?)

- syntactic fidelity
    - i.e. desugarings?

- DRY
    - class and interfaces almost identical in structure
        - common ancestor?      -> verbose
        - separate?             -> verbose, no common interface
        - enum discrimination?  -> unsafe accesses

- error handling
    - e.g. have an extends field for interfaces
        - can't possibly be right
        - but leads to better error reporting during validation
    - on the parsing side: vs additional parsing work

- extensibility
    - attributes (e.g. typing)
    - new computations (with caching in attributes?)

trade-offs

- validation vs unsafe accesses
    - two interfaces?   -> verbose

- uniformity (apply desugarings) vs syntactic fidelity
    - use (cached?) syntactic predicates

- validation vs nice interface
    - e.g. multiple vs single extends vs no extends, implements vs not
    - use an "implements" for interface extends and class implements?

--> language + code generation?

2.

- may need multiple levels of grammar
    - speed for correct files
    - details for incorrect ones

- I made arrayInit an expr, but not one that can be acquired via expr

 */

// Statements --------------------------------------------------------------------------------------

interface Stmt

data class Block (
    val stmts: List<Stmt>)
    : Stmt

data class If (
    val cond: Expr,
    val ifPart: Stmt,
    val elsePart: Stmt?)
    : Stmt

data class BasicFor (
    val init: List<Stmt>,
    val cond: Expr?,
    val iter: List<Stmt>,
    val body: Stmt)
    : Stmt

data class EnhancedFor (
    val mods: List<Modifier>,
    val type: Type,
    val declarator: VarDeclaratorID,
    val iter: Expr,
    val body: Stmt)
    : Stmt

data class WhileStmt (
    val cond: Expr,
    val body: Stmt)
    : Stmt

data class DoWhileStmt (
    val body: Stmt,
    val cond: Expr)
    : Stmt

data class SynchronizedStmt (
    val expr: Expr,
    val body: Block)
    : Stmt

data class ReturnStmt (val expr: Expr?): Stmt
data class ThrowStmt  (val expr: Expr): Stmt

data class BreakStmt    (val label: String?): Stmt
data class ContinueStmt (val label: String?): Stmt

data class AssertStmt (
    val expr: Expr,
    val msg: Expr?)
    : Stmt

data class LabelledStmt (
    val label: String,
    val stmt: Stmt)
    : Stmt

data class CatchClause (
    val mods: List<Modifier>,
    val types: List<Type>,
    val id: VarDeclaratorID,
    val body: Block)

data class TryResource (
    val mods: List<Modifier>,
    val type: Type,
    val id: VarDeclaratorID,
    val value: Expr)

data class TryStmt (
    val resources: List<TryResource>,
    val body: Block,
    val catch: List<CatchClause>,
    val finally: Block?)
    : Stmt

interface SwitchLabel

data class CaseLabel (
    val expr: Expr)
    : SwitchLabel

object DefaultLabel
    : SwitchLabel

data class SwitchClause (
    val label: SwitchLabel,
    val stmts: List<Stmt>)

data class SwitchStmt (
    val expr: Expr,
    val clauses: List<SwitchClause>)
    : Stmt

data class VarDeclaratorID (
    val iden: String,
    val dims: List<Dimension>)

data class VarDeclarator (
    val id: VarDeclaratorID,
    val init: Expr?)

data class VarDecl (
    val mods: List<Modifier>,
    val type: Type,
    val declarators: List<VarDeclarator>)
    : Decl

object SemiStmt: Stmt

data class MethodDecl (
    val mods: List<Mod>,
    val tparams: List<TypeParam>,
    val retType: Type,
    val name: String,
    val params: FormalParameters,
    val dims: List<Dimension>,
    val throwing: List<Type>,
    val body: Block?)
    : Decl

data class InitBlock (
    val static: Boolean,
    val block: Block)
    : Decl

data class ConstructorDecl (
    val mods: List<Mod>,
    val tparams: List<TypeParam>,
    val name: String,
    val params: FormalParameters,
    val throwing: List<Type>,
    val body: Block)
    : Decl

// Root --------------------------------------------------------------------------------------------

data class File (
    val pkg: Package?,
    val imports: List<Import>,
    val typeDecls: List<Decl>)