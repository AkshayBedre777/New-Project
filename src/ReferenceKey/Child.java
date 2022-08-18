package ReferenceKey;
class parent
{
	String s= "Parent class Instance Variable:";
	void p1(int a,String s1)
	{ 
		
		System.out.println("Parent Method (1):"+a+ " "+s1);
	}
	void p2()
	{
		this.p1(555, "KKK");
		System.out.println("Parent Method (2):");
	}
	 parent()
	{
		System.out.println("Non Parametrized Const(Parent): ");
	}
	 parent(String s2,int a1)
	 {
		 System.out.println("Parent Parametrized Const: ");
	 }
	
}
public class Child extends parent {
	String s="Child class Instance Variable:";
	void c1()
	{
		String s="Child class Local Variable:";
		System.out.println(super.s); //parent class instance variable
		System.out.println(this.s); //child class instance variable
		super.p1(10, "Akshay"); // parent class method 
	}
	void c2()
	{
		
		this.c1(); //child class c1 method
		super.p2();//parent class p2 method
		
	}
	Child()
	{
		super();  // parent class Non Parameterized Constructor
		System.out.println("Non Parametrized Const(Child): ");
	}
	Child(String x,int y)
	{
		
		super("Parent",123); // parent class Parameterized Constructor
		System.out.println("Child Parametrized Const:");
		
	}
	Child(int a)
	{
		this("Akshay",10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Child ob=new Child();
		ob.c1();
		ob.c2();
		Child ob1=new Child("ByteTechnology",500);
		}
}
