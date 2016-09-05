package norswap.arithg

interface Expr
data class Assign   (val l: Var,  var R: Expr): Expr
data class Sum      (val l: Expr, val r: Expr): Expr
data class Sub      (val l: Expr, val r: Expr): Expr
data class Mul      (val l: Expr, val r: Expr): Expr
data class Div      (val l: Expr, val r: Expr): Expr
data class Exp      (val l: Expr, val r: Expr): Expr
data class Num      (val v: Int)
data class Var      (val v: String)
