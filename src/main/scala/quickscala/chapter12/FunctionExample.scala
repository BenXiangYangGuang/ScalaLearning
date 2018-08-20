package quickscala.chapter12

/**
  * Author: fei2
  * Date:  18-8-16 下午8:05
  * Description:函数是有类型的  (参数类型) => 结果类型
  * Refer To:
  */
object FunctionExample {

  def main(args: Array[String]): Unit = {

    /**
      * 闭包由代码和代码用到的任何非局部变量定义构成
      * 每一个函数都有自己的内部变量,这样的函数叫做闭包
      */
    def mulBy(factor: Double) = (x: Double) => factor * x

    val half = mulBy(0.5)

    println(half(14))  //7

  }

}
