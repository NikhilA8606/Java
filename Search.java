import java.util.*;
class Search{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter the Character to be serach:");
		char ch=sc.next().charAt(0);
		int p=str.indexof(ch);
		System.out.println("The character found at "+p);
		}
	}

        