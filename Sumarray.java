import java.util.*;
class Sumarray{
	public static void main(String ar[])
	{
		int arr[],num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter then limit of array:");
		num=sc.nextInt();
		System.out.println("Enter the elements:");
		arr=new int[num];
		 for(i=0;i<num;i++)
		  {
			arr[i]=sc.nextInt();
		  }
		 for(i=0;i<num;i++)
		  {
			sum=sum+arr[i];
		  }
		 System.out.println(sum);
		}	

	}
