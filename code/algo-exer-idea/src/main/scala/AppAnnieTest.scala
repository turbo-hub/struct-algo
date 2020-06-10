import scala.collection.mutable.ArrayBuffer

/**
  *
  * Created by Turbo
  *
  */
object AppAnnieTest {

  //===================================================
  def solution1(a: Array[Int]): Int = {
    // write your code in Scala 2.12

    val len = a.length
    if(len%2 != 0 || len<2)  return 0

    var zero_counter = 0
    for(e<-a){
      if(e ==0){
        zero_counter+=1
      }
    }

    val one_counter = len-zero_counter
    val min_times = Math.abs(one_counter-zero_counter)/2

    min_times
  }

  //===================================================
  def solution2(a: Array[Int]): Int = {
    // write your code in Scala 2.12

    val sorted_a = quickSort(a)

    var min_distance = Int.MaxValue
    for(i <- 0 to a.length-2){
      val dis = Math.abs(a(i+1)-a(i))
      if(dis<min_distance) min_distance = dis
    }

    min_distance
  }

  def quickSort(arr:Array[Int]):Array[Int]={

    if(arr.length < 2) return arr

    val pivot = arr(arr.length/2)

    quickSort(arr.filter(_<pivot)) ++ arr.filter(_ == pivot) ++ quickSort(arr.filter(_>pivot))

  }

  //===================================================
  def solution3(b: Array[String]): Int = {
    // write your code in Scala 2.12

    if (b(0).contains('O') || b(1).contains('O')) return 0

    var num_pawns = 0

    var buffer_arr = new ArrayBuffer[Array[Char]]()
    var j = 0
    for(i<-2 until b.length){
      val sub_array = b(i).toCharArray
      for(j<- 0 until sub_array.length){
        if ((j<2||j>b.length-3) && buffer_arr(i-1)(j+1).equals('X') && buffer_arr(i-2)(j+2).equals('.')){
          num_pawns+=1
        }
      }

      buffer_arr+=sub_array
    }





    num_pawns
  }






  def main(args: Array[String]): Unit = {

//    println(solution1(Array(0,1,1,1,0,0,0,0,0,0,0)))
    println(solution2(Array(0,3,3,7,5,3,11,1)))

  }









}
