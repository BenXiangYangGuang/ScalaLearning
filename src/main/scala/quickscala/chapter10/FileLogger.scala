package quickscala.chapter10

import java.io.PrintWriter

/**
  * Author: fei2
  * Date:  18-8-15 下午7:44
  * Description:
  * Refer To:
  */
trait FileLogger {
  //构造器的一部分
  val out = new PrintWriter("app.log")

  //构造器的一部分
  out.print("# " + new java.util.Date().toString)

  def log(msg: String): Unit = {
    out.print(msg)
    out.flush()
  }
}
