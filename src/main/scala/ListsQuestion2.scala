object ListsQuestion2 extends App{
  def oddValues(list: List[Int]): List[Int] =
    (list.indices.collect { case i if i % 2 != 0 => list(i) }).toList

  var a = oddValues(list = List(1, 2, 43, 54, 56))

  for (x <- a)
    println(x)

}
