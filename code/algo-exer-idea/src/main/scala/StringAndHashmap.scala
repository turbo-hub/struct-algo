import scala.util.control._
/**
  *
  * Created by Turbo
  *
  */

object StringAndHashmap {


  //==================115 反转字符串里面的单词
  def reverseWord(s: String): String = {

    if(s.isEmpty) return ""

    val inner = new Breaks
    val sb = new StringBuilder()

    val sp = s.trim.split(" ")
    var i = 0
    for(i <-  (0 until sp.length).reverse){

      val word = sp(i).trim()

      //如果sp(i)为空 则跳出当前循环 继续下次循环
      inner.breakable{

        if(word.equals("")) {

          inner.break
        }

        sb.append(word+" ")
      }

    }

    sb.toString().trim
  }




  //==================  main
  def main(args: Array[String]): Unit = {

    val str = reverseWord("the sky   is blue")

    println(str)




  }


}
