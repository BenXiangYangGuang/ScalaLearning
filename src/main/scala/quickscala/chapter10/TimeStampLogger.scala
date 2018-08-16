package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午7:24
  * Description:  叠加在一起的特质
  * Refer To:
  */
trait TimeStampLogger extends Logged{
  override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)

  }

}
