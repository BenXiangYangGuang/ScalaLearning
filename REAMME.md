## Scala 学习教程

### 基础语法
- 使用其中关键字
> 你可以在"之间使用任何有效的 Scala 标志符，Scala 将它们解释为一个 Scala 标志符，一个典型的使用为 Thread 的 yield 方法， 在 Scala 中你不能使用 Thread.yield()是因为 yield 为 Scala 中的关键字， 你必须使用 Thread.`yield`()来使用这个方法
- import 语句
> import语句可以出现在任何地方，而不是只能在文件顶部。import的效果从开始延伸到语句块的结束
- selector(选取器)
> import java.awt.{Color, Font}
- 重命名成员
> import java.util.{HashMap => JavaHashMap}
- 隐藏成员
> import java.util.{HashMap => _, _} // 引入了util包的所有成员,引入是不用util.HashSet,直接HashSet,但是HashMap被隐藏了;不能使用
- 注意
> 默认情况下，Scala 总会引入 java.lang._ 、 scala._ 和 Predef._，这里也能解释，为什么以scala开头的包，在使用时都是省去scala.的。
- ^ 运算
> 1-1 0 0-1 1 0-0 0  不一样 得到结果为 1

##快学Scala
### 第一章
- scala 七大数值类型
> Byte Char Short Int Float Long Double Boolean
- 数值类型都是类,它不在刻意区分基本数据类型和引用类型;基本类型和包装类型之间的转换是Scala编译器来工作的
- 不带参数的Scala方法通常不适用圆括号
> "Hello".distinct  // Helo 获取字符串中不重复的数字
- ?? 
> scala 到底是因为什么深层次的原因而拒绝提供  ++ 
### 第二章
- Java和C++ 把表达式和语句看做两种不同的东西.表达式有值;语句是执行动作.而 Scala 几乎所有构造出来的语法结构都有值
> if 表达式有值  
块也有值---是它最后一个表达式的值  
避免在函数定义中使用return 语句  
异常工作和Java和C++基本一样,不同的是catch语句中使用"模式匹配"  
Scala 没有异常检测