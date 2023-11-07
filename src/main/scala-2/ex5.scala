object ex5 {
  class FSM {
    private var state: String = "StateA"

    def transition(event: String): Unit = {
      (state, event) match {
        case ("StateA", "event1") => state = "StateB"
        case ("StateA", "event2") => state = "StateC"
        case ("StateB", "event3") => state = "StateA"
        case ("StateC", "event4") => state = "StateA"
        case _ => println("Invalid transition")
      }
    }
  }
}

object FSMExample {
  def main(args: Array[String]): Unit = {
    val fsm = new ex5.FSM()

    fsm.transition("event1") // Transition to StateB
    fsm.transition("event2") // Transition to StateC
    fsm.transition("event3") // Transition back to StateA
    fsm.transition("event4") // Transition back to StateA
  }
}