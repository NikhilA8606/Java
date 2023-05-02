import java.util.*;
class Area
{
	void area(int x)
	{

	  System.out.println("Area of the circle is:"+3.14*x*x);
	 }
	 void area(int x,int y)
	 {
	 	System.out.println("Area of the rectangle is:"+x*y);
	 }
}
class MethodOverloading
{
	public static void main(String ar[]){
		Area obj=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius of the circle:");
		int r=sc.nextInt();
		System.out.println("Length and breadth of rectangle:");
		int l=sc.nextInt();
		int b=sc.nextInt();

		obj.area(r);
		obj.area(l,b);
	 }
	 }

	
