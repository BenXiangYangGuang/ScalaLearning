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