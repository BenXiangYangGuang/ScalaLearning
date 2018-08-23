package quickscala

/**
  * Author: fei2
  * Date:  18-8-21 下午5:47
  * Description:
  * Refer To:
  */
object University{

  private var studentNo = 0

  def newStudentNo = {
    studentNo += 1
    studentNo
  }


}

object objecOps {
  def main(args: Array[String]): Unit = {
    println(University.newStudentNo)
    println(University.newStudentNo)
  }
}