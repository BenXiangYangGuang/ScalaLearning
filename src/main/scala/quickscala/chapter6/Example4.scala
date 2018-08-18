package quickscala.chapter6

/**
  * Author: wewe
  * Date:  18-7-29 下午5:09
  * Description:枚举
  * Refer To:
  */
object Example4 {

  /**
    * Value 为 Enumeration 的方法
    */
  /**
    * 枚举的类型是TrafficLightColor.Value;而不是TrafficLightColor
    */
  object TrafficLightColor extends Enumeration{
//    val Red ,Yellow,Green = Value
    //复杂的写法
    /*val Red = Value
    val Green = Value
    val Blue = Value*/
    //枚举值 Red 的内部值 为Stop;代表Stop
    val Red = Value(0,"Stop")
    val Yellow = Value(10)
    val Green = Value("Go")


  }

  def main(args: Array[String]): Unit = {
    println(TrafficLightColor.Red)  //Stop
    TrafficLightColor.values.foreach(println)
    TrafficLightColor.values foreach{
      color => println(s"ID: ${color.id},Str: $color")
    }

    println(TrafficLightColor.withName("Go")) //Go
    //报错 No value found for 'Green'
//    println(TrafficLightColor.withName("Green"))
    println(TrafficLightColor(10))

  }
}
