import java.util.*;
class Prime{
	public static void main(String ar[]){
		int num,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		if(num==0||num==1)
		{
			System.out.println(num+"  is not prime");
		}
		else
		{
			for(i=2;i<=(num/2);i++)
			{
				if(num%i==0)
			{
				System.out.println(num+" is not prime");
				flag=1;
				break;
			   }
			}
			if(flag==0)
		{
			System.out.println(num+" is prime");
		}
		}
		
	}
}