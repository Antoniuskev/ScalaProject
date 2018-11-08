
// primes and divisors
import scala.collection.mutable.ArrayBuffer

// Create functions with Divisions and Primes

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

  
}