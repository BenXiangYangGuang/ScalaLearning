/**
  * Author: wewe
  * Date:  18-7-14 下午8:43
  * Description:方法转换为函数
  * Refer To:
  */
object MethodToFunction {
  def ttt(f:Int => Int) :Unit = {
    val r = f(10)
    println(r)
  }

  val f0 = (x : Int) => x*x

  def m0(x:Int) : Int = {
    x*10
  }

  /**
    * 方法转化为函数的3个方法
    */
  //1.方法转化为函数
  val f1 = m0 _
  //2.显示地告诉编译器需要将方法转换成函数
  val f2:(Int) => Int = m0
  //3.编译器会自动将方法转换成函数
  def main(args: Array[String]): Unit = {

    ttt(f0)
    //2.显示地告诉编译器需要将方法转换成函数
    ttt(f2)
    //1.方法转化为函数
    ttt(m0 _)

    //3.编译器会自动将方法转换成函数
    ttt(m0)
    //通过x => m0(x)的方式将方法转化成函数,这个函数是一个匿名函数，等价：(x:Int) => m0(x)
    ttt(x => m0(x))
  }
}
