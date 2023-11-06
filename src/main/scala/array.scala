object array {

def array ():Unit = {

  val arr: Array[Int] = Array(1, 2, 3, 4, 5)
  val myArray: Array[Int] = Array(1, 2, 3, 4, 5)
  val rangeArray = Array.range(1, 6)
  val arr1 = Array(1, 2)

  val elemnt1: Int = arr(0)
  val elemnt2: Int = arr(1)

  arr(2) = 10

  val length: Int = arr.length

  for(i <- 0 until length){

    println(arr(i))

  }
  println("the total lenght of the array is :"+length)

}

  def main(args: Array[String]): Unit = {
    array()
  }
}
