package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午7:26
  * Description:截断过长的日志消息
  * Refer To:
  */
trait ShortLogger extends Logged {

  //子类并不是,继承maxLength;而是混入到子类的自己的字段;和继承的字段排在一起
  val maxLength = 15

  override def log(msg: String) {
    super.log(
      if (msg.length <= maxLength) msg
      else msg.substring(0, maxLength - 3) + "...")
  }

}