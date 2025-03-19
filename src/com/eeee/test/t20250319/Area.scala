package com.eeee.test.t20250319

class Area(
          val long:Double,
          val width:Double
          ) {
  def this(a:Double) = this(a , a)
  def operation: Double = long * width
}
