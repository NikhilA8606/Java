import java.util.*;
class Frequency
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter the Character to count:");
		char ch=sc.next().charAt(0);
		int i,l=str.length(),count=0;
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		 System.out.println("The printed element is "+count+" times" );
		}
	}