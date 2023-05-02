 import java.util.*;
class ReplaceChar{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter the Character to be replaced:");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter the Character to be added:");
		char ch2=sc.next().charAt(0);
		String str1=str.replace(ch1,ch2);
		System.out.println("The new string is "+str1);
	}
	}	

