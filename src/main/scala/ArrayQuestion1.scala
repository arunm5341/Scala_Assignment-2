object ArrayQuestion1 extends App{
  def nextGreatest(arr: Array[Int]): Unit = {

    for (i <- 0 to arr.length - 1) {
      var negative = -1
      for (j <- i + 1 to arr.length - 1) {

        if (arr(i) < arr(j)) negative = arr(j)

      }

      println(negative)

    }

  }

  nextGreatest(arr=Array(9, 5, 8, 4, -10, 21, 6, 17, 11))


}
