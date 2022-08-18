package Abc;
public class thisDemo {
	int a=50;String s="Java";  // instance variable
	void method() {
		int a=10; String s="Akshay"; 
		System.out.println(this.a+" "+this.s); //this use to refer current class instance variable
	}
	void method1()
	{
		int a=15; String s="ByteSquare";
		this.method();  //this can be used to call current class method
		System.out.println("This is Method1: " +a+" "+s );
	}
	void method2()
	{
		this.method1();
		System.out.println("This is Method2: ");
	}
	thisDemo()
	{
		System.out.println("Non Parameterizd Constructor: ");
	}
	thisDemo(int a,String s)
	{
		this(); // this can be used to call current class Constructor 
		System.out.println("Two Parameter Const: ");
	}
	thisDemo(int a,int b,String s)
	{
		 this(10,"Akshay");
		 System.out.println("Three Parameter Const:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  thisDemo obj=new thisDemo();
      obj.method();
      obj.method1();
      obj.method2();
	  thisDemo obj2=new thisDemo(10,"Akshay");
      thisDemo obj3=new thisDemo(20,50,"Bedre");
      
	}
}
