object pythagoreanTriples {
  def main (args: Array[String]){
     // Pythagorean Triples
     println("Please enter a value for the maximum c")
     println("in a^2 + b^2 = c^2 : ")
     var maxValueForC = scala.io.StdIn.readInt();
     
     println(findPythagoreanTuples (maxValueForC))
  }
  
  def findPythagoreanTuples (c : Int) : List[(Int,Int,Int)] = {
    for {
      k <- (2 to c).toList
      j <- (2 to c).toList
      i <- (2 to c).toList
      if(i*i + j*j == k*k && i < j)}
    yield (i,j,k)
  }
  
}