object ArrayQuestion2 extends App{
  def max_product(arr: Array[Int]): Unit = {
    var MaxProduct = Integer.MIN_VALUE
    var max_i = -1
    var max_j = -1
    for (i <- 0 to arr.length - 1)
    {

      for (j <- i+1 to arr.length - 1)
      {
        if (MaxProduct < arr(i) * arr(j))
        {
          MaxProduct = arr(i) * arr(j)
          max_i=i
          max_j=j
        }

      }
    }
    println (arr(max_i)*arr(max_j))

  }
  max_product(arr=Array(2, 3, 5, 7, -7, 5, 8, -5))
}


