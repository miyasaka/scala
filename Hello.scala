object Hello{
  def main(args: Array[String]){
    println("Hello kobe!")
    println(inc_0(0))
    println(inc_1(0))
    println(inc_2(0))
    println(inc_3(0))
    println(str_func_0("あいうえお"))
    println(str_func_0("あいうえお").length)
    println(str_func_0("あいうえお").reverse)
    println(str_func_0("おえういあ").sorted)
    println(Int.MaxValue)
    println(Int.MaxValue.toString.reverse.sliding(3,3).map(_.reverse).toSeq.reverse.mkString(","))
    println(java.text.NumberFormat.getIntegerInstance.format(Int.MaxValue))
    println(Long.MaxValue)
    println(Double.MaxValue)
  }

  def inc_0(x: Int): Int = x + 1
  def inc_1(x: Int) = x + 2
  def inc_2(x: Int): Int = {
    x + 3
  }
  def inc_3(x: Int) = {
    val xx: Int = (x + 4) * 2
    xx
  }
  def str_func_0(str: String): String = str + "かき12345くけこ"

}
