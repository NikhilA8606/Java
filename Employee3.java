class Employee{
	
    void display()
    {
    	System.out.println("Name of class is Employee");
    }
    void calcSalary()
    {
       System.out.println("Salary of the Employee is 10000");
    }
}

class Engineer extends Employee
{
	void calcSalary()
	{
		System.out.println("Salary of the Employee is 20000");
		super.calcSalary();
    }
	}
	class Employee3
	{
		public static void main(String ar[])
	{
       Engineer obj=new Engineer();
       obj.display();
       obj.calcSalary();
	}
}

	
	