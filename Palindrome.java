import java.util.*;
class Palindrome{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int l=0,r=str.length()-1,flag=0;
		while(l<r){
			if(str.charAt(l)!=str.charAt(r))
			{
				flag=1;
				break;
        	}
        	else
        		l++;
        	    r--;

			}
			if(flag==1)
				System.out.println("Not a palindrome");
			else 
				System.out.println("palindrome");

	}
}