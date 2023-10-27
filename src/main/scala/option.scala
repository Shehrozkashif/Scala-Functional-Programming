object option {

  def getUser(username: Option[String]): String = {
    username match {
      case Some(username) => s"Hello, $username!"
      case None => "Hello, guest!"
    }
  }

  def main(args: Array[String]): Unit = {
    val user1: Option[String] = Some("Alice")
    val user2: Option[String] = None

    val greeting1 = getUser(user1)
    val greeting2 = getUser(user2)

    println(greeting1) // "Hello, Alice!"
    println(greeting2) // "Hello, guest!"
  }
}
