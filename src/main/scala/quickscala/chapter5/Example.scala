package quickscala.chapter5

/**
  * Author: wewe
  * Date:  18-7-28 上午10:20
  * Description:类
  * Refer To:
  */
object Example {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current)

    val myPerson = new Person
    println(myPerson.age)
    myPerson.age = 10
    println(myPerson.age)

    println("---------------重写私有属性的setter 方法-------------------")
    val myPerson2 = new Person2
    myPerson2.age = 30
    myPerson2.age = 21
    println(myPerson2.age)  //30 21 不能被赋值 因为 21 < 30


    println("-----------------val字段-----------------")
    //val 声明的属性只有 getter 方法
    var message = new Message
    println(message.timeStamp)

  }
  /**
    * 不用一个public 关键字来修饰类;在一个scala 源文件可以包含多个类,所有这些类都具有共有可见性
    * 改变值的函数带();获取值的函数不带()
    */
  class Counter {
    private var value = 0;
    def increment(){ value += 1}
    def current = value
  }

  /**
    * 属性是共有的 getter 和 setter 方法也是共有的
    * 属性是私有的 getter 和 setter 方法也是私有的
    */

  class Person{
    var age = 0
  }

  class Person2 {
    private var privateAge = 0

    //相当于Java 中的getter 方法

    // age 被叫做 getter 方法
    def age = privateAge
    //age_= 被叫做 setter 方法 必须是age_=
    def age_= (newValue :Int){
      if (newValue > privateAge)
        privateAge = newValue;
    }
  }

  class Message {
    val timeStamp = new java.util.Date
  }

  /**
    * 类的私有字段,Scala 生成私有的getter 和 setter 方法;
    * 但对象私有字段 Scala 根本不会生成getter 和 setter 方法  private[this] var value
     */
  /**
    * 类中的方法是可以该类的 所有对象的的私有字段
    * 但是更严格的访问限制;声明 private[this] var value
    * 这样一来,Counter2类中的方法只能访问当前对象的value2 属性;
    * 而不能访问同样是(Counter2类型)(一个声明的变量类型)的其他对象的value2 属性
    */
  class Conter2 {
    //类的私有字段
    private var value1 = 0;
    //对象的私有字段
    private [this] var vlaue2 = 0;



  }
}
