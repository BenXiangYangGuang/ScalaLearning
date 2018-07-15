/**
  * Author: wewe
  * Date:  18-7-15 上午10:01
  * Description:传名调用和传值调用
  *
  * 一种是传值调用，这种方式和C语言的函数参数传递方式类似，在函数调用的时刻，计算各个参数的值，然后传递进入函数内部，scala中写作function(x: Int)；
    一种是传名调用，这种调用方式在函数调用时并不直接计算参数的具体值，
  * Refer To:
  */
object Test {
  def main(args: Array[String]): Unit = {
    //1.一种列子
    delayed(time())
    //2.第二种列子
//    prientByName(count)
//    printByValue(count)
    //函数-可变参数: 即 参数列表,最后一个参数的个数是不固定的但类型是相同的,最后一个参数变为可变参数,用 * 来表示
    printStrings(11,"Runoob", "Scala", "Python")
    //递归函数1111
    println( "10 的阶乘的结果:" + factorial(10))
    //高阶函数:接受一个或多个参数的函数,或者输出一个函数的函数;叫做高阶函数
    //高阶函数可以,调用同为参数的变量
    println(apply(layout,10))

    //内嵌函数
    println( factorialQianTao(0) )
//    println( factorialQianTao(1) )
//    println( factorialQianTao(2) )
//    println( factorialQianTao(3) )


  }

  def factorialQianTao(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1) {
        accumulator
      } else{
        fact(i - 1, i * accumulator)
      }
    }
    fact(i, 1)
  }
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x:A) = "[" + x.toString + "]"

  def factorial(n: BigInt): BigInt ={
    if (n <= 1)
      1
    else
      n * factorial( n - 1 )
  }
  def printStrings( a: Int,args:String* ) = {
    println(a)
    var i : Int = 0;
    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }
  def time() = {
    println("获取时间,单位为纳秒")
    System.nanoTime()
  }

  def delayed( t: => Long) = {
    /**
      *
      * 在delay  方法内
        获取时间,单位为纳秒
        参数:44228078512028

        说明:
        先输出在delay  方法内 得到并不是先计算参数的值;而是用到是在计算参数的值
      *
      */

    println("在delay  方法内")
    println("参数:" + t)
    //获取时间,单位为纳秒
    //参数t为time函数
    t
  }

  var money = 10
  def drink: Unit ={
    money -= 1
  }

  def count: Int = {
    drink
    money
  }
  //传名调用,传递名称,在需要的时候再去取值
  def prientByName(x: => Int) :Unit = {
    for ( i <- 0 until 5){
      println(" x :"  + x)
    }
  }
  //传值调用 将值计算好,当参数传递进去进行调用
  def printByValue(x:Int): Unit = {
    for (i <- 0 until 5){
      println(" x :" + x)
    }
  }
}
