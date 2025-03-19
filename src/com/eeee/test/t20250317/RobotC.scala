package com.eeee.test.t20250317

private class RobotC(
                    var name:String,
                    var age:Int,
                    var model:String
                    ) {
  def this(name:String,age:Int)={
    this(name,age,"wdawdaw")
    println(1)
  }
  //公共的，受保护的，私有的，当前受保护的，当前私有的
  //protected,private,protected[this],private[this]
  protected[this] var c = 1

  this.c
}
