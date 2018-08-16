package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-14 下午7:24
  * Description:  abstract 修饰
  * Refer To:
  */
trait TimeStampLogger extends Logger{
  abstract override def log(msg: String) {
    super.log(new java.util.Date() + " " + msg)
  }

}
