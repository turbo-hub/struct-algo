/**
  *
  * Created by Turbo
  *
  */
object BreakableTest{


  import scala.util.control._

    //break continue 测试
    def main(args: Array[String]) {
      var a = 0
      var b = 0
      val numList1 = List(1,2,3,4,5)
      val numList2 = List(11,12,13)

      val outer = new Breaks
      val inner = new Breaks

//      outer.breakable {
        for( a <- numList1){

          println( "Value of a: " + a )


          inner.breakable {
//            for( b <- numList2){

            if( a == 3 ){
                inner.break
            }

              println( "Value of a zhihou : " + a )


              println("aaaaaa")

              println("=====")


//            }
          } // 内嵌循环中断


        }
//      } // 外部循环中断
    }


}






