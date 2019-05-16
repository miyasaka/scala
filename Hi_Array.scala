object Hi_Array{
  def main(args: Array[String]){
    val arr_0 = Array(3,12,7,10,9,8,11,6,13)
    for_0(arr_0.sorted)

    //val lst_1 = 3::5::7::Nil
    // println(lst_1(2))
  }
  def for_0(arrs: Array[Int]) = {
    println("----for_0() module----")
    for (arr <- arrs) println(arr)
    println("----")
    for (arr <- arrs.reverse){
      println(arr)
    }
    // List merge
    //println(lists ::: lists.reverse)
    //val lst_merge = lists ::: lists.reverse
    //for (list <- lst_merge.sorted) println(list)
  }

}
