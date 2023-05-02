import java.util.*;
class Replace{
	public static void main(String ar[]){
		int n,a[],i,dlt,ele;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		System.out.println("Enter the array:");
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
       System.out.println("Enter the element to replace:");
       dlt=sc.nextInt();
       System.out.println("Enter the element to add:");
       ele=sc.nextInt();
       for(i=0;i<n;i++)
       {
       	if(a[i]==dlt)
       	 {temp=a[i];
       	 a[i]=ele;
       	 ele=temp;}
       }
       for(i=0;i<n;i++){
       	System.out.println(a[i]);
       	System.out.println("\n");
       }

	}
}