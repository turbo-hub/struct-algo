import com.alibaba.fastjson.{JSON, JSONObject}

import scala.collection.mutable.ArrayBuffer


/**
  *
  * Created by Turbo
  *
  */
object fufuTest {

  def totalTime(n:Int,leader:Array[Int],time:Array[Int]):Int={

    //n = 5, leader = [3,3,3,-1,3], time = [0,0,5,0,0,0]

    var map =  Map[Int,Int]()
    for(i<-time.indices){

      map += (i->time(i))

    }

    var sum_time = 0

    val distinct_leader = leader.distinct
    for(e<-distinct_leader){
      if (map.contains(e)) sum_time += map.getOrElse(e, 0)
    }

    sum_time


  }


  case class Test(key:String,value:String)
  def jsonPrase(json:String):Test={

    val option = JSON.parseObject(json,classOf[Test])
    option

  }


  def main(args: Array[String]): Unit = {

    println(totalTime(5,Array(1,2,3,4,5,6,-1),Array(0,6,5,4,3,2,1)))


  }


















}
