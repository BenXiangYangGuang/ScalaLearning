package quickscala.chapter11

/**
  * Author: wewe
  * Date:  18-8-25 下午7:47
  * Description: apply 方法 和 提取器unapply
  * Refer To:
  */
object ApplyExample {
  /**
    * f(arg1,arg2,...)
    * 如果f 不是函数和方法,那么这个表达式就等同于调用 f.apply(arg1,arg2,...)
    * f(arg1,arg2,...) = value
    * 对应调用f.update(arg1,arg2,...,value)
    * @param args
    */

  def main(args: Array[String]): Unit = {
    val result = Fraction(3,4) * Fraction(2,5)
    println(result)
  }
  class Fraction(n: Int, d: Int){
    private var num: Int = n
    private var den: Int = d

    def * (other: Fraction) = new Fraction(n * other.num,d * other.den)

  }
  object Fraction{
    def apply(n: Int, d: Int): Fraction = new Fraction(n, d)

    def unapply(input: Fraction): Option[(Int, Int)] =
      if (input.den == 0) None else Some((input.num,input.den))
  }

}
