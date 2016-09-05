package norswap.javag
import norswap.autumn.Context
import norswap.autumn.DEBUG
import norswap.autumn.Grammar
import norswap.autumn.diagnostic
import norswap.autumn.syntax.alias
import norswap.autumn.result.Failure

var list = listOf("")
var inspect = false

fun main (args: Array<String>)
{
    println("\n-------------\n")
    DEBUG = true

    list = listOf(
        "42.42e+42f",
        "42.",
        "42.e-2f",
        ".42",
        ".42e42",
        ".42f",
        ".42e42f",
        "32f",
        "32d",
        "42e42",
        "42e+2",
        "0x8p0",
        "0x8p8",
        "0x8.8p0",
        "0x8.8p0d",
        "42L",
        "true",
        "false",
        "null",
        "\"\\u07FF\"",
        "'a'",
        "\"\\177\"",
        "'\\177'",
        "'\\u07FF'")

    parse(object: Java() { override val root = literal.alias })

    list = listOf(
        "char",
        "int",
        "long",
        "String",
        "java.util.String",
        "List<?>",
        "List<T>",
        "List<? super T>",
        "List<? extends T>",
        "java.util.List<?>",
        "java.util.List<T>",
        "java.util.List<? super T>",
        "char[]",
        "int[][]",
        "long[][][]",
        "String[]",
        "java.util.String[][]",
        "List<?>[]",
        "List<T>[][]",
        "List<? super T>[]",
        "List<? extends T>[][]",
        "java.util.List<?>[]",
        "java.util.List<T>[][]",
        "java.util.List<? super T>[][]",
        "List<List<T>>",
        "List<? extends List<? super T>>[]"
    )

    parse(object: Java() { override val root = type.alias })

    list = listOf(
        // primary
        "new String()",
        "new <T> Test()",
        "new Test<T>()",
        "new <T> Test<U>()",
        "foo",
        "foo1",
        "foo_bar_baz$",
        "foo()",
        "foo(1, 2)",
        "this",
        "super",
        "this()",
        "super()",
        "this(1, x())",
        "super(1, x())",
        "void.class",
        "int.class",
        "List.class",
        "java.util.List.class",
        "new int[42]",
        "new int[42][]",
        "new int[1][2][][]",
        "new int[] { 1, 2, 3 }",
        "new int[] { 1, 2, }",
        "new int[] { , }",
        "new int[][] { {1, 2}, {3, 4} }",
        "new java.util.List<String>[][] { {a, b}, {c, d} }",
        "foo::bar",
        "foo::new",
        "foo::<T>bar",
        "foo::<U, V>new",
        "List.foo::<T>bar",

        // postfix
        "foo.this",
        "foo.super",
        "foo.m()",
        "foo.<T, U>m(a, b)",
        "foo.bar",
        "foo.new Bar()",
        "foo.new <U> Bar(a, b)",
        "foo++",
        "foo--",
        // prefix
        "++1",
        "--1",
        "+1",
        "-1",
        "~1",
        "!true",
        "(String) obj",
        "++ x.y",
        "-- new Integer(1)",
        "!x.y(1)",
        "(String & Serializable & Cloneable) obj.x",

        // left-assoc binary (simple tests)
        "1 * 1",
        "1/1",
        "2%3.",
        "x+1",
        "1-x",
        "1 << 3",
        "16 >> 3",
        "16 >>> 3",
        "1 < 3",
        "1 <= 3",
        "1 > 3",
        "1 >= 3",
        "1 == 1",
        "1 != 1",
        "8 & 1",
        "8 ^ 1",
        "8 | 1",
        "true && false",
        "true || false",

        // left-assoc binary (left-assoc + same prec tests)
        "1 * 2 * 3",
        "1 / 2 / 3",
        "1 % 2 % 3",
        "1 * 2 / 3 % 4",
        "1 % 2 / 3 * 4",
        "1 + 2 + 3",
        "1 - 2 - 3",
        "1 + 2 - 3",
        "1 - 2 + 3",
        "1 >> 2 >> 3",
        "1 << 2 << 3",
        "1 >>> 2 >>> 3",
        "1 << 2 >> 3 >>> 4",
        "1 >>> 2 >> 3 << 4",
        "1 < 2 < 3",
        "1 > 2 > 3",
        "1 <= 2 <= 3",
        "1 >= 2 >= 3",
        "1 < 2 <= 3 > 4 >= 5",
        "1 >= 2 > 3 <= 4 < 5",
        "x == y == z",
        "x != y != z",
        "x == y != z",
        "x != y == z",
        "1 & 2 & 3",
        "1 ^ 2 ^ 3",
        "1 | 2 | 3",
        "1 & 2 ^ 3 | 4",
        "1 | 2 ^ 3 & 4",
        "true && true && true",
        "true || true || true",
        "true || true && true",
        "true && true || true",

        // left-assoc binary (precedence tests)
        "1 * 2 + 3 << 4",
        "1 << 2 + 3 * 4",
        "1 << 12 << 2 + 23 + 3 * 34 * 4",
        "1 || 2 && 3 | 4 ^ 5 & 6 == 7 > 8 >> 9 + 10 * 11",

        // assignment
        "x = 3",
        "x += 3",
        "x -= 4",
        "x *= 3",
        "x /= 3",
        "x %= 3",
        "x <<= 3",
        "x >>= 3",
        "x >>>= 3",

        // lambda (no body)
        "x -> {}",
        "x -> expr[1].lol",
        "() -> {}",
        "() -> expr[1].lol",
        "(x) -> {}",
        "(x) -> expr[1].lol",
        "(x, y) -> {}",
        "(x, y) -> expr[1].lol",
        "(String x) -> {}",
        "(String x) -> expr[1].lol",
        "(String x, int y) -> {}",
        "(String x, int y) -> expr[1].lol",
        "(String... x) -> lol",
        "(int x, int @Annot ... ys) -> lol"
    )

    inspect = true
    parse(object: Java() { override val root = expr.alias })
    inspect = false

    list = listOf(
        "@Marker",
        "@Marker()",
        "@Single(true ? x.y : x.y()[1])",
        "@Single(@Marker)",
        "@Single({@Marker, true ? x.y : x.y()[1]})",
        "@Single({})",
        "@Single({,})",
        "@Single({x,})",
        "@Pairs(x = @Marker, y = true ? x.y : x.y()[1], z = {@Marker, 42})"
    )

    parse(object: Java() { override val root = annotation.alias })

    list = listOf(
        // empty bodies
        "interface Hello {}",
        "@interface Hello {}",
        "class Hello {}",
        "enum Hello {}",
        "@Annot private interface Hello<T> {}",
        "interface Hello<@Annot T extends String & Cloneable> {}",
        "interface Hello<T> extends A, B, C {}",
        "class Hello<T> extends World implements A, B, C {}",
        "@Annot public enum X {;}"
    )

    parse(object: Java() { override val root = typeDecl.alias })

    list = listOf (
        "int x;",
        "int x = 1;",
        "int x = 1, y;",
        "@Annot final List<String> name = x, stuff[] = array();",
        "@Annot <T extends Stuff & Thing, X extends List<?>> String meth (int x, int y)[] ;",
        "void meth() throws Exception {}",
        "@Annot <T extends Stuff> MyClass (int x) throws Error {}",
        "{ myVar = x; }",
        "static { someFunc(); myVar = x; }"
    )

    parse(object: Java() { override val root = classBodyDecl.alias })

    list = listOf (
        "int x;",
        "int x = 1;",
        "int x = 1, y;",
        "@Annot final List<String> name = x, stuff[] = array();",
        "if (true) ; else ;",
        "for (;;) ;",
        "for (int i = 0 ; true ; ++i, ++j) ;",
        "for (i = 0, j = 0 ; i < 10 ; ++i) ;",
        "for (@Annot String x : list) ;",
        "while (true) ;",
        "do ; while (true);",
        "try {} catch (Exception e) {} finally {}",
        "try {} finally {}",
        "try {} catch (Exception e) {}",
        "try {} catch (@Annot Exception|Error e) {}",
        "try (@Annot Resource res[] = myres) {} finally {}",
        "try (Resource res[] = myres ; Resource x = youpie()) {} finally {}",
        "switch (x) { case 1: dox(); doy(); case 2: case 3: doz(); break; default: dou();}",
        "switch (x) {}",
        "synchronized (expr) {}",
        "return;",
        "return x;",
        "throw new Exception(lol);",
        "assert x || y && z : lol;",
        "assert x || y;",
        "continue;",
        "continue label;",
        "break;",
        "break label;",
        "label: funCall();",
        "label: while (x) {}",
        ";",
        "funcall();",
        "++i;"
    )

    parse(object: Java() { override val root = stmt.alias })

    list = listOf (
        // type bodies
        "class C { @Annot final int var = 0; }",
        "class C { @Annot private @Annut void method(String x) { return x; }}",
        "interface I { void meth(int x); }",
        "class C { class D {} }",
        "class C { int x; static class D {}; void test(int x) {} }",
        "@interface AI { String value(); }",
        "@interface AI { Annot value() default @Annot; }",
        "@interface AI { @Annot String value()[] default \"hello\" ; }",
        "@interface AI { @interface AI2 {} }",
        "enum E { ; }",
        "enum E { X, Y, Z }",
        "enum E { X, Y, Z; }",
        "enum E { @Annot X (x) { void test(); }, Y } ",
        "enum E { X(), Y; void test(int x); int y; }"
    )

    parse(object: Java() { override val root = typeDecl.alias })
}

fun parse (grammar: Grammar)
{
    for (input in list) {
        val context = Context(input, grammar)
        val result = context.parse()
        if (inspect || result is Failure) {
            println(input)
            println(diagnostic(context, result))
            println("\n" + context.stack)
            println("\n-------------\n")
        }
    }
}
