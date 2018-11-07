
// primes and divisors
import scala.collection.mutable.ArrayBuffer

object divisors {
  
  def main(args: Array[String]) {
      var numDivisors : Int = 30
      var numPrimes : Int = 100
      
      // Set the results into variables for printing
      var divArray = findDivisors(numDivisors)
      var primeArray = findPrimes (numPrimes)
      
      printFunction(divArray)
      println()
      printFunction(primeArray)
  }
  
  // find all the divisors of a number
  def findDivisors (number: Int) : ArrayBuffer[Int] = {
      var divisorBuffer = ArrayBuffer[Int]()
      // Add divisors to the list
      for (i <- 2 to (number+1)/2){
        if (number % i == 0){
          divisorBuffer += i
        }
      }
      
      return divisorBuffer;
  }
  
  def findPrimes (number: Int) : ArrayBuffer[Int] = {
    var primesBuffer = ArrayBuffer[Int]()
    
    for (i <- 2 to (number)){
      if (findDivisors(i).isEmpty){
        primesBuffer += i
      }
    }
    return primesBuffer;
  }
  
   // Printing Array Buffers with every element on the lists
   // separated by comma. [1,2,3]
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
  
}