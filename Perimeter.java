import java.util.*;
class Peri
	{
       Peri(int x,int y)
      {
        System.out.println("Perimeter of Rectangle: "+(2*(x+y)));
      }
       Peri(int r)
      {
      	System.out.println("Perimeter of circle: "+(2*3.14*r));
      }
  }
   class Perimeter{
      public static void main(String ar[])
      {
        Scanner sc=new Scanner(System.in);
        int ln,br,ra;
        System.out.println("Length of Rectangle:");
        ln=sc.nextInt();
        System.out.println("Breadth of Rectangle:");
        br=sc.nextInt();
        System.out.println("Radius of Circle:");
        ra=sc.nextInt();
        Peri obj1=new Peri(ln,br);
        Peri obj2=new Peri(ra);
      }
  }