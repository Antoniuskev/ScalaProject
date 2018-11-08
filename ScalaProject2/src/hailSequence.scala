

object hailSequence {
  def main (args: Array[String]) {
      // Hailstone sequence
      println("Please enter the first number to create its hailstone sequence: ")
      var hailNumber = scala.io.StdIn.readInt()
      println(hailSeq(hailNumber))
  }
  
  def hailstone(num : Int) : Int = {
    var result = (-1)
    if(num % 2 == 0) {   result = num / 2   }
    else {   result = 3 * num + 1    }
    return result
  }
  
  def hailSeq (num : Int) : List[Int] = {
    var hailList = List[Int]()
    var number = num
    while (number != 1) {
      hailList =  number :: (hailList)
      number = hailstone(number)
    }
    return (1 :: hailList).reverse
  }
}