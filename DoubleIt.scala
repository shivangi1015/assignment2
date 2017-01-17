//program to double all elements in list

object DoubleIt extends App{
  
  var series = List(10,20,30,40,50,60)
  
  var new_series =  series.map(_ * 2) // map ireration
   println(new_series)  //printing the list
}
