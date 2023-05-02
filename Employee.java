import java.util.*;
class Details
{
	int no;
	String name;
	long phno;
	void read()
  {
	Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter the employee name:");
    name=sc.nextLine();
    System.out.println("Enter the employee Number:");
    no=sc.nextInt();
    System.out.println("Enter the PhNo:");
     phno=sc.nextLong();
   }

void display()
{

    	System.out.println("The number of the employee is :"+no);
    	System.out.println("The Name of the employee is:"+name);
    	System.out.println("The Phone NO of the employee is: "+phno);
     
}
}
class Employee{
	 public static void main(String ar[])
      {
      	Scanner sc=new Scanner(System.in);
      	System.out.println("Enter the no of employees:");
      	int n=sc.nextInt();
      	int i;
      	Details obj[]=new Details[n];
      	for(i=0;i<n;i++)
      	{
      		obj[i]=new Details();
      	}
      	for(i=0;i<n;i++)
      	{
      		obj[i].read();
      	}	
      	System.out.println("Display the employee Details:");
      	for(i=0;i<n;i++)
      	{
      		obj[i].display();
      	}	

}

}
