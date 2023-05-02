import java.util.*;
class Test
	{
      void area(int x,int y)
      {
        System.out.println("Area of Rectangle: "+(x*y));
      }
      void area(int r)
      {
      	System.out.println("Area of circle: "+(3.14*r*r));
      }
     
     
  }
  class Area{
      public static void main(String ar[])
      {
      	Scanner sc=new Scanner(System.in);
      	int ln,br,ra;
      	Test obj=new Test();
      	System.out.println("Length of Rectangle:");
      	ln=sc.nextInt();
      	System.out.println("Breadth of Rectangle:");
      	br=sc.nextInt();
      	obj.area(ln,br);
      	System.out.println("Radius of Circle:");
      	ra=sc.nextInt();
      	obj.area(ra);
      }
  }





      	



