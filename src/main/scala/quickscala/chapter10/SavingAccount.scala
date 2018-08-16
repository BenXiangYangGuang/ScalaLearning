package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午6:57
  * Description:
  * Refer To:
  */
class SavingAccount extends Account with ConsoleLogger2{

  var balance = 200D
  def withdraw(amount: Double): Unit ={
    if (amount > balance) log("insufficient funds") //ConsoleLogger2 的功能"混入了"SavingAccount;当特质改变时,所有混入了该特质的类都必须重新编译
    else
      balance -= amount

  }

}
