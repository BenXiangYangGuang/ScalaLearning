package quickscala.chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Author: wewe
  * Date:  18-7-23 下午8:35
  * Description:
  * Refer To:
  */
object Example{
  /**
    *  变长数组使用ArrayBuffer
    *  提供初始值时不要使用new
    *  用() 来访问
    *  for(elem <- arr)
    *  for(elem <-arr if) ...yield 来将原数组转型为新数组
    * @param args
    */
  def main (args: Array[String] ): Unit = {
    /**
      * scala 基本类型数组对应的是java 中的基本数组
      */
    val nums = new Array[Int](10)
    val ss = Array("Hello","World")
    ss(0) = "Goodbye"

    ss.foreach(println)

    /**
      * 变长数组
      * b bb 等效
      */
    val b = ArrayBuffer[Int]()
    val bb = new ArrayBuffer[Int]()
    //用 += 在尾端添加元素
    b += 1 //ArrayBuffer(1)
    b += (1,2,3,5) //ArrayBuffer(1,1,2,3,5)
    b ++= Array(8,13,21)
    //用 ++=操作符追加任何集合
    b.foreach(println)
    //移除最后5个元素
    b.trimEnd(5)
    b.foreach(println)
    //数组的插入,后面的元素会进行向后平移
    b.insert(2,6)
    //转化为数组
    val bbb = b.toArray
    //数组转化为一个数组buffer
    bbb.toBuffer

    // util 是RichInt 类的方法
    //数组和数组buffer遍历同样适用
    for (i <- 0 until b.length)
      println(i + ":" + b(i))
    //每两个元素进行一次跳动
    0 until (b.length,2)
    //从最后开始便遍历;整个元素必须在同一个()中
    (0 until b.length).reverse

    val aa = Array(2,3,5,7,11)
    //创建一个新的数组
    /**
      * yield 会创建一个Aector 每次向里面追加元素
      */
    val result = for (elem <- aa) yield 2*elem
    result.foreach(println)

    /**
      * 给定一个整数的数组缓冲,移除 除第一个负数之外的所有负数
      */
    val res2 = Array(1,2,3,-1,-2,4,9,-3)

    var first = true
    //拿到所有满足条件的所有数组的下标
    val indexs = for (i <- 0 until res2.length if first || res2(i) >= 0) yield {
      if(res2(i) < 0 )
        first = false
      i
    }
    //元素赋值
    for (j <- 0 until indexs.length)
      res2(j) = res2(indexs(j))

    /**
      * 猪油数组buffer you trimEnd 方法
      */
    //截断剩余元素
    res2.toBuffer.trimEnd(res2.length - indexs.length)

    //数组和数组buffer的常用函数


    println(Array(1,2,3).sum)
    ArrayBuffer("Marry","had","a","little","lamb").max //little

    //sorted 排序

    val bc = ArrayBuffer(1,7,2,9)
    //bcSorted 生成一个新的数组或数组buffer
    val bcSorted = bc.sorted
    bcSorted.foreach(println)
    scala.util.Sorting.quickSort(bc.toArray)

    /**
      * 以 and 间隔 每个元素
      *
      */
    println(bc.mkString(" and "))


    println(b.toString()) //ArrayBuffer 的 toString ArrayBuffer(1, 1, 6, 2)
    println(b.toArray.toString()) //Array [I@15975490 没有实际意义的toString

    //二维组数 3 行 4 列
    val matrix = Array.ofDim[Double](3,4)
    matrix(1)(2) = 42

    //创建不规则数组,每一行的长度不一样
    val triangle = new Array[Array[Int]](10)
    for (i <- 0 until triangle.length)
      triangle(i) = new Array[Int](i+1)
  }

}
