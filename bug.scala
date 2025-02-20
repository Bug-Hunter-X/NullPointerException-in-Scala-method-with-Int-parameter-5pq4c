```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(3)) // this will output 8
  println(obj.myMethod(null)) // this will throw a NullPointerException
}
```