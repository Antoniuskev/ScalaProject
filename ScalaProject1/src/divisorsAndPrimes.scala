
// primes and divisors
import scala.collection.mutable.ArrayBuffer

object divisorsAndPrimes {
  
  def main(args: Array[String]) {
      println("Please enter a value for divisor: ")
      var numDivisors = scala.io.StdIn.readInt();
      
      println("Please enter a value for prime: ")
      var numPrimes = scala.io.StdIn.readInt();
      
      // Set the results into variables for printing
      println(findDivisors(numDivisors))
      println(findPrimes(numPrimes))
  }
  
  // find all the divisors of a number
  def findDivisors (number: Int) : List[Int] = {
      for {
        i <- (2 to (number+1)/2).toList
        if number % i == 0}
        yield i
  }
  
  
  def findPrimes (number: Int) : List[Int] = {
      for {
        i <- (2 to number).toList
        if findDivisors(i).isEmpty}
        yield i
  }
  
  /*
  def findPrimes (number: Int) : ArrayBuffer[Int] = {
    var primesBuffer = ArrayBuffer[Int]()
    
    for (i <- 2 to (number)){
      if (findDivisors(i).isEmpty){
        primesBuffer += i
      }
    }
    return primesBuffer;
  }
  */ 
   // Printing Array Buffers with every element on the lists
   // separated by comma. [1,2,3]
  /*
  def printFunction (array : ArrayBuffer[Int]) {
   
      if(!array.isEmpty){
        print("[" + array(0))
        for(b <- 1 to (array.length-1)){
          print("," + array(b) )
        }
        print("]")
      }
      // special case when there is no divisor, when the prime is empty
      else {
        print("[]")
      }
  }
  */
  
}