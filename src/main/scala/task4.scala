object task4 {
  def even(arr: Array[Int]): Unit = {
    val length = arr.length

    var e = 0
    for (i <- 0 until length) {
      if (arr(i) % 2 == 0) {
        e = e + 1
      }
    }
    println("The number of even numbers in the array: " + e)
  }

  def main(args: Array[String]): Unit = {
    val randomArray = Array.fill(100)(util.Random.nextInt(100) + 1)
    even(randomArray)
  }
}