//3.	Write a Java Program to demonstrate the use of static variable, static block and static method.
/*import java.util.Scanner;
class A
{
	static
	{
		
		System.out.println("This Block Will Execute Even Before Main Function!!");
		getCount();
	}
	static int count=0;
	A()
	{
		count++;
		
	} 
	static void getCount()
	{
		System.out.println("Count: "+count);
	}
}
class Static
{
	public static void main (String[] args) 
	{
		A ob1=new A();
		A.getCount();
		A ob2=new A();
		ob1.getCount();
		A ob3=new A();
		A.getCount();
	}
} */








//1 single inheritance.....
import java.util.Scanner;
class SingleInheritance
{
	public static void main (String[] args) 
	{
		Employee emp1=new Employee();
		emp1.putData();
		emp1.getData();

	}
}
class Person
{
	String name;
	long aadharNo;
	long salary;
}
class Employee extends Person
{
	Scanner sc=new Scanner(System.in);
	void putData()
	{
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter AADHAR No.: ");
		aadharNo=sc.nextLong();
		System.out.print("Enter Salary: ");
		salary=sc.nextLong();
	}
	void getData()
	{
		System.out.println("Name-"+name);
		System.out.println("AADHAR No.-"+aadharNo);
		System.out.println("Salary-"+salary);
	}
}