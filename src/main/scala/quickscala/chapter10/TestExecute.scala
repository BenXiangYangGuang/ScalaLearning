package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-15 上午9:29
  * Description:
  * Refer To:
  */
object TestExecute {
  def main(args: Array[String]): Unit = {

    /**
      * 当多个特质叠加在一起是,顺序很重要,其方法先被执行的特质排在更后面
      *
      * super.log 调用的是特质层级中的下一个特质,具体是哪一个,要根据特质的添加顺序来决定.
      * 一般来说,特质从最后一个开始被处理. 所有所用到的特质组成一颗任意形态的树/图;
      * 可以使用 super[ConsoleLogger].log().这里给出的类型必须是直接超类型;你无法使用继承层级中更远的特这或类
      */
    // 调用acct1 取款 log信息
    //Wed Aug 15 09:43:30 CST 2018 acct1 shortl...


    // 调用acct2 取款 log信息
    //Wed Aug 15 0...

    val acct1 = new SavingAccount2 with ConsoleLogger2 with TimeStampLogger with ShortLogger
    val acct2 = new SavingAccount2 with ConsoleLogger2 with ShortLogger with TimeStampLogger
    acct1.log("acct1 shortlogger timestamaplogger")
    acct2.log("acct2 timestamaplogger shortlogger")
  }
}
