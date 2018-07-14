import java.util

/**
  * Author: fei2
  * Date:  18-7-13 下午5:57
  * Description:
  * Refer To:
  */

// 隐藏成员
//import java.util.{HashMap => _, _} // 引入了util包的所有成员,引入是不用util.HashSet,直接HashSet,但是HashMap被隐藏了;不能使用
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}
