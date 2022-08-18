package CollectionFramework;

public class CastingDemo {

	public static void main(String[] args)
	{
		byte b=10;
		int i=b;           // Widening Casting perform by Complier 
		System.out.println("Widening Casting: "+i); 
		
		float f=50.50f;
		double d=f;       
		System.out.println("Converting Smaller data type to Larger data type: "+d);
		
		double db=120;
		int a=(int) db;   // Narrowing Casting perform by Programmer
		System.out.println("\nNarrowing Casting: "+a);
		
		short s=60;
		byte by=(byte) s;
		System.out.println("Converting Larger data type to Smaller data type: "+by);
	}

}
