package quickscala.chapter1

/**
  * Author: wewe
  * Date:  18-7-22 下午4:45
  * Description:apply()方法
  * Refer To:
  */
object ApplyExample {
  def main(args: Array[String]): Unit = {

    /**
      * 这种用法相当与() 操作符重载
      * 背后实现原理是StringOps中的apply方法
      * def apply(n:Int):Char
      * "Hello".apply(4)
      */
    val str1 = "Hello"(4)
    println(str1)   //o
    /**
      * array = 1 to 10 === 1.to(10)
      */
    val array: Range= 1 to 10
    array.foreach(println)
    /**
      * 1.+(2) === 1+2
      */
    val result = 1.+(2)
    println(result)



  }

}
