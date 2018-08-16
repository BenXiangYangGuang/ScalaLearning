package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午7:14
  * Description: 带有特质的对象
  * Refer To:
  */
class SavingAccount2 extends Account with Logged {

  var balance: Double = 200

  def withdraw(amount: Double): Unit ={
    if (amount > balance) log("Insufficient funds")
    else
      balance -= amount
  }

  def main(args: Array[String]): Unit = {
    //ConsoleLogger2继承了Logged方法;创建的时候进行with.
    // 当acct 调用log方法时,ConsoleLogger2的log方法就会被执行
    val acct = new SavingAccount2 with ConsoleLogger2
  }

}
