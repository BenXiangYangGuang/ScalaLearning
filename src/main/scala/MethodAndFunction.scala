/**
  * Author: wewe
  * Date:  18-7-14 下午8:21
  * Description:方法和函数
  */
object MethodAndFunction {

  //定义一个方法
  //方法m2参数要求是一个函数，函数的参数必须是两个Int类型,该参数的函数返回也是Int类型
  //m1 返回值类型也是Int类型
  def m1 (f:(Int,Int) => Int) :Int = {
    f(2,6)
  }
  //定义一个函数f1,参数是两个Int类型，返回值是一个Int类型
  val f1 = (x:Int,y:Int) => x+y

  val f2 = (m:Int,n:Int) => m*n

  def main(args: Array[String]): Unit = {
    val r1 = m1(f1)

    println(r1)

    val r2 = m1(f2)
    println(r2)
  }

}
