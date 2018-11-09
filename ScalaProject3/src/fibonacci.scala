

object fibonacci {
  def main(args : Array[String]){
    var num : Int = 29
    println("Using normal recursion fibonacci: " + fibNormal(num))
    println("Using tail recursion fibonacci: " + fibFast(num))
    println("Using iterative loop fibonacci: " + fibLoop(num))
    
  }
  
  def fibNormal(number: Int) : Int = {
    if (number == 1 | number == 2){
      return 1;
    }
    return fibNormal(number - 1) + fibNormal(number-2)
  }
  
  def fibFast(number: Int) : Int = {
     def fibTail(num : Int, a : Int, b : Int) : Int = num match{
       case 0 => a
       case _ => fibTail (num-1, b, a+b)
     }
     return fibTail(number, 0, 1)
  }
  
  def fibLoop(number: Int) : Int = {
     var init1 = 0
     var init2 = 1
     
     var count : Int = 0
     var result = 0;
     
     while(count < number) {
       result = init1 + init2
       init1 = init2
       init2 = result
       count = count + 1
     }
     return init1;
  
  }
}