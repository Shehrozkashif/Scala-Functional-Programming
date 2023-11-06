object ex2 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7

    val range = -3 until 3

    val result = range.map(x => quadraticEquation(a, b, c, x))

    println("Original Range:")
    println(range.toList)
    println("Mapped Results:")
    println(result.toList)

    // ziping the lists together

val zip = range.zip(result)
println( " the zipped list"+zip)

    val unzip = zip.unzip
    println(" the unzipped list" + unzip)


  }
  def quadraticEquation(a: Int, b: Int, c: Int, x: Int): Int = {
    a * x * x + b * x + c
  }
}