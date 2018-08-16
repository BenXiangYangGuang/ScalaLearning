package quickscala.chapter10.page8

/**
  * Author: fei2
  * Date:  18-8-15 下午7:25
  * Description: 抽象方法和实现方法在一起
  * Refer To:
  */
trait Logger {
  def log(msg: String)
  def info(msg: String) { log("INFO: " + msg) }
  def warn(msg: String) { log("WARN: " + msg )}
  def server(msg: String) { log("SERVER: " + msg)}

}
