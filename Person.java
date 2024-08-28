package task;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	 public void DisplayPersonalInfo()
	{
	  System.out.println("Name = " + name);
	  System.out.println("Age = " + age);
	}

}

 class Employee extends Person
{
	String  empid;
	String  department;
	
	
	

	public Employee(String name, int age, String empid, String department) {
		super(name, age);
		this.empid = empid;
		this.department = department;
	}
	
	 public void displayEmployeeInfo() 
	 {
		 DisplayPersonalInfo();
		 System.out.println("EmpId = " + empid);
		 System.out.println("Depertment = " + department);
	 }
	
}


class Manager extends Employee
{
	int teamSize;

	public Manager(String name, int age, String empid, String department, int teamSize) {
		super(name, age, empid, department);
		this.teamSize = teamSize;
	}
	
	
	public void DisplayManagerInfo()
	{
		displayEmployeeInfo();
		System.out.println("TeamSize = " + teamSize);
		
	}
}
