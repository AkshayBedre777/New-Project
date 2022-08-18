package Abc;
class parent
{
	void m1()
	{
		System.out.println("This is Parent Method:");
	}
	void m2(int a,String s)
	{
		System.out.println("Emp_Id: "+a);
		System.out.println("Emp_Name: "+s);
	}
}
 class child extends parent           //extend keyword is use inherit class
{
	void c1()
	{
		System.out.println("This is Child Method:");
	}
	void c2( double d,String s)
	{
		System.out.println("Salary: "+d);
		System.out.println("Address: "+s);
	}
}
 

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();  
		obj.m1();             //by using object of child class we use methods of parent class 
		obj.m2(10, "Akshay"); 
		obj.c1();             
		obj.c2(75000, "Pune");
				

	}

}
