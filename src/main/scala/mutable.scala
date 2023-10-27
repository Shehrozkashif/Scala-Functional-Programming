import scala.collection.mutable.Set
import scala.collection.mutable.Map
object mutable {

  def set(): Unit = {

    val mutableset =Set(1,2,3,4,5)
println("set is here:"+ mutableset )

    mutableset +=6
    println("after adding new element:"+ mutableset)
  }

  def map(): Unit = {

    val mutablemap= Map("a"-> 1,"b"->2,"b"->3)
    println("set is here:" + mutablemap)

    mutablemap("c") = 6
    println("after adding new element:" + mutablemap)
  }
  def main(args: Array[String]): Unit = {
    set()
    map()
  }
}
