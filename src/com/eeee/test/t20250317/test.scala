package com.eeee.test.t20250317

object test {

  //思路，由用户来定义做出的算式。

  def main(args: Array[String]): Unit = {
    println(operation( _ + _)(8, 4))
    println(operation( _ * _)(8, 4))
    println(operation( _ / _)(8, 4))
    println(operation( _ - _)(8, 4))
  }

  def operation(L:(Int,Int) => Int)
               (a:Int,b:Int) : Int = L(a,b)

}
