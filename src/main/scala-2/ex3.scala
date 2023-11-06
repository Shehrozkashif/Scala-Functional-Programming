import scala.math.sqrt

object ex3 {
  def main(args: Array[String]): Unit = {
    val vector: List[Int] = List(3, 4, 5) // Replace with your integer list
    val norm = calculateEuclideanNorm(vector)
    println(s"The Euclidean Norm of the vector is: $norm")
  }

  def calculateEuclideanNorm(vector: List[Int]): Double = {
    val squaredSum = vector.map(x => x * x).sum
    sqrt(squaredSum)
  }
}
