package Abc;

public class Casting {

	public static void main(String[] args)
	{
		//Implicit or Widening Casting 
		
		int a=100;
		double b=a;
		
		System.out.println(b);
		
		
		//Explicit or Narrowing Casting
		
		double d=100;
		byte c=(byte)d;
		System.out.println(c);
		
		char cc[]= {'A','B','C','D'};
		for(int i=0;i<cc.length;i++)
		{
			System.out.println(cc[i]);
		}
	}

}
