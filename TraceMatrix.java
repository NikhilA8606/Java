import java.util.*;
class TraceMatrix
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c,i,j,a[][],sum=0;
		System.out.println("Enter the rows of the matrix:");
		r=sc.nextInt();
		System.out.println("Enter the coloumns of the matrix:");
		c=sc.nextInt();
		a=new int[r][c];
		System.out.println("Enter the elements of array:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Trace of the matrix is "+sum);
}
}
		