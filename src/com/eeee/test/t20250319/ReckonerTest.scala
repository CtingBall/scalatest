package com.eeee.test.t20250319

object ReckonerTest {
  def main(args: Array[String]): Unit = {
    val c = new Reckoner(3,4)
    println(c.operation(_ + _))
    println(c.operation(_ - _))
    println(c.operation(_ * _))
    println(c.operation(_ / _))
  }
}
