package quickscala.chapter10.page12

/**
  * Author: fei2
  * Date:  18-8-15 下午8:11
  * Description:
  * Refer To:
  */
class UnhappyException extends LoggedException { //该类扩展自一个特质

  override def getMessage: String = "arggh!"

}
