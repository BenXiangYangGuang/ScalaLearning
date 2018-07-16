/**
  * Author: wewe
  * Date:  18-7-16 下午9:28
  * Description: return 语句的差别??
  * Refer To:
  */
object NestFunction {
  def main(args: Array[String]): Unit = {
    println(factorial(3))
//    println(innerFunction(3))
  }
  def innerFunction(a: Int): Int = {
    def inner(i: Int, result: Int): Int = {
      if (i == 1) {
        return result;
      } else {
        return inner(i - 1, result * i)
      }
    }
    return inner(a, 1);
  }
  def factorial(i:Int) = {
    def fact(i:Int,accumulator:Int) :Int = {
      if (i <= 1){
        return accumulator
      } else {
        return fact(i - 1,i * accumulator)
      }
    }
    fact(i,1)
  }
  //匿名函数;箭头左边是参数列表;右边是函数体
  var inc = (x:Int) => x + 1


}
