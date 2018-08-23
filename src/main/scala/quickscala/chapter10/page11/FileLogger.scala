package quickscala.chapter10.page11

import java.io.PrintWriter

import quickscala.chapter10.{Logger, SavingAccount}

/**
  * Author: fei2
  * Date:  18-8-15 下午7:44
  * Description:特质不能有构造器参数.每个特质都有一个无参的构造器
  * 类和特质的唯一技术差别是 缺少构造器参数
  * Refer To:
  */
trait FileLogger extends Logger{

  val filename: String

  val out = new PrintWriter(filename)

  def log(msg: String): Unit = {
    out.print(msg)
    out.flush()
  }

  def main(args: Array[String]): Unit = {
//    val acct = new {val filename = "myapp.log"} with SavingAccount with FileLogger
  }
}
