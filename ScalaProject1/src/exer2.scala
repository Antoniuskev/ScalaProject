
// Combined exercises for CMPT 383

object exer2 {
  
  def main (args : Array[String]) {
      // Primes and Divisors
      // Set the results into variables for printing
      println("Please enter a value for divisor: ")
      var numDivisors = scala.io.StdIn.readInt();
      
      println("Please enter a value for prime: ")
      var numPrimes = scala.io.StdIn.readInt();
      
      println(findDivisors(numDivisors))
      println(findPrimes(numPrimes))

     
    // Join operator
      println("Please enter a value for the String separator: ")
      val separator = scala.io.StdIn.readLine();
      
      println("Please enter a value for the String array (using ,): ")
      println("For example: \"eggs, milk, butter\"")
      val str = scala.io.StdIn.readLine();
      val strArray : Array[String] = changeToArrayStr(str);
      
      println(join(separator, strArray));
    
     // Pythagorean Triples
     println("Please enter a value for the maximum c")
     println("in a^2 + b^2 = c^2 : ")
     var maxValueForC = scala.io.StdIn.readInt();
     
     println(findPythagoreanTuples (maxValueForC))
    
  }
  
  // find the list of all  divisors of a number
  def findDivisors (number: Int) : List[Int] = {
      for {
        i <- (2 to (number+1)/2).toList
        if number % i == 0}
        yield i
  }
  
  // Find the list of all primes number until the number the user enters
  def findPrimes (number: Int) : List[Int] = {
      for {
        i <- (2 to number).toList
        if findDivisors(i).isEmpty}
        yield i
  }
  
  def findPythagoreanTuples (c : Int) : List[(Int,Int,Int)] = {
    for {
      k <- (2 to c).toList
      j <- (2 to c).toList
      i <- (2 to c).toList
      if(i*i + j*j == k*k && i < j)}
    yield (i,j,k)
  }
  
  def changeToArrayStr(str: String): Array[String] = {
     return str.split(",").map(_.trim);
  }
   
   def join(sep: String, strings: Array[String]): String = {
      return strings.mkString(sep)
  }
   
}