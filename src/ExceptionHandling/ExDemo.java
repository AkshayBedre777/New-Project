package ExceptionHandling;

public class ExDemo 
{
	static void Abc()
	{
		System.out.println(10/0);
	}
	void Xyx()
	{
		Abc();
	}

	public static void main(String[] args) {
		// Default Exception Given by JVM.
		ExDemo e=new ExDemo();
		e.Xyx();
      
	}

}
