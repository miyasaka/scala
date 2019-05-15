object Hell{
  def main(args: Array[String]){
    val lst_0 = List(3,12,7,10,9,8,11,6,13)
    val lst_1 = 3::5::7::Nil
    println(lst_0(0))
    println(lst_1(2))
    println(lst_0.sorted)
    println(lst_0.sorted.reverse)
    println(lst_0.length)
    for_0(lst_0.sorted)
  }
  def for_0(lists: List[Int]) = {
    println(lists)
    for (list <- lists) println(list)
    for (list <- lists.reverse){
      println(list)
    }
    println(lists ::: lists.reverse)
  }

}
