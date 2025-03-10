package com.eeee.test.t20250310

class test {

}
object app {
  def main(args: Array[String]): Unit = {
//    var v = for(a:scala.Char <- "123" if a != '2';
//                b:scala.Char <- "abc" if b != 'b') yield (a,b)
//    println(v)

    val s1 = "awd515df5dsf1sd53f54"
    val s2 = "cxv13h5g1kg23n"
    println(
      for (c1 <- s1 if c1 >='0' && c1 <= '9';
           c2 <- s2 if c1 == c2) yield c1
    )
  }
}
