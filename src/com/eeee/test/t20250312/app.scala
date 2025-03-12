package com.eeee.test.t20250312

object app {
  def main(args: Array[String]): Unit = {
    var f1:scala.Function2[scala.Int,scala.Int,scala.Int] = (a:scala.Int,b:scala.Int) => a + b
//    var f1:scala.Function2[scala.Int,scala.Int,scala.Int] => (_ + _)

    //这次学的是lambda表达式
    var f2:scala.Function2[scala.Int,scala.Int,scala.Int] = (a:scala.Int,b:scala.Int) => if (a > b) a else b
//    var f2:(scala.Int, scala.Int) => scala.Int = (a:scala.Int, b:scala.Int) => if (a > b) a else b 这是语法糖形式


    var f3:scala.Function1[scala.Int,scala.Int] = (a:scala.Int) => a * a

    println("这是f1,"+f1(7,8))
    println("这是f2,"+f2(7,8))
    println("这是f3,"+f3(7))

    println(((a:scala.Int) => a)(1))

    def add1(a:scala.Int)(b:scala.Int):scala.Int = a + b
    println(add1(51)(15))
    def add2(a:scala.Int,b:scala.Int):scala.Int = a + b

    //定义一个具名函数，用于计算任意个整数的和，并测试
    def sum(nums: Int*): Int = nums.sum
    println(sum(1, 2, 3, 4, 5))

    //定义一个具名函数，用于计算一个整数的任意次幂（负数不算），幂默认为2，并测试
    def ming(a:Int,b:Int = 2) : Int = {
      var ji = 1
      var c = 0
      while (c < b) {
        ji *= a;
        c += 1
      }
      ji
    }
    println(ming(0))
  }
}
