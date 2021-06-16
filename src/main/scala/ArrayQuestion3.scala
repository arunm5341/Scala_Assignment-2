object ArrayQuestion3 extends App{
  def max_diff(arr : Array[Int] ) : Int = {
    var diff_twoElements = Integer.MIN_VALUE
    for ( i <- 0 to arr.length-1 )
    {
      for( j <- i+1 to arr.length-1)
      {

        diff_twoElements= Integer.max(diff_twoElements,arr(j)-arr(i))
      }


    }
    return diff_twoElements
  }
  println(max_diff(arr= Array(2, 3, 1, 7, 9, 5)))
}




