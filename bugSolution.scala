```scala
class MyClass(val x: Int) {
  def myMethod(y: Option[Int]): Int = {
    y.getOrElse(0) + x 
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(Some(3)))  // Output: 8
  println(obj.myMethod(None))     // Output: 5
}
```