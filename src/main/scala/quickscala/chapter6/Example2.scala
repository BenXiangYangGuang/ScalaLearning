package quickscala.chapter6

/**
  * Author: wewe
  * Date:  18-7-29 下午4:02
  * Description: 伴生对象
  * Refer To:
  */
object Example2 {
  /**
    * 伴生对象
    * 通过类和类同名的"伴生"对象来达到同样的目的
    * 提供 和Java 一样的 既有实例方法 和 静态方法
    */
  /**
    * 类和伴生对象可以相互访问私有特性.他们必须在于同一个源文件中
    */
  class Account {
    val id = Account.newUniqueNumber()
    private var balance = 0.0
    def deposit(amount:Double) {balance += amount}
  }

  object Account { //伴生对象
    private var lastNumber = 0
    private def newUniqueNumber() = {lastNumber += 1;lastNumber}

  }

  /**
    * 对象可以
    * 扩展类或特质
    */
  /**
    *一个object 可以扩展类 以及 一个或多个特质
    */
  abstract class UndoableAction (val description :String){
    def undo(): Unit
    def redo(): Unit
  }

  object DoNothingAction extends UndoableAction("Do Nothing"){
    override def undo(){}

    override def redo(){}
  }


  def main(args: Array[String]): Unit = {

    val action = Map("Open" -> DoNothingAction,"Save" -> DoNothingAction)

  }
}
