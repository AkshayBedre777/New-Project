package Abc;

public class ConstructorDemo  {

	
	ConstructorDemo ()  //no arg constructor
	{
		System.out.println("\nThis is Non Parameterizd Constructor:");
		
	}
	ConstructorDemo(int i,String S) //Parameterized constructor
	{
		System.out.println("\nThis is Parametrized Constractor:");
		System.out.println("\nRoll No: "+i);
		System.out.println("\nName: "+S);
	}
	void Method()  // this is method
	
	{
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println("\nThis is Method "+z);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo d=new ConstructorDemo();
		ConstructorDemo d1=new ConstructorDemo(1,"Akshay");
		ConstructorDemo d2=new ConstructorDemo(2,"Ram");
		ConstructorDemo d3=new ConstructorDemo(3,"Rohit");
		d.Method();
	
		

	}

}