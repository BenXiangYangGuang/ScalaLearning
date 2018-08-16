package quickscala.chapter10.page12

import quickscala.chapter10.Logged

/**
  * Author: fei2
  * Date:  18-8-15 下午8:07
  * Description:特质继承类(Exception);该特质的子类(UnhappyException)自动混入了超类(Exception);成为了他的父类;
  * 该特质的子类(UnhappyException)也可以继承父类,但是子类(UnhappyException)的父类必须和特质继承的类(Exception)必须相关
  * Refer To:
  */
class LoggedException extends Exception with Logged{

  def log() { log(getMessage) }

}
