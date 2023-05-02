import java.util.*;
class Area
{
	Area(int x)
	{
     System.out.println("Area of circle:"+3.14*x*x);
    }
    Area(int x,int y)
    {
    	System.out.println("Area of the rectangle is:"+x*y);
    }
 }
  class Constructor
  {
  	public static void main(String ar[]){
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Radius of the circle:");
	int r=sc.nextInt();
	System.out.println("Length and breadth of rectangle:");
	int l=sc.nextInt();
	int b=sc.nextInt();

	Area obj1=new Area(r);
	Area obj2=new Area(l,b);

  }  
  } 

