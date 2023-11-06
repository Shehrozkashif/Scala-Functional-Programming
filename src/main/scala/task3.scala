object task3 {
  def main(args: Array[String]): Unit = {
    val arr1: Array[Int] = Array(1, 2, 3, 4, 5)
    val arr2: Array[Int] = Array(1, 2, 3, 4, 5)
    val length = arr1.length

    // Create a new array 'arr' to store the result
    val arr: Array[Int] = new Array[Int](length)

    for (i <- 0 until length) {
      arr(i) = arr1(i) + arr2(i)
    }

    // Print the result array
    println(arr.mkString(", "))
  }
}