package quickscala.chapter10

/**
  * Author: fei2
  * Date:  18-8-15 下午7:47
  * Description: 构造器的构造顺序
  * Refer To:
  */
class SavingAccount3 extends Account with FileLogger with ShortLogger {
  /**
    * 1.Accout(超类)
    * 2.Logger(第一个特质的父类)
    * 3.FileLogger(第一个特质)
    * 4.ShortLogger(第二个特质) 他的父特质Logger 已经被构造
    * 5.SavingsAccout (类)
    *
    * 线性化的反方向
    * >> 线性化的符号 含义:串接并去掉重复项,右侧胜出
    *
    */
}
