object higherorder {

  def main(args: Array[String]): Unit = {
//  exploring map function
    val integers = Array(1,2,3,4,5)
    val mul = integers.map(m => m * 3)


    // exploring filter function
    val fill = integers.filter(n => n<5)

mul.foreach(println)
println("filter function:")
    fill.foreach(println)

// reduce left function
val reduce = integers.reduce((x, y) => x - y)
println("reduce left function:")
    println(reduce)
// fold left function

    val fold = integers.fold(3)((x, y) => x + y) // Results in 15

    println("fold left function:")
    print(fold)
// for each methode


    println("for each methode:")
      integers.foreach(x => println(x))

      val words = Array("Hello", "World")
      val letters = words.flatMap(word => word.toCharArray)
      println("flat map function:")
      letters.foreach(println)
      println("sort function:")
      val sorted = integers.sortWith((a, b) => a > b)
      sorted.foreach(println)
  }
}
