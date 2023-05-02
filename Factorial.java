import java.util.*;
class Factorial{
   public static void main(String ar[]){
   	Scanner sc=new Scanner(System.in);
   	int num,i,fact=1;
   	System.out.println("Enter the num:");
   	num=sc.nextInt();
   	for(i=1;i<=num;i++)
   {
   	 fact=fact*i;
   }
   System.out.println(fact);

   }
}