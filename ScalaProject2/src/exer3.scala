

object exer3 {
  def main (args: Array[String]) {
    
      // Hailstone sequence
      println("Please enter the first number to create its hailstone sequence: ")
      var hailNumber = scala.io.StdIn.readInt()
      println(hailSeq(hailNumber))
      
      // Merge Sort
     println("Please enter a sequence of number (only integer): (Example: 1,2,-1,-2,3)")
     var intUnsorted = scala.io.StdIn.readLine()
     val listInt = intUnsorted.split(',').map(_.toInt).toList
     // Merge Tail Recursion function
     println(mergeSort(listInt))
     
     // merge Sort String
     /*
     println("Please enter a sequence of number: (Example: The quick brown fox)")
     var unsorted = scala.io.StdIn.readLine()
     unsorted = unsorted.trim().replace(" ", "")
     // Merge Tail Recursion function
     println(mergeSort(unsorted.toList))
     */
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
  
   def merge[T <% Ordered[T]] 
   (listResult : List[T], list1 : List[T], list2 : List[T]) : List[T] = {
      
         (list1, list2) match {
           case (_ , Nil) => listResult.reverse ::: list1
           case (Nil , _) => listResult.reverse ::: list2
           case (x :: listN1, y :: listN2) =>
             if (x < y) merge (x :: listResult, listN1, list2)
             else merge (y :: listResult, list1, listN2)
         }
   }
   
   def mergeSort[T <% Ordered[T]] 
   (unsorted : List[T]) : List[T] = {
      var half = unsorted.length / 2
      if (half == 0) unsorted
      else {
        val (left , right) = unsorted splitAt(half)
        merge(Nil, mergeSort(left), mergeSort(right))
      } 
   }
}