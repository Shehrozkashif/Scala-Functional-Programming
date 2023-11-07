object ex4 {


  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4.5)

    val list2 = list1.map(x => x * 2)
    println("list elemnts mul by 2" + list2)

    def f(x: Double) = if (x > 2) x * x else None

    val listsquared = list1.map(x => f(x))

    println("sqaured list " + listsquared)

    val list = List(1,2,3,4,5)

    def g(v:Int)= List(v-1,v,v+1)
    val extendedlist= list.map(x => g(x))
    println("sqaured list " + extendedlist)
  }
}
