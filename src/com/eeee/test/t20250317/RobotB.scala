package com.eeee.test.t20250317

class RobotB(//主构造器
            var name:String,
            var age:Int,
            var model:String = "default"
            ) {
  println("主构造器前")
  //副构造器
  def this(name:String,age:Int) = {
    this(name,age,"dw")
    println(1)
  }
  def this(name:String) = {
    this(name,1)
  }
  println("主构造器后")
//  var name = "" //添加一个name方法和name_=，也就是一个name属性
//  var age = 0
//  var model = ""//添加一个model方法,到那时没有model_=

}
