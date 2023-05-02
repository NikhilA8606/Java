import java.util.*;
import java.lang.*;
class Student
{
	int roll;
	int mark[]=new int[5];
	String name;
	int i;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		
	   System.out.println("Enter the name:");
	   name=sc.nextLine();
	   System.out.println("Enter the roll no:");
	   roll=sc.nextInt();
	   System.out.println("Enter the mark  of 5 subjects");
	   for(i=0;i<5;i++)
	   {
	   	mark[i]=sc.nextInt();
	   }
	}

	 void display()
	 {
	 	System.out.println("Name of the student:"+name);
	 	System.out.println("Roll No of the student:"+roll);
	 	System.out.println("Mark of the 5 subjects:");
	 	for(i=0;i<5;i++)
	 	{
	 		System.out.println("Subject "+(i+1)+"="+mark[i]);
	 		
	 	}
	 }  
	}
	 class Mark
	 {
	 	public static void main(String args[]) 
	 	{

	 		Student obj=new Student();
	 		obj.read();
	 		obj.display();
	 		
	 	}
	 }
	




