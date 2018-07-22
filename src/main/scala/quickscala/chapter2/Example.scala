package quickscala.chapter2


/**
  * Author: wewe
  * Date:  18-7-22 下午6:03
  * Description: 控制结构和函数
  * Refer To:
  */
object Example {
  def main(args: Array[String]): Unit = {
    // 条件语句 if else 和 ? : else 结合在一起了
    val x = - 10
    val s = if(x > 10) 1 else -1
    println(s)
    //混个表达式类型 java.lang.String 和 java.lang.Int 的公共超类 是Any
    val res = if (x > 0) -1  else "positive"
    println(res)
    /**
      * void 没有值 Unit 有一个表示"无值"的值
      * 一个空的钱包 和 一个写着 "没钱" 的钱包
      */
    // else 语句缺失了;引入 Unit 写作 () 和 java void 类似
    val result = if (x > 0) 1 else ()
    println(result)

    val ss: String = "Hello"
    var sum = 0
    //类似与 range 1 to 10
    for (i <- 0 to 4){
      println(i)
    }
    for (i <- 0 to  ss.length -1)
      sum += ss(i)
    println(sum)

    for (ch <- "Hello")
      sum += ch
    println(sum)

    //for 循环高级特性
    for (i <- 1 to 3; j <- 1 to 3)
      print((10 * i +j) +" ")
    println("---------------")
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i +j) +" ")
    println("---------------")
    for (i <- 1 to 3; from = 4 - i; j <- from to 3 )
      print((10 * i +j) +" ")
    println("---------------")
    // 生成Vector{1,2,0,1,2,0,1,2,0,1}
    for (i <- 1 to 10)
      yield i % 3
    println("---------------")
    //生成HIeflmlmop
    val yeildOne = {
      for (c <- "Hello";i <- 0 to 1)
        yield (c + i).toChar
    }
    yeildOne.foreach(println)
    println("---------------")
    //将生成Vector('H','e','l','l',''o,'I','f','m','m','p')
   val forYeild = {
     for (i <- 0 to 1; c <-"Hello")
      yield (c + i).toChar
   }
    forYeild.foreach(println)
  }
}
