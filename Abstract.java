abstract class Shape{
	abstract void noOfSlides();
}
class Rectangle extends Shape{
	
     void noOfSlides()
     {
     	System.out.println("No of sides of Rectangle : 4");
     }
}
class Triangle extends Shape{
	
     void noOfSlides()
     {
     	System.out.println("No of sides of Triangle : 3");
     }
}
class Hexagon extends Shape{
	
     void noOfSlides()
     {
     	System.out.println("No of sides of Hexagon : 6");
     }
}
class Abstract{
	public static void main(String ar[])
	{
		Rectangle R1=new Rectangle();
		Triangle T1=new Triangle();
		Hexagon H1=new Hexagon();
		R1.noOfSlides();
		T1.noOfSlides();
		H1.noOfSlides();
	}
}
