// @formatter:off
@file:Suppress("UNCHECKED_CAST")
package norswap.javag
import norswap.autumn.Parser
import norswap.autumn.extensions.tokens.*
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*
import norswap.javag.TypeDeclKind.*

////////////////////////////////////////////////////////////////////////////////////////////////////
/**                                      TABLE OF CONTENT                                        **\

 - LEXICAL                          [any]
    - Whitespace                    [any]
    - Keywords and operators        [boolean]
    - Identifiers                   [idenStart]
    - Numerals: bits and pieces     [_]
    - Numerals: floating point      [hexSignificand]
    - Numerals: integral            [bit]
    - Characters and Strings        [octalEscape]
 - MODIFIERS                        [keywordModifier]
 - PARAMETERS                       [thisParameterQualifier]
 - NON-TYPE DECLARATIONS            [varInit]
 - TYPE DECLARATIONS                [extendsClause]
 - ANNOTATIONS                      [annotationElement]
 - TYPES                            [basicType]
 - EXPRESSIONS                      [varInit]
 - TOP-LEVEL                        [packageDecl]
 - CONFIG                           [root]

*///////////////////////////////////////////////////////////////////////////////////////////////////

open class Java: TokenGrammar()
{
    /// LEXICAL ====================================================================================

    // Whitespace

    val any
        = AnyChar()

    val wspaceChar
        = CharPred(Char::isWhitespace)

    val lineComment
        =  "//".lit..(any until "\n".lit)

    val multiComment
        =  "/*".lit..(any until "*/".lit)

    override val whitespaceParser
        = (wspaceChar / lineComment / multiComment).repeat

    // Keywords and operators

    val `boolean` = "boolean".token
    val `byte` = "byte".token
    val `char` = "char".token
    val `double` = "double".token
    val `float` = "float".token
    val `int` = "int".token
    val `long` = "long".token
    val `short` = "short".token
    val `void` = "void".token

    val `abstract` = "abstract".token
    val `default` = "default".token
    val `final` = "final".token
    val `native` = "native".token
    val `private` = "private".token
    val `protected` = "protected".token
    val `public` = "public".token
    val `static` = "static".token
    val `strictfp` = "strictfp".token
    val `synchronized` = "synchronized".token
    val `transient` = "transient".token
    val `volatile` = "volatile".token

    val `false` = Str("false").token { false }
    val `true` = Str("true").token { true }
    val `null` = Str("null").token { Null }

    val `assert` = "assert".keyword
    val `break` = "break".keyword
    val `case` = "case".keyword
    val `catch` = "catch".keyword
    val `class` = "class".keyword
    val `const` = "const".keyword
    val `continue` = "continue".keyword
    val `do` = "do".keyword
    val `else` = "else".keyword
    val `enum` = "enum".keyword
    val `extends` = "extends".keyword
    val `finally` = "finally".keyword
    val `for` = "for".keyword
    val `goto` = "goto".keyword
    val `if` = "if".keyword
    val `implements` = "implements".keyword
    val `import` = "import".keyword
    val `interface` = "interface".keyword
    val `instanceof` = "instanceof".keyword
    val `new` = "new".keyword
    val `package` = "package".keyword
    val `return` = "return".keyword
    val `super` = "super".keyword
    val `switch` = "switch".keyword
    val `this` = "this".keyword
    val `throws` = "throws".keyword
    val `throw` = "throw".keyword
    val `try` = "try".keyword
    val `while` = "while".keyword

    val `!` = "!".keyword
    val `%` = "%".keyword
    val `%=` = "%=".keyword
    val `&` = "&".keyword
    val `&&` = "&&".keyword
    val `&=` = "&=".keyword
    val `(` = "(".keyword
    val `)` = ")".keyword
    val `*` = "*".keyword
    val `*=` = "*=".keyword
    val `+` = "+".keyword
    val `++` = "++".keyword
    val `+=` = "+=".keyword
    val `,` = ",".keyword
    val `-` = "-".keyword
    val `--` = "--".keyword
    val `-=` = "-=".keyword
    val `=` = "=".keyword
    val `==` = "==".keyword
    val `?` = "?".keyword
    val `@` = "@".keyword
    val `^` = "^".keyword
    val `^=` = "^=".keyword
    val `{` = "{".keyword
    val `|` = "|".keyword
    val `|=` = "|=".keyword
    val `!=` = "!=".keyword
    val `||` = "||".keyword
    val `}` = "}".keyword
    val `~` = "~".keyword

    val div = "/".keyword
    val dive = "/=".keyword
    val gt = ">".keyword
    val lt = "<".keyword
    val ge = ">=".keyword
    val le = "<=".keyword
    val sl = "<<".keyword
    val sle = "<<=".keyword
    val sr = +">>" // to avoid ambiguity with gt
    val sre = ">>=".keyword
    val bsr = +">>>" // to avoid ambiguity with gt
    val bsre = ">>>=".keyword
    val lsbra = "[".keyword
    val rsbra = "]".keyword
    val arrow = "->".keyword
    val colon = ":".keyword
    val dcolon = "::".keyword
    val semi = ";".keyword
    val dot = ".".keyword
    val ellipsis = "...".keyword

    // Identifiers (must come after keywords)

    val idenStart = CharPred (Char::isJavaIdentifierStart)
    val idenPart  = CharPred { it.isJavaIdentifierPart() && it != eofChar }

    val iden = (idenStart .. idenPart.repeat)
        .token { it }

    // Numerals: bits and pieces

    val `_`
        = "_".lit

    val dlit
        = ".".lit

    val hexPrefix
        =  "0x".lit / "0x".lit

    val digit
        = Digit()

    val digits
        =  digit .. (`_`.repeat .. digit).repeat

    val digitsOpt
        = digits.opt

    val hexDigit
        = HexDigit()

    val hexDigits
        =  hexDigit .. (`_`.repeat .. hexDigit).repeat

    val hexNum
        =  hexPrefix..hexDigits

    // Numerals: floating point

    val hexSignificand = choice {
        or { hexPrefix .. hexDigits.opt .. dlit .. hexDigits }
        or { hexNum .. dlit.opt }
    }

    val expSignOpt
        = "+-".set.opt

    val exponent
        =  "eE".set .. expSignOpt .. digits

    val exponentOpt
        = exponent.opt

    val binaryExponent
        =  "pP".set .. expSignOpt .. digits

    val floatSuffix
        = "fFdD".set

    val floatSuffixOpt
        = floatSuffix.opt

    val hexaFloatl
        =  hexSignificand .. binaryExponent .. floatSuffixOpt

    val decFloatl = choice {
        or { digits .. dlit .. digitsOpt .. exponentOpt .. floatSuffixOpt }
        or { dlit .. digits.. exponentOpt .. floatSuffixOpt }
        or { digits .. exponent .. floatSuffixOpt }
        or { digits .. exponentOpt .. floatSuffix }
    }

    val floatl
        = (hexaFloatl / decFloatl)
        .token { parseFloat(it) }

    // Numerals: integral

    val bit
        = "01".set

    val binaryNum
        =  ("0b".lit / "0B".lit) .. bit .. (`_`.repeat .. bit).repeat

    val octalDigit
        = OctalDigit()

    val octalNum
        =  "0".lit .. (`_`.repeat .. octalDigit).repeat1

    val decNum
        = "0".lit / digits

    val integerl
        = ((hexNum / binaryNum / octalNum / decNum) .. "lL".set.opt)
        .token { parseInt(it) }

    // Characters and Strings

    val octalEscape = choice {
        or { ('0' upto '3') .. octalDigit .. octalDigit }
        or { octalDigit .. octalDigit.opt }
    }

    val unicodeEscape
        =  "u".lit.repeat1 .. hexDigit.repeat(4)

    val escape
        =  "\\".lit .. ("btnfr\"'\\".set / octalEscape / unicodeEscape)

    val charl
        = ("'".lit .. (escape / ("'\\\n\r".set.not .. any)) .. "'".lit)
        .token { parseChar(it) }

    val stringl
        = ("\"".lit .. (escape / ("\"\\\n\r".set.not .. any)).repeat .. "\"".lit)
        .token { parseString(it) }

    val literal
        = (floatl / integerl / `true` / `false` / charl / stringl / `null`)
        .build { Literal(get()) }

    /// ANNOTATIONS ================================================================================

    val annotationElement
        = !"ternary" / !"annotationElementList" / !"annotation"

    val annotationElementList
        = !(`{` .. (annotationElement around `,`) .. `,`.opt .. `}`)
        .build { AnnotationElementList(rest()) }

    val annotationElementPair
        = (iden .. `=` .. annotationElement)
        .build { Pair<String, AnnotationElement>(get(), get()) }

    val normalAnnotationSuffix
        = (`(` .. (annotationElementPair around1 `,`) .. `)`)
        .build(1) { NormalAnnotation(get(), rest<Pair<String, AnnotationElement>>()) }

    val singleElementAnnotationSuffix
        = (`(` .. annotationElement .. `)`)
        .build(1) { SingleElementAnnotation(get(), get()) }

    val markerAnnotationSuffix
        = (`(` .. `)`).opt
        .build(1) { MarkerAnnotation(get()) }

    val annotationSuffix = choice {
        or { normalAnnotationSuffix }
        or { singleElementAnnotationSuffix }
        or { markerAnnotationSuffix }
    }

    val qualifiedIden
        = (iden around1 dot)
        .collect<String>()

    val annotation
        = !(`@` ..qualifiedIden.. annotationSuffix)

    val annotations
        = annotation.repeat
        .collect<Annotation>()

    /// TYPES ======================================================================================

    val basicType
        = `byte` / `short` / `int` / `long` / `char` / `float` / `double` / `boolean` / `void`

    val primitiveType
        = (annotations .. basicType)
        .build { PrimitiveType(get(), get()) }

    val extendsBound
        = (`extends` .. !"type")
        .build { ExtendsBound(get()) }

    val superBound
        = (`super` .. !"type")
        .build { SuperBound(get()) }

    val wildcard
        = (annotations .. `?` .. (extendsBound / superBound).maybe)
        .build { Wildcard(get(), maybe()) }

    val typeArgs
        = (lt .. ((!"type" / wildcard) around `,`) .. gt).opt
        .collect<Type>()

    val classTypePart
        = (annotations .. iden .. typeArgs)
        .build  { ClassTypePart(get(), get(), get()) }

    val classType
        = !(classTypePart around1 dot)
        .build { ClassType(rest()) }

    val stemType
        = primitiveType / classType

    val dim
        = (annotations .. lsbra .. rsbra)
        .build { Dimension(get()) }

    val dims
        = dim.repeat
        .collect<Dimension>()

    val dims1
        = dim.repeat1
        .collect<Dimension>()

    val typeDimSuffix
        = dims1
        .build(1) { ArrayType(get(), get()) }

    val type
        = !(stemType .. typeDimSuffix.opt)

    val typeUnionSyntax
        = !"type" around1 `&`

    val typeUnion
        = typeUnionSyntax
        .collect<Type>()

    val typeBounds
        = (`extends` .. typeUnionSyntax).opt
        .collect<Type>()

    val typeParam
        = (annotations .. iden .. typeBounds)
        .build { TypeParam(get(), get(), get()) }

    val typeParams
        = (lt .. (typeParam around `,`) .. gt).opt
        .collect<TypeParam>()

    /// MODIFIERS ==================================================================================

    val keywordModifier = choice {
        or { public }
        or { protected }
        or { private }
        or { abstract }
        or { static }
        or { final }
        or { synchronized }
        or { native }
        or { strictfp }
        or { default }
        or { transient }
        or { volatile }
    }
        .build { Keyword.valueOf(get()) }

    val modifier
        = annotation / keywordModifier

    val modifiers
        = modifier.repeat
        .collect<Modifier>()

    /// PARAMETERS =================================================================================

    val args
        = (`(` .. (!"expr" around `,`) .. `)`)
        .collect<Expr>()

    val thisParameterQualifier
        = (iden .. dot).repeat
        .collect<String>()

    val thisParamSuffix
        = (thisParameterQualifier .. `this`)
        .build(2) { ThisParameter(get(), get(), get()) }

    val idenParamSuffix
        = (iden .. dims)
        .build(2) { IdenParameter(get(), get(), get(), get()) }

    val variadicParamSuffix
        = (annotations .. ellipsis .. iden)
        .build(2) { VariadicParameter(get(), get(), get(), get()) }

    val formalParamSuffix = choice {
        or { idenParamSuffix }
        or { thisParamSuffix }
        or { variadicParamSuffix }
    }

    val formalParam
        =  modifiers .. type .. formalParamSuffix

    val formalParams
        = (`(` .. (formalParam around `,`) .. `)`)
        .build { FormalParameters(rest()) }

    val untypedParams
        = (`(` .. (iden around1 `,`) .. `)`)
        .build { UntypedParameters(rest()) }

    val singleParam
        = iden
        .build { UntypedParameters(listOf(get<String>())) }

    val lambdaParams
        = formalParams / untypedParams / singleParam

    /// NON-TYPE DECLARATIONS ======================================================================

    val varInit
        = !"expr" / !"arrayInit"

    val arrayInit
        = !(`{` .. (varInit around `,`) .. `,`.opt .. `}`)
        .build { ArrayInit(rest()) }

    val varDeclaratorID
        = (iden .. dims)
        .build { VarDeclaratorID(get(), get()) }

    val varDeclarator
        = (varDeclaratorID .. (`=` .. varInit).maybe)
        .build { VarDeclarator(get(), maybe()) }

    val varDeclNoSemi
        = (modifiers .. type .. (varDeclarator around1 `,`))
        .build { VarDecl(get(), get(), rest()) }

    val varDecl
        =  varDeclNoSemi .. semi

    val throwsClause
        = (throws .. (type around `,`)).opt
        .collect<Type>()

    val methodDecl
        = (modifiers .. typeParams .. type .. iden .. formalParams .. dims
        .. throwsClause .. (!"block" / semi).maybe)
        .build { MethodDecl(get(), get(), get(), get(), get(), get(), get(), maybe()) }

    val constructorDecl
        = (modifiers .. typeParams .. iden .. formalParams .. throwsClause .. !"block")
        .build { ConstructorDecl(get(), get(), get(), get(), get(), get()) }

    val initBlock
        = (`static`.asBool .. !"block")
        .build { InitBlock(get(), get()) }

    /// TYPE DECLARATIONS ==========================================================================

    // Common -----------------------------------------------------------------

    val extendsClause
        = (`extends` .. (type around `,`)).opt
        .collect<Type>()

    val implementsClause
        = (`implements` .. (type around `,`)).opt
        .collect<Type>()

    val typeSig
        =  iden .. typeParams .. extendsClause .. implementsClause

    val classBodyDecl = choice {
        or { varDecl }
        or { methodDecl }
        or { !"typeDecl" }
        or { initBlock }
        or { constructorDecl }
        or { semi }
    }

    val classBodyDecls
        = classBodyDecl.repeat
        .collect<Decl>()

    val typeBody
        =  `{` .. classBodyDecls .. `}`

    // Enum -------------------------------------------------------------------

    val enumConstant
        = (annotations .. iden .. args.maybe .. typeBody.maybe)
        .build { EnumConstant(get(), get(), maybe(), maybe()) }

    val enumClassDecls
        = (semi .. classBodyDecl.repeat).opt
        .collect<Decl>()

    val enumConstants
        = ((enumConstant around1 `,`) .. `,`.opt).opt
        .collect<EnumConstant>()

    val enumBody
        = (`{` .. enumConstants .. enumClassDecls .. `}`)
        .doWithStack { push(get(1)) ; push(get(0)) /* swap */ }

    val enumDecl
        = (`enum` .. typeSig .. enumBody)
        .build(1) {
            val td = TypeDecl(ENUM, get(), get(), get(), get(), get(), get())
            EnumDecl(td, get())
        }

    // Annotations ------------------------------------------------------------

    val annotDefaultClause
        = (`default` .. annotationElement)
        .build { get(1) }

    val annotElemDecl
        = (modifiers .. type .. iden .. `(` .. `)` .. dims .. annotDefaultClause.maybe .. semi)
        .build { AnnotationElemDecl(get(), get(), get(), get(), maybe()) }

    val annotBodyDecls
        = (annotElemDecl / classBodyDecl).repeat
        .collect<Decl>()

    val annotationDecl
        = (`@` .. `interface` .. typeSig .. `{` .. annotBodyDecls .. `}`)
        .build(1) {
            TypeDecl(ANNOTATION, get(), get(), get(), get(), get(), get())
        }

    // ------------------------------------------------------------------------

    val classDecl
        = (`class` .. typeSig .. typeBody)
        .build(1) {
            TypeDecl(CLASS, get(), get(), get(), get(), get(), get())
        }

    val interfaceDeclaration
        = (`interface` .. typeSig .. typeBody)
        .build(1) {
            TypeDecl(INTERFACE, get(), get(), get(), get(), get(), get())
        }

    val typeDeclSuffix = choice {
        or { classDecl }
        or { interfaceDeclaration }
        or { enumDecl }
        or { annotationDecl }
    }

    val typeDecl
        = !(modifiers .. typeDeclSuffix)

    val typeDecls
        = typeDecl.repeat
        .collect<Decl>()

    /// EXPRESSIONS ================================================================================

    // Array Constructor ------------------------------------------------------

    val initArrayCreator
        = (stemType .. dims1 .. arrayInit)
        .build { ArrayCtorCall(get(), listOf(), get(), get()) }

    val dimExpr
        = (annotations .. lsbra .. !"expr" .. rsbra)
        .build { DimExpr(get(), get()) }

    val dimExprs
        = dimExpr.repeat1
        .collect<DimExpr>()

    val dimExprArrayCreator
        = (stemType .. dimExprs .. dims)
        .build { ArrayCtorCall(get(), get(), get(), null) }

    val arrayCtorCall
        =  `new` .. (dimExprArrayCreator / initArrayCreator)

    // Lambda Expression ------------------------------------------------------

    val lambda
        = (lambdaParams .. arrow .. (!"block" / !"expr"))
        .build { Lambda(get(), get()) }

    // Expression: Primary ----------------------------------------------------

    val ctorCall
        = (`new` .. typeArgs .. annotations .. stemType .. args.. typeBody.maybe)
        .build { CtorCall(get(), get(), get(), get(), maybe()) }

    val superExpr
        = (`super` .. args.maybe)
        .build {
            maybe<List<Expr>>()
                ?. let { SuperCall(it) }
                ?: Super
        }

    val thisExpr
        = (`this` .. args.maybe)
        .build {
            maybe<List<Expr>>()
                ?. let { ThisCall(it) }
                ?: This
        }

    val idenOrMethodExpr
        = (iden .. args.maybe)
        .build {
            maybe<List<Expr>>(1)
                ?. let { MethodCall(null, listOf(), get(), it) }
                ?: Identifier(get())
        }

    val classExpr
        = (type .. dot .. `class`)
        .build { ClassExpr(get()) }

    val parExpr
        =  `(` .. !"expr" .. `)`

    val methodRef
        = (type .. dcolon .. typeArgs .. iden)
        .build { MethodReference(get(), get(), get()) }

    val newRef
        = (type .. dcolon .. typeArgs .. `new`)
        .build { NewReference(get(), get()) }

    val primaryExpr = choice {
        or { parExpr }
        or { arrayCtorCall }
        or { ctorCall }
        or { classExpr }
        or { methodRef }
        or { newRef }
        or { idenOrMethodExpr }
        or { thisExpr }
        or { superExpr }
        or { literal }
    }

    // Expression: Postfix ----------------------------------------------------

    val dotThis
        = `this`
        .build(1) { DotThis(get()) }

    val dotSuper
        = `super`
        .build(1) { DotSuper(get()) }

    val dotIden
        = iden
        .build(1) { DotIden(get(), get()) }

    val dotNew
        = ctorCall
        .build(1) { DotNew(get(), get()) }

    val dotMethod
        = (typeArgs .. iden .. args)
        .build(1) { MethodCall(get(), get(), get(), get()) }

    val dotPostfix = choice {
        or { dotMethod }
        or { dotIden }
        or { dotThis }
        or { dotSuper }
        or { dotNew }
    }

    val arrayPostfix
        = (lsbra .. !"expr" .. rsbra)
        .build(1) { ArrayAccess(get(), get()) }

    val incSuffix
        = `++`
        .build(1) { PostIncrement(get()) }

    val decSuffix
        = `--`
        .build(1) { PostDecrement(get()) }


    val postfix = choice {
        or { dot .. dotPostfix }
        or { arrayPostfix }
        or { incSuffix }
        or { decSuffix }
    }

    val postfixExpr
        =  primaryExpr .. postfix.repeat

    // Expression: Prefix -----------------------------------------------------

    val incPrefix
        = (`++` .. !"prefixExpr")
        .build { PreIncrement(get()) }

    val decPrefix
        = (`--` .. !"prefixExpr")
        .build { PreDecrement(get()) }

    val unaryPlus
        = (`+`  .. !"prefixExpr")
        .build { UnaryPlus(get()) }

    val unaryMinus
        = (`-`  .. !"prefixExpr")
        .build { UnaryMinus(get()) }

    val complement
        = (`~`  .. !"prefixExpr")
        .build { Complement(get()) }

    val not
        = (`!`  .. !"prefixExpr")
        .build { Not(get()) }

    val cast
        = (`(` .. typeUnion .. `)` .. (!"prefixExpr" / lambda))
        .build { Cast(get(), get()) }

    val prefixExpr = !choice {
        or { incPrefix }
        or { decPrefix }
        or { unaryPlus }
        or { unaryMinus }
        or { complement }
        or { not }
        or { cast }
        or { postfixExpr }
    }

    // Expression: Rest -------------------------------------------------------

    val productSuffix
        = (`*` .. prefixExpr)
        .build(1) { Product(get(), get()) }

    val divisionSuffix
        = (div .. prefixExpr)
        .build(1) { Division(get(), get()) }

    val modSuffix
        = (`%` .. prefixExpr)
        .build(1) { Mod(get(), get()) }

    val multSuffix = choice {
        or { productSuffix }
        or { divisionSuffix }
        or { modSuffix }
    }

    val multExpr
        =  prefixExpr .. multSuffix.repeat

    val sumSuffix
        = (`+` .. multExpr)
        .build(1) { Sum(get(), get()) }

    val diffSuffix
        = (`-` .. multExpr)
        .build(1) { Diff(get(), get()) }

    val addSuffix
        = sumSuffix / diffSuffix

    val addExpr
        =  multExpr .. addSuffix.repeat

    val slSuffix
        = (sl  .. addExpr)
        .build(1) { ShiftLeft(get(), get()) }

    val srSuffix
        = (sr  .. addExpr)
        .build(1) { ShiftRight(get(), get()) }

    val bsrSuffix
        = (bsr  .. addExpr)
        .build(1) { BinaryShiftRight(get(), get()) }

    val shiftSuffix
        = slSuffix / srSuffix / bsrSuffix

    val shiftExpr
        =  addExpr .. shiftSuffix.repeat

    val ltSuffix
        = (lt .. shiftExpr)
        .build(1) { Lower(get(), get()) }

    val leSuffix
        = (le .. shiftExpr)
        .build(1) { LowerEqual(get(), get()) }

    val gtSuffix
        = (gt .. shiftExpr)
        .build(1) { Greater(get(), get()) }

    val geSuffix
        = (ge .. shiftExpr)
        .build(1) { GreaterEqual(get(), get()) }

    val instanceofSuffix
        = (instanceof .. type)
        .build(1) { InstanceOf(get(), get()) }

    val orderSuffix
        = ltSuffix / leSuffix / gtSuffix / geSuffix / instanceofSuffix

    val orderExpr
        =  shiftExpr .. orderSuffix.repeat

    val equalSuffix
        = (`==` .. orderExpr)
        .build(1) { Equal(get(), get()) }

    val notEqualSuffix
        = (`!=` .. orderExpr)
        .build(1) { NotEqual(get(), get()) }

    val eqSuffix = choice {
        or { equalSuffix }
        or { notEqualSuffix }
    }

    val eqExpr
        =  orderExpr .. eqSuffix.repeat

    val binaryAndSuffix
        = (`&` .. eqExpr)
        .build(1) { BinaryAnd(get(), get()) }

    val binaryAndExpr
        =  eqExpr .. binaryAndSuffix.repeat

    val xorSuffix
        = (`^` ..binaryAndExpr)
        .build(1) { Xor(get(), get()) }

    val xorExpr
        =  binaryAndExpr.. xorSuffix.repeat

    val binaryOrSuffix
        = (`|` ..xorExpr)
        .build(1) { BinaryOr(get(), get()) }

    val binaryOrExpr
        =  xorExpr.. binaryOrSuffix.repeat

    val andSuffix
        = (`&&` ..binaryOrExpr)
        .build(1) { And(get(), get()) }

    val andExpr
        =  binaryOrExpr.. andSuffix.repeat

    val orSuffix
        = (`||` ..andExpr)
        .build(1) { Or(get(), get()) }

    val orExpr
        =  andExpr.. orSuffix.repeat

    val ternarySuffix
        = (`?` .. !"expr" .. colon .. (!"ternary" / lambda))
        .build(1) { Ternary(get(), get(), get()) }

    val ternary
        = !(orExpr .. ternarySuffix.opt)

    val assignSuffix
        = (`=`  .. !"expr")
        .build(1) { Assign(get(), get(), "=") }

    val plusAssignSuffix
        = (`+=` .. !"expr")
        .build(1) { Assign(get(), get(), "+=") }

    val minusAssignSuffix
        = (`-=` .. !"expr")
        .build(1) { Assign(get(), get(), "-=") }

    val multAssignSuffix
        = (`*=` .. !"expr")
        .build(1) { Assign(get(), get(), "*=") }

    val divAssignSuffix
        = (dive .. !"expr")
        .build(1) { Assign(get(), get(), "/=") }

    val modAssignSuffix
        = (`%=` .. !"expr")
        .build(1) { Assign(get(), get(), "%=") }

    val slAssignSuffix
        = (sle  .. !"expr")
        .build(1) { Assign(get(), get(), "<<=") }

    val srAssignSuffix
        = (sre  .. !"expr")
        .build(1) { Assign(get(), get(), ">>=") }

    val bsrAssignSuffix
        = (bsre  .. !"expr")
        .build(1) { Assign(get(), get(), ">>>=") }

    val binaryAndAssignSuffix
        = (`&=` .. !"expr")
        .build(1) { Assign(get(), get(), "&=") }

    val xorAssignSuffix
        = (`^=` .. !"expr")
        .build(1) { Assign(get(), get(), "^=") }

    val binaryOrAssignSuffix
        = (`|=` .. !"expr")
        .build(1) { Assign(get(), get(), "|=") }

    val assignmentSuffix = choice {
        or { assignSuffix }
        or { plusAssignSuffix }
        or { minusAssignSuffix }
        or { multAssignSuffix }
        or { divAssignSuffix }
        or { modAssignSuffix }
        or { slAssignSuffix }
        or { srAssignSuffix }
        or { bsrAssignSuffix }
        or { binaryAndAssignSuffix }
        or { xorAssignSuffix }
        or { binaryOrAssignSuffix }
    }

    val assignment
        = !(ternary .. assignmentSuffix.opt)

    val expr
        = !(lambda / assignment)

    /// STATEMENTS =================================================================================

    val ifStmt
        = (`if` .. parExpr .. !"stmt" .. (`else` .. !"stmt").maybe)
        .build { If(get(), get(), maybe())}

    val exprStmtList
        = (expr around `,`)
        .collect<Stmt>()

    val forInit
        = varDeclNoSemi.collect<Stmt>() / exprStmtList

    val basicForStmt
        = ( `for` .. `(`
        ..  forInit .. semi
        ..  expr.maybe .. semi
        ..  exprStmtList.opt
        ..  `)` .. !"stmt")
        .build { BasicFor(get(), maybe(), get(), get()) }

    val forVarDecl
        =  modifiers .. type ..varDeclaratorID.. colon .. expr

    val enhancedForStmt
        = ( `for` .. `(` .. forVarDecl .. `)` .. !"stmt")
        .build { EnhancedFor(get(), get(), get(), get(), get()) }

    val whileStmt
        = ( `while` .. parExpr .. !"stmt")
        .build { WhileStmt(get(), get()) }

    val doWhileStmt
        = ( `do` .. !"stmt" .. `while` .. parExpr .. semi)
        .build { DoWhileStmt(get(), get()) }

    val catchParameterTypes
        = (type around `|`)
        .collect<Type>()

    val catchParameter
        =  modifiers .. catchParameterTypes .. varDeclaratorID

    val catchClause
        = (`catch` .. `(` .. catchParameter .. `)` .. !"block")
        .build { CatchClause(get(), get(), get(), get()) }

    val catchClauses
        = catchClause.repeat
        .collect<CatchClause>()

    val finallyClause
        =  `finally` .. !"block"

    val resource
        = (modifiers .. type .. varDeclaratorID .. `=` .. expr)
        .build { TryResource(get(), get(), get(), get()) }

    val resources
        = (`(` .. (resource around1 semi) .. `)`).opt
        .collect<TryResource>()

    val tryStmt
        = (`try` .. resources .. !"block" .. catchClauses .. finallyClause.maybe)
        .build { TryStmt(get(), get(), get(), maybe()) }

    val defaultLabel
        = (default .. colon)
        .build { DefaultLabel }

    val caseLabel
        = (`case` .. expr .. colon)
        .build { CaseLabel(get()) }

    val switchLabel
        = caseLabel / defaultLabel

    val switchClause
        = (switchLabel .. !"stmts")
        .build { SwitchClause(get(), get()) }

    val switchStmt
        = (`switch` .. parExpr .. `{` .. switchClause.repeat .. `}`)
        .build { SwitchStmt(get(), rest()) }

    val synchronizedStmt
        = (`synchronized` .. parExpr .. !"block")
        .build { SynchronizedStmt(get(1), get(2)) }

    val returnStmt
        = (`return` .. expr.maybe .. semi)
        .build { ReturnStmt(maybe()) }

    val throwStmt
        = (`throw` .. expr .. semi)
        .build { ThrowStmt(get()) }

    val breakStmt
        = (`break` .. iden.maybe .. semi)
        .build { BreakStmt(maybe()) }

    val continueStmt
        = (`continue` .. iden.maybe .. semi)
        .build { ContinueStmt(maybe()) }

    val assertStmt
        = (`assert` .. expr .. (colon .. expr).maybe .. semi)
        .build { AssertStmt(get(), maybe()) }

    val semiStmt
        = semi
        .build { SemiStmt }

    val exprStmt
        =  expr .. semi

    val labelledStmt
        = (iden .. colon .. !"stmt")
        .build { LabelledStmt(get(), get()) }

    val stmt = !choice {
        or { !"block" }
        or {  ifStmt }
        or {  basicForStmt }
        or {  enhancedForStmt }
        or {  whileStmt }
        or {  doWhileStmt }
        or {  tryStmt }
        or {  switchStmt }
        or {  synchronizedStmt }
        or {  returnStmt }
        or {  throwStmt }
        or {  breakStmt }
        or {  continueStmt }
        or {  assertStmt }
        or {  semiStmt }
        or {  exprStmt }
        or {  labelledStmt }
        or {  varDecl }
        or {  typeDecl }
    }

    val block
        = !(`{` .. stmt.repeat .. `}`)
        .build { Block(rest()) }

    val stmts
        = !stmt.repeat
        .collect<Stmt>()

    /// TOP-LEVEL ==================================================================================

    val packageDecl
        = (annotations .. `package` .. qualifiedIden .. semi)
        .build { Package(get(), get()) }

    val importDecl
        = (`import` .. `static`.asBool .. qualifiedIden .. (dot .. `*`).asBool .. semi)
        .build { Import(get(), get(), get()) }

    val importDecls
        = importDecl.repeat
        .collect<Import>()

    override val root: Parser
        = (whitespace .. packageDecl.maybe .. importDecls .. typeDecls)
        .build { File(maybe(), get(), get()) }

    /// CONFIG =====================================================================================

    override val tokenDisambiguation = TokenDisambiguation.LONGEST_MATCH
    override fun requiredStates() = listOf(TokenCache())
}

////////////////////////////////////////////////////////////////////////////////////////////////////
