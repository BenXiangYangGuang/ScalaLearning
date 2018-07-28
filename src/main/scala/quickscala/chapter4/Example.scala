package quickscala.chapter4

import scala.collection.mutable

/**
  * Author: wewe
  * Date:  18-7-28 上午8:25
  * Description: 元组 映射 是一个对偶的元组  映射共享大部分数据结构
  * Refer To:
  */
object Example {
  def main(args: Array[String]): Unit = {
    //不可变map
    var scores = Map("Alice" -> 10,"Bob" -> 3,"Chidy" -> 8)
    //可变长映射
    val scores2 = scala.collection.mutable.Map("Alice" -> 10,"Bob" -> 3,"Chidy" -> 8)
    //空的映射
    val scores3 = new mutable.HashMap[String,Int]

    //获取映射
    //if 不包含bob 抛出异常
    val bobScore = scores("Bob")
    val bobScore2 = if (scores.contains("Bob")) scores("Bob") else 0
    val bobScore3 = scores.getOrElse("Bob",0)
    //返回一个optional 对象
    val bobScore4 = scores.get("Bob")

    //更新值 不能修改和添加一个元素在不可变的映射 即使映射是被 var 声明的
    // 不可变映射可以删除一个元素;但是此变量必须被声明为 var ;val 是不可以的删除的;是因为 val 是不可变的元素
    /**
      * Error:(30, 5) value update is not
      * a member of scala.collection.immutable.Map[String,Int]
        scores("Fred") = 7
      */
//    scores("Bob") = 10
//    scores("Fred") = 7
    scores -= "Alice"
    scores.foreach(println)
    //可变元祖的更新和赋值
    scores2 += ("Bob" -> 11,"Fred" -> 77)

    scores2 -= "Alice"

    //元组迭代 是通过模式匹配做到的
    for ((k,v) <- scores2){
      println("k:" + k)
      println("v: " + v)
    }
    println(scores2.keySet)
    println(scores2.values)
    for (v <- scores2.values){
      println(v)
    }
    // 交换 键 和 值 的位置
    val changeScores  = for ((k,v) <- scores2) yield (v,k)
    for ((k,v) <- changeScores){
      println("k:" + k)
      println("v:" + v)
    }


    //已排序的映射
    /**
      * 不可变的树型映射;scala 默认给定的是哈希表
      *
      * 在操作映射时,你需要选定一个实现--- 一个哈希表 或者平衡树.默认情况下,scala 给的是哈希表
      */
    val scores4 = scala.collection.immutable.SortedMap("Alice" -> 10,"Fred" -> 7,
      "Bob" -> 3,"Cindy" -> 8)

    for ((k,v) <- scores4){
      println("k:" + k)
      println("v:" + v)
    }

    //元组 访问元组;下标从1开始
    val t = (1,3.14,"Fred")
    val second1 = t _1
    val first1 = t._1

    //通过模式匹配 来获取元祖的 组元

    val (first22,second22,thrid) = t
    println(first22)
    //在不需要的部件上用 _ 代替
    val (first,second,_) = t

    //元组 可以用于 函数返回值有多个的情况
    val tuple2 = "New York".partition(_.isUpper)
    println(tuple2)

    //拉链操作
    val symbols = Array("<","-",">")
    val counts = Array(2,10,2)
    //pairs 对偶的数组
    val pairs = symbols.zip(counts)
    println(pairs.toString)

    for ((s,n) <- pairs)
      Console.print(s * n)  //输出  <<---------->>
    //toMap 对偶的集合 转换为 映射
    symbols.zip(counts).toMap
  }
}
