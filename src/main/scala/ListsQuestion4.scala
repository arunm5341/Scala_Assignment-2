object ListsQuestion4 extends App {

    def absolute(list: List[Int]): List[Int] = list.map(_.abs)

    var x = absolute(list = List(1, -2, -3, 4, -5, -6))
    for (i <- x)
      println(i)

}
