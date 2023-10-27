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
  def countEvenRecursively(arr: Array[Int]): Int = {
    if (arr.isEmpty) {
      0
    } else {
      val currentElement = arr.head
      val restOfArray = arr.tail
      val evenCountInRest = countEvenRecursively(restOfArray)

      if (currentElement % 2 == 0) {
        evenCountInRest + 1
      } else {
        evenCountInRest // Otherwise, keep the count as it is
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val randomArray = Array.fill(100)(util.Random.nextInt(100) + 1)
    even(randomArray)

    val evenCount1 = countEvenRecursively(randomArray)
    println(s"Using recursion: Number of even values = $evenCount1")

    // Technique 2: Using the count higher-order method
    val evenCount2 = randomArray.count(_ % 2 == 0)
    println(s"Using count method: Number of even values = $evenCount2")

  }
}