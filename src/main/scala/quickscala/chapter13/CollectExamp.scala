package quickscala.chapter13

import scala.io.Source
import scala.math._

/**
  * Author: wewe
  * Date:  18-8-26 上午11:24
  * Description:
  * Refer To:
  */
class CollectExamp {

}
object CollectExamp{

  def main(args: Array[String]): Unit = {
    val lst = scala.collection.mutable.LinkedList(1,-2,7,-9)
    var cur = lst
    //cur 相当于集合迭代器;一次一次的next;cur最终为Nil;lst = [1,2,7,9]
    while (cur != Nil){
      if (cur.elem < 0)
        cur.elem = 0
      cur = cur.next
    }
    println("--------------cur------------------")
    cur.foreach(println)
    println("--------------lst------------------")
    lst.foreach(println)
    //zipAll 三个参数,第一个被联合的元素,第二个主联合参数的缺省补充值,第三个参数被联合参数缺省补充值
    List(5.0,20.0,9.95).zipAll(List(10,2),3,2)
    //scala.collection.immutable.IndexedSeq[(Char, Int)] = Vector((S,0), (c,1), (a,2), (l,3), (a,4))
    "Scala".zipWithIndex
    //(Char, Int) = (l,3) max是值 "Scala" 每一个单独字母编码中的最大值  l > S,c,a,
    "Scala".zipWithIndex.max

    //迭代器是很脆弱的,每次对next的调用都会改变迭代器的指向,流(stream)提供了一个不可变的替代品
    //#:: 创建流;
    def numsFrom(n:BigInt):Stream[BigInt]  = n #:: numsFrom(n+1)
    //Stream[BigInt] = Stream(10, ?) 流式的未知元素
    val tenOrMore = numsFrom(10)
    //scala.collection.immutable.Stream[BigInt] = Stream(13, ?)
    tenOrMore.tail.tail.tail
    //scala.collection.immutable.Stream[scala.math.BigInt] = Stream(1, ?)
    val squares = numsFrom(1).map(x => x*x)
    //scala.collection.immutable.Stream[scala.math.BigInt] = Stream(4, ?)
    //强制对下一个元素求值
    squares.tail
    //强制对所有值求值;
    squares.take(5).force

    //一般不会调用;OutOfMemoryError
//    squares.force

    //从迭代器构造一个流;列子:Source.getLines方法一个Iterator[String].
    //用这个迭代器,对于每一行你只能访问一次.而流将缓存访问过得行,允许你重新访问他们
    val words = Source.fromFile("/home/wewe/IdeaProjects/ScalaLearning/streamEx.txt").getLines().toStream
    //scala.collection.immutable.Stream[String] = Stream(1, ?)
    words
    // String = 666666
    words(5)
    //scala.collection.immutable.Stream[String] = Stream(1, 22, 333, 4444, 55555, 666666, ?)
    words

    //懒试图
    //不像流第一个元素的值都不会被计算;和流不同这些视图是不会被缓存的;再次调用重新计算;也可以被强制操作
    val powers = (0 until 1000).view.map(pow(10,_))
    powers(100)
    // TODO: force这个方法一定不要调用;会内存溢出,卡死
//    (0 to 1000).view.map(pow(10,_)).map(1 / _).force

    //并行集合
    //par 并行计算,再将结果求和;输出结果是无序的
    println("---------------par-------------------")
    //125 126 127 128 129 250 251 252 253 254 255 256 257 258 259 750 751 752 753 754 755 756 757 758 759
    for(i <- (0 until 1000).par)
      print(i + " ")

  }

}
