package quickscala.chapter6

/**
  * Author: wewe
  * Date:  18-7-29 下午4:34
  * Description: appply()
  * Refer To:
  */
object Example3 {
  def main(args: Array[String]): Unit = {
    val acct = Account(1000.0)
    println(acct)
  }

  class Account private (val id:Int,initialBalance :Double){
    private var balance = initialBalance
  }
  object Account { //伴生对象
    private var lastNumber = 0
    private def newUniqueNumber() = {lastNumber += 1;lastNumber}

    def apply(initialBalance :Double) =
      new Account(newUniqueNumber(),initialBalance)
  }
}
