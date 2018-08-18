package quickscala.chapter6

/**
  * Author: wewe
  * Date:  18-7-29 下午3:24
  * Description:对象
  * 功能:
  *   某个类的实例
  *   函数或者值挂靠的地方
  * 对象可以扩展类和特质
  * Refer To:
  */
object Example {
  def main(args: Array[String]): Unit = {

  /**
    * 对象的构造器在该对象第一次使用时被调用.
    *
    * 本例中Acccounts 的构造器在 Accounts.newUniqueNumber()的首次调用时执行
    * 如果对象从未被使用,那么构造器也不会被执行
    */

    Accounts.newUniqueNumber()
    println(Accounts.newUniqueNumber())

  }
  /**
    * 单例对象 存放工具函数 和 常量的地方
    * 高效地共享单个不可变实例
    * 可以设计单例服务 参考:单例模式
    */
  object Accounts {
    private var lastNumber = 0

    def newUniqueNumber() = {lastNumber +=1;lastNumber}
  }


}
