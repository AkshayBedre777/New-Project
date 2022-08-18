package Interface;

 interface mobile
{
	 int i= 1000000;
	 void price();  // by default public abstract method
	 int j=50000;
     void battry();
	 
	default void camera()
	{
		System.out.println("Default Method: ");
	}

	static void specification() // static method
	{
		System.out.println("Mobile has 128 GB ROM & 8GB ROM : ");
	}
}

interface motorola extends mobile // Interface extends 
{
	void ModelName();
	String s="Motorola GT";
}

public class InterfaceDemo implements motorola // class implements
{
	@Override
	public void price() 
	{
		System.out.println("Price of Mobile is: "+i);
	}
	@Override
	public void camera() 
	{
		System.out.println("Camera of Mobile is : 64Mp");
	}
	@Override
	public void ModelName()
	{
		System.out.println("Model No is : "+s);
	}
	@Override
	public void battry() 
	{
      System.out.println("Battry of Mobile is: "+j);
	}

	public static void main(String[] args)
	{
		InterfaceDemo obj=new InterfaceDemo();
		obj.camera();
		obj.battry();
		obj.price();
		obj.ModelName();
		mobile.specification(); // static method 
		
	}
	
}
