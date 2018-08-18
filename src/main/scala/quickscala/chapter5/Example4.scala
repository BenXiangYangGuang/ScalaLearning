package quickscala.chapter5

import scala.collection.mutable.ArrayBuffer

/**
  * Author: wewe
  * Date:  18-7-28 下午1:19
  * Description:
  * Refer To:
  */
object Example4 {
  def main(args: Array[String]): Unit = {
    val chatter = new NetWork
    val myFace = new NetWork

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma //ok
    val barney = myFace.join("Barney")
    //不可以这样做,不能把一个myFace.Member 添加到chatter.Member元素当中去
//    fred.contacts += barney
  }

  class NetWork{
    class Member(val name:String){
      val contacts = new ArrayBuffer[Member]
      println(NetWork.this)
    }

    private val members = new ArrayBuffer[Member]

    def join(name:String) ={
      val m = new Member(name)
      members += m
      m
    }
  }

}
