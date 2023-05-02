import java.util.*;
class Smallarray{
	public static void main(String ar[]){
	int num,i,j,arr[],temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit:");
	num=sc.nextInt();
	System.out.println("Enter the array:");
	arr=new int[num];
	for(i=0;i<num;i++)
	{
      arr[i]=sc.nextInt();
	}
	for(i=0;i<num;i++)
	{
		for(j=i+1;j<num;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("The smallest element is:"+arr[0]);
}
}