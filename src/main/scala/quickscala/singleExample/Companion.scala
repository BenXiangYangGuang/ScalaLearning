package quickscala.singleExample

/**
  * Author: fei2
  * Date:  18-8-21 下午6:20
  * Description:
  * 1.伴生对象和它对应的类在字节码层面走到了一起（Companion.class)
  * 2.伴生对象首先是单例;然后相当于java的静态成员和静态方法写在了伴生对象里面;
  * 3.类与伴生对象可以相互访问私有方法。它们必须存在同一个源文件中
  * Refer To:https://www.bbsmax.com/A/qVdeYbmMdP/
  */
object Companion {

  def show = println("I am a companion")

}

class Companion {
  def shout = Companion.show
}