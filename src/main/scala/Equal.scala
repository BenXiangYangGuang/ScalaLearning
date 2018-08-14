/**
  * Author: fei2
  * Date:  18-7-20 下午8:04
  * Description:Trait 特征.比java 接口强大;更像一个抽象类.可以定义属性和方法的实现
  * Scala 类的单一继承,类可以集成多个trait;实现了多重继承;
  * Refer To:
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal{
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean =
    obj.isInstanceOf[Point] &&
    obj.asInstanceOf[Point].x == x
}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(2,3)
    val p2 = new Point(2,4)
    val p3 = new Point(3,3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

  }
}