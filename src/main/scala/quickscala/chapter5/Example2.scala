package quickscala.chapter5

/**
  * Author: wewe
  * Date:  18-7-28 上午11:51
  * Description: 主构造器 和类 交织在一起
  * Refer To:
  */
object Example2 {
  def main(args: Array[String]): Unit = {
    var myPerson = new Peron("zhangsan",20)
  }

  /**
    * 1.主构造器的参数直接放在类名之后
    * 2.主构造器会执行类中定义的所有语句
    * 语句就是(println("Just constructed another person"))
    * @param name
    * @param age
    */
  class Peron(val name:String,val age :Int){
    println("Just constructed another person")
    def description = name + "is " + age + "years old"
  }


}
