package Abc;
interface one
{
	void one ();
	void two();
	int a=50;
	static void three() 
	{
		int a=20;
	   System.out.println("Static Method...");
	}
	default void four()
	{
		int a=30;
		this.one();
		this.two();
		System.out.println("Default method...: "+this.a);
	}
	
}
interface two
{
	
}



public class TestDemo implements one,two
{

	@Override
	public void one()
	{
		System.out.println("One....");
	}

	@Override
	public void two() 
	{
        System.out.println("Two....");
	}
	
	@Override
	public void four() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{ 
		TestDemo t=new TestDemo();
		t.one();
		t.two();
		one.three();
		t.four();
		System.out.println(a); 
	
	}

}

