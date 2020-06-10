import scala.collection.mutable.ArrayBuffer

/**
  *
  * Created by Turbo
  *
  */
object Sort {


  //====================冒泡排序
  def bubbleSort(arr: Array[Int]):Unit={

//    var arr: Array[Int] = Array(2, 45, 1, 4, 8, 2, 5, 8, 35, 67, 3, 9, 3, 8, 4, 7, 34)

    //外循环与排序逻辑无关  控制的是次数
    for (i <- arr.indices) {

      //外循环增加1 内循环长度逐渐递减 i=0时:内循环0~length-1次循环  i=1时:0~length-2循环   i=2时:0~length-2循环
      for (j <- 0 until arr.length - i - 1) {

        if (arr(j) > arr(j + 1)) {
          var tmp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = tmp
        }
      }

    }
  }

  //====================插入排序
  def insertSort(num:Array[Int]):Unit={

    if (num.isEmpty) return num

    //循环数组中的每一个元素
    for(i<-num.indices){

      //取出当前元素 暂存 腾出一个位置
      val unSortEle = num(i)

      //当前元素 小于 前一个元素
      var j = i-1
      while(j>=0 && unSortEle<num(j)){

        //将前一个元素放在给当前元素位置
        num(j+1) = num(j)
        j-=1
      }

      //while循环之后 将当前元素插入适合的位置
      num(j+1) = unSortEle
    }

  }



  //====================快速排序
  def quickSort(arr:Array[Int]):Array[Int]={

    //递归终止条件
    if (arr.length < 2 ) return arr

    val pivot = arr(arr.length / 2)    // 以中间元素为基准( pivot )

    quickSort(arr.filter(_ < pivot)) ++ arr.filter(_ == pivot) ++ quickSort(arr.filter(_ > pivot))
  }





  /*
  class Solution:
    def merge_sort(arr):
        if len(arr) == 1: return arr
        mid = len(arr) // 2
        left = arr[:mid]
        right = arr[mid:]
        return marge(merge_sort(left), merge_sort(right))
    def marge(left, right):
        res = []
        while len(left) > 0 and len(right) > 0:
        # 左右两个数列第一个最小放前面
            if left[0] <= right[0]:
                res.append(left.pop(0))
            else:
                res.append(right.pop(0))
        # 只有一个数列中还有值，直接添加
        res += left
        res += right
        return res

   */


  //====================归并
  def mergesort_Split(num1:ArrayBuffer[Int]):ArrayBuffer[Int]={

    //分裂过程
    if(num1.length == 1) 0

    val len = num1.length

    val mid = len/2

    var left = new Array[Int](mid)
    num1.copyToArray(left,0,mid)

    var right = new Array[Int](len-mid)

    num1.copyToArray(right,mid+1,len-1)

//    merge_combain(mergesort_Split(left),mergesort_Split(right))

    ArrayBuffer[Int]()

  }

  def merge_combain(left:Array[Int],right:Array[Int]):ArrayBuffer[Int]={

    var res = ArrayBuffer[Int]()

    while(left.length >0 && right.length >0){

      if(left(0) <= right(0)){

        res+=left(0)
      }
      else{
        res+=right(0)
      }


    }
    res
  }


  def mergedSort[T](less: (T, T) => Boolean)(list: List[T]): List[T] = {

    def merged(xList: List[T], yList: List[T]): List[T] = {
      (xList, yList) match {
        case (Nil, _) => yList
        case (_, Nil) => xList
        case (x :: xTail, y :: yTail) => {
          if (less(x, y)) x :: merged(xTail, yList)
          else
            y :: merged(xList, yTail)
        }
      }
    }

    val n = list.length / 2
    if (n == 0) list
    else {
      val (x, y) = list splitAt n
      merged(mergedSort(less)(x), mergedSort(less)(y))
    }
  }


  def main(args: Array[String]): Unit = {


  }

}
