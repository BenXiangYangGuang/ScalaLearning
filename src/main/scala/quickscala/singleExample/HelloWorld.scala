package quickscala.singleExample

/**
  * Author: fei2
  * Date:  18-8-21 下午7:14
  * Description:
  * 0.Test 类是程序入口;Test提供了Test$里面方法的静态方法;
  * 1.伴生类和伴生对象之间的关系
  * 2.虚构类中的信息只和单例对象有关， 单例对象的伴生类不会影响虚构类中的内容
  * 3.单例对象中的每个字段或方法， 都对应Test类中的一个静态同名方法
  * 4.Test$只和单例模式方法和属性有关;其他没关;Test提供了静态 方法和属性 的入口;实现在Test$中;其他Test类中的方法和java普通类一样.
  * Refer To:https://blog.csdn.net/zhangjg_blog/article/details/23376465
  */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("HelloWorld")
  }

}
