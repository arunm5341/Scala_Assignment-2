object ListQuestion1 extends App{
  def f(num:Int,list:List[Int]):List[Int] =
    list.flatMap(List.fill(num)(_))

  var a =  f(2,list=List(1,2,3,4))

  for (x <- a)
    println(x)


}

