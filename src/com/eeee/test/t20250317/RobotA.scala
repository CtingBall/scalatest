package com.eeee.test.t20250317

class RobotA {
  var id = "ROBOTA"
  var age = 0

  //属性，属性中的读的方法，属性名为name
  def name:String = id

  //属性，属性中的写的方法，属性名为name
  def name_(name:String):Unit = id = name

  
  def rage:Int = this.age
  def rage_(age:Int):Unit = this.age = age
}
