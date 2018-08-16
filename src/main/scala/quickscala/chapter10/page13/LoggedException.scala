package quickscala.chapter10.page13

import quickscala.chapter10.Logged

/**
  * Author: fei2
  * Date:  18-8-15 下午8:18
  * Description:  自身类型 selftype;只能混入指定类型分子类;
  * 该特质并不是扩展Exception类;而是有一个自身类型的Exception;这意味着,它只能混入Exception的子类;
  * 但是并不能够被非 exception 类的 扩展 列如:LoggedException
  *   val f = new JFrame with LoggedException; 错误:JFrame不是Exception的子类型;而Exception是LoggedException的自身类型
  * Refer To:
  */
trait LoggedException extends Logged{
  this: Exception =>
    def log() {log(getMessage)}

}
