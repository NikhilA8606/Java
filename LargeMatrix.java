import java.util.*;
class LargeMatrix
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,a[][];
		System.out.println("Enter the order of the matrix:");
		n=sc.nextInt();
		a=new int[n][n];
		int large=a[0][0];
		
		System.out.println("Enter the elements of array:");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			 if(a[i][j]>large)
			 {
			 	large=a[i][j];
			 }
			}
		}
		System.out.println("The largest element is "+large);
	}
}