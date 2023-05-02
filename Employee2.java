import java.util.*;
class Details
{
	int age,sal;
	String name,add;
	long phno;
	void details()
  { 
	Scanner sc=new Scanner(System.in);

    System.out.println("Enter the employee name:");
    name=sc.nextLine();
    System.out.println("Enter the employee Age:");
    age=sc.nextInt();
    System.out.println("Enter the PhNo:");
    phno=sc.nextLong();
    System.out.println("Enter the Adress:");
    add=sc.nextLine();
   }
 void printSalary()
 {
 	Scanner s=new Scanner(System.in);
    System.out.println("Enter the Salary:");
    sal=sc.nextInt();	
    System.out.println("The Salary of the employee is :"+sal);
 }

 class Officer extends Details{
 	 Scanner sp=new Scanner(System.in);
    System.out.println("Enter  the specialization:");
    String spec=sp.nextLine(); 
    void printspec()
    {
      System.out.println("The specialization is "+spec);
     }

     void printDetails()
     {
     	printspec();
     	super.details();
     	super.printSalary();
     }


 }

 class Manager extends Details{
 	  Scanner dp=new Scanner(System.in);
    System.out.println("Enter  the Department:");
    String dep=dp.nextLine();
    void printdepart()
    {
      System.out.println("The Department is "+dep);
     }

     void DisplayDetails()
     {
     	printdepart();
     	super.details();
     	super.printSalary();
     }


 }

 class Employee2{
	 public static void main(String ar[])
      {
      	Officer obj1=new Officer();
      	Manager obj2=new Manager();

      	obj1.printDetails();
      	obj2.DisplayDetails();
     }
 }



 