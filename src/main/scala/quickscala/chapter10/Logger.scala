package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午6:49
  * Description:特质可以被类 多重继承
  * Refer To:
  */
trait Logger {

  //不需要abstract 修饰;

  def log(msg: String)

}
