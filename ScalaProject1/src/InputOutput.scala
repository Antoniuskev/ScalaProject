

object InputOutput {
  def main(args: Array[String]) {
      println("Please enter a value for divisor: ")
      val a = scala.io.StdIn.readLine();
      println("Your value is: " + a);
  }
}