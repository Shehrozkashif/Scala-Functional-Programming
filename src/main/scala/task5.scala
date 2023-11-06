object task5 {
  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = x % 2 == 0 // Define a function that checks if an entry is even or not

    val result = buildMap(lst, func)
    println(result)
  }

  def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A] = {
    var resultMap = Map[B, A]()
    for (element <- data) {
      val key = f(element)
      resultMap += (key -> element)
    }
    resultMap
  }
}