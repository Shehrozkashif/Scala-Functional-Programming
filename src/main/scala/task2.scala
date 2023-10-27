object task2 {
  def charListFromAscii(start: Int, end: Int): List[Char] = {
    def loop(current: Int, acc: List[Char]): List[Char] = {
      if (current > end) acc
      else loop(current + 1, acc :+ current.toChar)
    }

    loop(start, Nil)
  }


  def main(args: Array[String]): Unit = {
    val startAscii = 97 // ASCII value for 'a'
    val endAscii = 122   // ASCII value for 'z'

    val charList = charListFromAscii(startAscii, endAscii)

    println("Character List: " + charList.mkString(", "))
  }
}

