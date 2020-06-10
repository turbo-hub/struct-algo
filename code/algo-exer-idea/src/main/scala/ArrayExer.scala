import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import util.control.Breaks._
import java.util

/**
  *
  * Created by Turbo
  *
  */
object ArrayExer {


  //==============================三数之和 题号15===============================================
  /*

    数组中找出三数之和等0的元素，每三个元素形成一个list list不能重复
    即不可出现 list[-1,0,1]  list[-1,0,1]两个相同的list
    leetcode题号：15
   */
  def threeSum(num: Array[Int]): ListBuffer[List[Int]] = {

    if (num == null || num.length < 3) num

    val result = ListBuffer[List[Int]]()
    val sortnum = num.sortWith(_ < _)

    var l = 0
    var r = 0
    for (i <- sortnum.indices) {

      //数组有序  如果第一个数大于0直接跳出
      if (sortnum(i) > 0) return result

      //breakable块在for循环内相当于countinue for循环外相当于break
      breakable {
        if (i > 0 && sortnum(i) == sortnum(i - 1)) {
          break
        }

      }

      //定义左右指针
      l = i + 1
      r = sortnum.length - 1
      while (l < r) {
        var sum = sortnum(i) + sortnum(l) + sortnum(r)

        if (sum == 0) {

          result.+=(List(sortnum(i), sortnum(l), sortnum(r)))
          // 如果左指针的 当前数 和 后面的数相同 那么左指针指向后面的数
          while (l < r && sortnum(l) == sortnum(l + 1)) l += 1
          while (l < r && sortnum(r) == sortnum(r - 1)) r -= 1

          l += 1
          r -= 1
        }

        //左指针跳过两个相同数后面的那个
        else if (sum < 0) l += 1
        else if (sum > 0) r -= 1
      }

    }
    result
  }




 //========================求众数 题号169=====================================================
  def majorityElement(array:Array[Int]):Int={

    if(array.length<3) return 0

    val map = new util.HashMap[Int,Int]()
    // maxNum 表示元素，maxCount 表示元素出现的次数
    var maxNum = 0
    var maxCount = 0
    for ( num<- array) {
      var count = map.getOrDefault(num, 0) + 1
      map.put(num, count)
      if (count > maxCount) {
        maxCount = count
        maxNum = num
      }
    }
     maxNum
  }


  //========================无序数组 第一个缺失的正整数 题号41=====================================================
  def firstMissInt(array:Array[Int]):Int={

    val len = array.length

    for(i<-array.indices){

      //当前值 大于等于0 且小于len-1 且要交换的两个数不相等
      //此处不能用if 因为交换之后的数据也不一定符合要求 所以要继续循环
      //while循环不会每次都执行 如果交换之后的 array(i) 一直不符合就会循环到结束  而后续的for循环 就不会再执行while
      while(array(i)>0 && array(i)<=len &&  array(i) != array(array(i)-1)){

        println(array(i))

        //swap
        var tmp =  array(array(i)-1)
        array(array(i)-1) = array(i) //将当前值 放在 索引为当前值的位置
        array(i) = tmp

      }
    }

    for (i<-array.indices){

      if(i+1 != array(i)){
         return i+1
      }
    }

    len+1

  }



  //==========================main===================================================

  def main(args: Array[String]): Unit = {

//    val intsToIntses = threeSum(Array(-1, 0, 1, 2, -1, -4))

//    val num = majorityElement(Array(2,2,1,1,1,2,2))

    var  num = firstMissInt(Array(3,4,-1,1))

    print(num)


  }

}
