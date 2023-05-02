import java.util.*;
class AddMatrix
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c,i,j,a[][],b[][],m[][];
		System.out.println("Enter the rows  and coloumnof thematrix:");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[r][c];
		m=new int[r][c];

		System.out.println("Enter the elements of 1st matrix:");
			for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

          System.out.println("The 1st matrix is:");
			for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(" "+a[i][j]);
		}
		       System.out.println(" \n");
		       }      
		System.out.println("Enter the elements of 2nd matrix:");
			for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 2nd matrix is:");
		for(i=0;i<r;i++)
	  {
		for(j=0;j<c;j++)
			{
				System.out.print(" "+b[i][j]);
		}
		       System.out.println(" \n");
		       } 

		       System.out.println("The sum is:");
		       for(i=0;i<r;i++)
		  {
			for(j=0;j<c;j++)
			{
					m[i][j]=a[i][j]+b[i][j];
					System.out.print(" "+m[i][j]);
				}
				
				System.out.println(" \n");
		}
			}

		}
		