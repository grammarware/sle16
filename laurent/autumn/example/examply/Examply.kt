@file:Suppress("UNCHECKED_CAST")
package examply
import norswap.autumn.*
import norswap.autumn.parsers.*
import norswap.autumn.syntax.*
import norswap.autumn.result.Success
import norswap.autumn.utils.*
import norswap.violin.*
import norswap.violin.link.LinkList
import norswap.violin.stream.*
import norswap.violin.utils.*
import java.util.HashMap

object Examply : Grammar()
{
    override fun requiredStates() = listOf(IndentMap(), IndentStack(), TypeStack())

    /// "LEXICAL" //////////////////////////////////////////////////////////////////////////////////

    val any         = AnyChar()
    val alpha       = Alpha()
    val alphaNum    = AlphaNum()
    val digit       = Digit()
    val `"`         = "\""

    val iden = Seq(alpha, alphaNum.repeat)
        .atom { it }

    val int = digit.repeat1
        .atom { it.toInt() }

    val string = Seq(+`"`, any until +`"`)
        .atom { it.removeSurrounding(`"`, `"`) }

    /// INDENTATION ////////////////////////////////////////////////////////////////////////////////

    data class IndentEntry (
        val count: Int,
        val end: Int)

    class IndentMap: InertState<IndentMap>
    {
        lateinit var map: Map<Int, IndentEntry>

        fun get(ctx: Context): IndentEntry =
            map[ctx.lineMap.lineFromOffset(ctx.pos)]!!

        override fun toString() = map.toString()
    }

    class IndentStack: StackState<Int>()

    val Context.indent: IndentEntry /**/ get() = state(IndentMap::class).get(this)
    val Context.istack: IndentStack /**/ get() = state(IndentStack::class)

    val buildIndentMap = Parser { ctx ->
        val map = HashMap<Int, IndentEntry>()
        var pos = 0
        ctx.text.split('\n').forEachIndexed { i, str ->
            val wspace = str.takeWhile { it == ' ' || it == '\t' }
            val count = wspace.expandTabs(4).length
            map.put(i, IndentEntry(count, pos + wspace.length))
            pos += str.length + 1
        }
        ctx.state(IndentMap::class).map = map
        Success
    }

    val indent = Parser { ctx ->
        val new = ctx.indent.count
        val old = ctx.istack.peek() ?: 0
        if (new > old) Success after { ctx.istack.push(new) }
        else failure(ctx) { "Expecting indentation > $old positions (found: $new positions)" }
    }

    val dedent = Parser { ctx ->
        val new = ctx.indent.count
        val old = ctx.istack.peek() ?: 0
        if (new < old || ctx.pos == ctx.text.length - 1) Success after { ctx.istack.pop() }
        else failure(ctx) { "Expecting indentation < $old positions (found: $new positions)" }
    }

    val newline = Predicate { ctx -> ctx.pos == ctx.indent.end || ctx.pos == ctx.text.length - 1 }

    /// TYPES //////////////////////////////////////////////////////////////////////////////////////

    data class Type (val name: String, val priv: LinkList<Type>)
    class TypeStack: MonotonicStack<Type>()
    val Context.types: TypeStack /**/ get() = state(TypeStack::class)

    fun isType(ctx: Context, iden: String): Boolean
        = ctx.types.stream().any { it.name == iden }

    fun priv(ctx: Context, iden: String): LinkList<Type>
        = ctx.types.stream().filter { it.name == iden }.next() ?.priv ?: LinkList()

    fun NewType (child: Parser, alias: Boolean = false) = Parser { ctx ->
        child.parse(ctx) andDo {
            val name = ctx.stack.peek() as String
            ctx.types.push(Type(name, if (alias) priv(ctx, name) else LinkList()))
    }   }

    fun Scoped(body: Parser) = Parser { ctx ->
        val size = ctx.types.size
        body.parse(ctx) andDo { ctx.types.truncate(size) }
    }

    fun inherit(ctx: Context, name: String)
        = priv(ctx, name).stream().each { ctx.types.push(it) }

    fun ClassDef (body: Parser) = Parser { ctx ->
        val parent = ctx.stack.at(0) as Maybe<SimpleType>
        val name = ctx.stack.at(1) as String
        val snapshot = ctx.types.snapshot()
        if (parent is Some<SimpleType>) inherit(ctx, parent.value.name)
        body.parse(ctx) andDo {
            val diff = ctx.types.diff(snapshot)
            ctx.types.restore(snapshot)
            ctx.types.pop()
            ctx.types.push(Type(name, diff))
    }   }

    val anonClassInherit = Perform { ctx -> inherit(ctx, ctx.stack.at(1) as String) }

    val classGuard = Seq(iden, Predicate { ctx -> isType(ctx, ctx.stack.peek() as String) }).ahead

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /// --- Types

    val identifier = iden
        .build { Identifier(get()) }

    val simpleType = iden
        .build { SimpleType(get()) }

    val funTypeParams = Seq(+"(", !"type" around +",", +")")
        .collect<Type>()

    val funType = Seq(funTypeParams, +"->", !"type")
        .build { FunType(get(), get()) }

    val type = !Choice(simpleType, funType)

    val typedIden = Seq(iden, Seq(+":", type).maybe)
        .build { TypedIdentifier(get(), maybe()) }

    val paramDecls = (typedIden around +",")
        .collect<TypedIdentifier>()

    val paramArrow = Seq(paramDecls, +"->").maybe
        .build { maybe() ?: emptyList<TypedIdentifier>() }

    /// --- Expressions

    val parenExpr = Seq(+"(", !"expr", +")")

    val stringLit = string
        .build { StringLit(get()) }

    val intLit = int
        .build { IntegerLit(get()) }

    val paramList = Seq(+"(", !"expr" around +",", +")")
        .collect<Expr>()

    val thisCall = Seq(+"this", paramList)
        .build { ThisCall(get()) }

    val `this` = (+"this")
        .build { This }

    val superCall = Seq(+"super", paramList)
        .build { SuperCall(get()) }

    val funCall = Seq(iden, paramList)
        .build { FunCall(get(), get()) }

    val ctorCall = Seq(classGuard, iden, paramList)
        .build { CtorCall(get(), get(), null) }

    val lambda = Seq(+"{", paramArrow, !"expr", +"}")
        .build { Lambda(get(), listOf(Return(get()))) }

    val simple = Choice(
        parenExpr,
        stringLit,
        intLit,
        thisCall,
        `this`,
        superCall,
        ctorCall,
        funCall,
        identifier,
        lambda)

    val methodCall = Seq(!"postfix", +".", funCall)
        .build { MethodCall(get(), get()) }

    val fieldAccess = Seq(!"postfix", +".", iden)
        .build { FieldAccess(get(), get()) }

    val postfix = !Choice(methodCall, fieldAccess, simple)

    val sum = Seq(!"additive", +"+", postfix)
        .build { Sum(get(), get()) }

    val diff = Seq(!"additive", +"-", postfix)
        .build { Diff(get(), get()) }

    val additive = !Choice(sum, diff, postfix)

    val assignSuffix
        = Seq(+"=", !"assign")
        .build(1) { Assign(get(), get()) }

    val assign
        = Seq(additive, assignSuffix.opt)

    // val assign = Seq(additive, ZeroMore(Seq(+"=", additive)).collect)
    //    .rightAssoc<Expr> { acc, item -> Assign(item, acc) }

    val expr = !assign

    // --- Statements

    val statements = Seq(indent, Scoped(!"statement" until dedent))
        .collect<Stmt>()

    val decls = Seq(indent, ((!"decl") until dedent))
        .build { rest<Decl>() }

    val `if` = Seq(+"if", expr, statements)
        .build { If(get(), get()) }

    val `while`= Seq(+"while", expr, statements)
        .build { While(get(), get()) }

    val `return` = Seq(+"return", expr.maybe, newline)
        .build { Return(maybe()) }

    val `break` = Seq(+"break", newline)
        .build { Break }

    val `continue` = Seq(+"continue", newline)
        .build { Continue }

    val skip = Seq(+"skip", newline)
        .build { Skip }

    val blockCallSuffix = Seq(paramArrow, statements)

    val blockFunCall = Seq(funCall, blockCallSuffix)
        .build {
            val call = get<FunCall>()
            call.copy(params = call.params + Lambda(get(), get()))
        }

    val aMethodCall = Predicate { ctx -> ctx.stack.peek() is MethodCall }

    val blockMethodCall = Seq(aMethodCall, blockCallSuffix)
        .build {
            val call = get<MethodCall>()
            call.copy(right = call.right.copy(params = call.right.params + Lambda(get(), get())))
        }

    val blockCtorBody = Scoped(Seq(anonClassInherit, decls))

    val blockCtor = Seq(classGuard, iden, paramList, blockCtorBody)
        .build { CtorCall(get(), get(), get()) }

    val blockCall = Choice(blockCtor, blockMethodCall, blockFunCall)

    val varRight = Seq(+"=", Choice(blockCall, expr)).maybe

    val `val` = Seq(+"val", typedIden, varRight, newline)
        .build { Val(get(), maybe()) }

    val `var` = Seq(+"var", typedIden, varRight, newline)
        .build { Var(get(), maybe()) }

    // --- Classes

    val classBody = ClassDef(decls.maybe)
        .build { maybe() ?: emptyList<Decl>() }

    val `class` = Seq(+"class", NewType(iden), Seq(+":", simpleType).maybe, classBody)
        .build { Class(get(), maybe(), get()) }

    val alias = Seq(+"alias", NewType(iden, alias = true), +"=", type)
        .build { Alias(get(), get()) }

    val parenParamDecls = Seq(+"(", paramDecls, +")")

    val returnType = Seq(+":", type).maybe

    val `fun` = Seq(+"fun", iden, parenParamDecls, returnType, statements)
        .build { Fun(get(), get(), maybe(), get()) }

    val constructor = Seq(+"constructor", parenParamDecls, statements)
        .build { Constructor(get(), get()) }

    val blockAssign = Seq(identifier, +"=", blockCall)
        .build { Assign(get(), get()) }

    val decl = !Choice(`val`, `var`, `fun`, alias, `class`, constructor)

    val statement = !Choice(
            `if`, `while`, `break`, `continue`, `return`, skip,
            blockAssign, decl, blockCall, Seq(expr, newline))

    val pkgString = (iden around +".")
        .collect<String>()

    val import = Seq(+"import", pkgString, +":", NewType(iden))
        .build { Import(get(), get()) }

    val imports = (import around newline)
        .collect<Import>()

    val classes = `class`.repeat
        .collect<Class>()

    override val root = Scoped(Seq(whitespace, buildIndentMap, imports, classes))
        .build { File(get(), get()) }
}
