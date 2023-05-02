import java.util.*;
class Test
	{
      Scanner sc=new Scanner(System.in);
      String str;
      int roll,mark[],i,n=5;
      void read()
      {       
      System.out.println("Name:");
      str=sc.nextLine();
      System.out.println("Rollno:");
      roll=sc.nextInt();
      mark=new int[n];
      System.out.println("Enter the marks of 5 subs:");
      for(i=0;i<n;i++)
      {
      	mark[i]=sc.nextInt();
      }
  }
     void display()
    {
    	System.out.println("Enter the name:"+str);
    	System.out.println("Enter the Rollno:"+roll);
    	System.out.println("Marks of 5 subs: ");
    	for(i=0;i<n;i++){
    	System.out.println((i+1)+" :"+mark[i]+" \n");
    }  
   }
}
class Student{
      public static void main(String ar[])
      {
      	Test obj=new Test();
      	obj.read();
      	obj.display();
      }
}