import java.util.*;
class Fibonacci
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int num,first=0,second=1,next;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(first<=num)
    {
    	System.out.println(first+" ");
    	next=first+second;
    	first=second;
    	second=next;
    }
	}
}