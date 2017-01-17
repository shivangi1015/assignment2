// Program to calculate area of shapes

class Areaofshapes { 
  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = s"Area of $shape is ${f(first, second)}" 
} 
object Area extends App { 
	val areaobj = new Areaofshapes()   // Instantiating Areaofshapes class
	val shape = "Rectangle" 
	shape match{       //cases to match
	case "Rectangle" =>  
		println(areaobj.area("Rectangle", 4, 4, (a,b)=> a*b)) 
	case "Rhombus" => 
		println(areaobj.area("Rhombus", 8, 4, (a,b)=> a*b)) 
	case "Parallelogram"=>  
		println(areaobj.area("Parallelogram", 6, 4, (a,b)=> a*b/2)) 
	case _ => println("Invalid Input!! Try again..")
} 
}
