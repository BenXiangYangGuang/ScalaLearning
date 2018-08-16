package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午6:54
  * Description: 带有实现是特质
  * Refer To:
  */
trait ConsoleLogger2 extends Logged{

  override def log(msg: String) {println(msg)}

}
