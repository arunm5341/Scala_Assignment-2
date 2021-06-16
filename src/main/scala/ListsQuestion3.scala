object ListsQuestion3 extends App{
  def size(list:  List[Int]) : Unit={
  var x= list.indexOf(67)

  var y = list.indexOf(23)
    println(y-x)

}
  size(list = List(67,2,4,5,6,23))
}

