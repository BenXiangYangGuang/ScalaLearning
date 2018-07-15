/**
  * Author: wewe
  * Date:  18-7-15 下午9:25
  * Description:
  * 传值调用和c语言中传递函数参数的方法类似;在调用时刻,计算各个参数的值,然后传入到参数内部 写法 function(x: Int)
  * 传名调用,函数调用时,并不直接计算参数的具体值,而是在用到该参数的时候,才进行计算 写法 function(x: => Int)
  * 这里有意思的地方在于，在scala中， Int => Int表示一个函数类型，接受Int参数，返回Int返回值。
  * 那这里x的类型，就类似于一个函数，它没有参数，但是返回一个Int类型的返回值
  * Refer To:https://www.tuicool.com/articles/j2Avqab
  */
object TestThunk extends Greeting with App {
  def printAndReturnInt() = {
    println("test...")
    1
  }
  callByValue(printAndReturnInt)
  callByName(printAndReturnInt)
}

trait Greeting {
  def callByValue(x: Int) = {
    println("first call by value: x=" + x)
    println("second call by value: x=" + x)
  }
  def callByName(x: => Int) = {
    println("first call by name: x=" + x)
    println("second call by name: x=" + x)
  }
}
