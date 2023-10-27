import scala.util.Random

object task1 {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  def main(args: Array[String]): Unit = {
    val random = new Random()
    val numberList = List.fill(15)(random.nextInt(451) + 50)

    val primeNumbersWithPositions = numberList.zipWithIndex.collect {
      case (number, position) if isPrime(number) => (position, number)
    }

    val primeNumberMap = primeNumbersWithPositions.toMap

    // Print the list of prime numbers and the map
    println("Prime Numbers: " + primeNumbersWithPositions.map(_._2))
    println("Map with Positions as Keys: " + primeNumberMap)

  }
}
