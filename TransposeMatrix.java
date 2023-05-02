import java.util.*;
class TransposeMatrix
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c,i,j,a[][];
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
		System.out.println("The matrix before transpose is :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("Transpose is ");
	     for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println("\n");
		}	
	}
}
