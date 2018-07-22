package newbies

import scala.util.control.Breaks

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

    //for 循环 从0开始  到6 结束;输出 0,1,2,3,4,5
    for (i <- 0 until 6){
      println(i)
    }
    //终端循环
    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)
    val loop = new Breaks
    loop.breakable({
      for ( a <-numList){
        println("Value of a :" +a)
        if (a == 4){
          loop.break()
        }
      }
    })
    println("After the loop")
    //中断嵌套循环
    var aa = 0
    var bb = 0

    val numList1 = List(1,2,3,4,5)
    val numList2 = List(11,12,13)
    val outer = new Breaks
    val inner = new Breaks

    outer.breakable({
      for (aa <- numList1){
        println("Value of aa :" +aa)
        inner.breakable({
          for (bb <- numList2){
            println("Value of bb:" + bb)
            if (bb==12){
              inner.break()
            }
          }
        })//内嵌套循环中断
      }

    })//外嵌套循环中断

    //类中的函数叫做方法
    //val 定义函数 def 定义方法
    /**
      * def m(x: Int) = x + 3
        val f = (x: Int) => x + 3
      */
    /**
      *
      * @param a
      * @param b
      * @return
      */

    def addInt(a:Int,b:Int):Int = {
      var sum:Int = 0
      sum = a + b
      return sum
    }
    //方法调用
    println("Return value :" + addInt(5,7))
  }
}
