
import scala.collection.mutable.ArrayBuffer

object JoinString {
   def main(args: Array[String]) {
      println("Please enter a value for the String separator: ")
      val separator = scala.io.StdIn.readLine();
      
      println("Please enter a value for the String array (using ,): ")
      println("For example: \"eggs, milk, butter\"")
      val str = scala.io.StdIn.readLine();
      val strArray : Array[String] = changeToArrayStr(str);
      
      println(join(separator, strArray));
   }
   
   def changeToArrayStr(str: String): Array[String] = {
     return str.split(",").map(_.trim);
   }
   
   def join(sep: String, strings: Array[String]): String = {
      return strings.mkString(sep)
   }
}