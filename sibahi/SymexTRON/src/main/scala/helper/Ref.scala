package helper

class Ref[T](private var value : T) {
  def unary_! : T = value
  def :=(newvalue : T) = this.value = newvalue
}

object Ref {
  def apply[T](value : T) = new Ref(value)
}
