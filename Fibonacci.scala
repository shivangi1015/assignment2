//Program to print the fibonacci series using recursion
class Calculate{
//function to print the fibonacci series 
  def calc(n:Int,num1:Int,num2:Int,num3:Int):Unit={
     
     var first=num1  // 1st fibonacci number in series
     var second=num2  // 2nd fibonacci number in series
     var next=num3    // variable to hold next in fibonacci series 
     var new_num=n
      println(s"$first")
      next = first+second
      first=second
      second=next
      new_num=new_num - 1
     if(new_num > 0)
     calc(new_num,first,second,next)  // recursive call to calc method 
	
  }
}

object Fibonacci extends App{
val obj = new Calculate       //instantiation of class Calculate
obj.calc(10,0,1,0)   //function invocation 

}
