//Program to add two lists

class TwoLists{
	
	def add ={
	var li1=List(10,20,30)  //list 1
	var li2=List(1,2,3)     //list 2
	
	val final1= for{
                 it<-0 to li1.length-1		
		 sum=li1(it)+li2(it)
		}yield sum
	println(final1)
	}
}

object addTwoLists extends App{
	val obj=new TwoLists    //instantiating TwoLists class
	obj.add
}
