package Polymorphism;

public class MethodOverloading {
	
	void method1(String s)
	{
		System.out.println("String Method: ");
	}
	void method1(StringBuffer sb)                         //Method overloading >> Compile time polymorphism >>Static Binding
	{
		System.out.println("StringBuffer Method: ");
	}
	void method1(float a,String s)
	{
		System.out.println("This is Float,String Parameter: ");
	}
	void method1(String s,float a)
	{
		System.out.println("This is String,Float Parameter: ");
	}
	void method1(int...i)
	{
		System.out.println("Infinite Integer : ");
	}
	void method1(int i)
	{
		System.out.println("One Integer: ");
	}
	void method1(Object ob)
	{
		System.out.println("Object ");
	}
	void method1(float f)
	{
		System.out.println("This is Float Method: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.method1("Akshay");  // call String Method
		obj.method1(11.4f, "ABC"); // Call float , String argu Method
	    obj.method1(10,20,30,40); // Call Infinite int Method
	    obj.method1('c'); // Automatic Promotion char >>> int
		obj.method1(1111122122l); // Automatic Promotion long >>> float

	}

}
