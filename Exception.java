class Exception
{
	public static void main(String ar[])
	{
		int a=10;
		int b=0;
		int arr[]={1,3,4,6,8,2};

		try
		{
			a/=b;
		}
		catch(ArithmeticException mathsEx)
		{ 
			System.out.println("ArithmeticException error");
		}

		try
		{
			b=arr[a];
		}
		catch(ArrayIndexOutOfBoundsException arrayindexEx)
		{
			System.out.println("ArrayIndexOutOfBoundsException error");
		}
	}
}