package com.eeee.test.t20250319

class Reckoner(
              var a:Double,
              var b:Double
              ) {
  def operation(R: (Double, Double) => Double): Double = R(a, b)

}
