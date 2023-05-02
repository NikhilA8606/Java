import java.util.*;
class MultiMatrix
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2,i,j,a[][],b[][],c[][];
		System.out.println("Enter the rows  and coloumnof the 1st matrix:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the rows & coloumns of the 2nd matrix:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		a=new int[r1][c1];
		b=new int[r2][c2];
		c=new int[r1][c2];
		if(r2==c1)
		{
			System.out.println("Enter the elements of 1st matrix:");
			for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

          System.out.println("The 1st matrix is:");
			for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(" "+a[i][j]);
		}
		       System.out.println(" \n");
		       }      
		System.out.println("Enter the elements of 2nd matrix:");
			for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 2nd matrix is:");
		for(i=0;i<r2;i++)
	  {
		for(j=0;j<c2;j++)
			{
				System.out.print(" "+b[i][j]);
		}
		       System.out.println(" \n");
		       } 
         System.out.println("The product is:");
		       for(i=0;i<r1;i++)
		  {
			for(j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<r2;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
				System.out.print(" "+c[i][j]);
			}
			System.out.println(" \n");
		}
		}
		else
         System.out.println("Multiplication error");
    }
}
