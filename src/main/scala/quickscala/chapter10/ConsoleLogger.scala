package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午6:51
  * Description:
  * Refer To:
  */
class ConsoleLogger extends Logger with Cloneable with Serializable { //使用 extends ,而不是 implements 多个用 with
  override def log(msg: String): Unit = ???  // 在重写特质的抽象方法时不需要写 override 关键字
}
