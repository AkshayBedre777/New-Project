package Abc;
class mobile{
	void m1()
	{
		System.out.println("This is Parent Method:");
	}
	void m2(int a,int b)
	{
		System.out.println("Camera: "+a);
		System.out.println("Storage: "+b);
	}
}
class brand extends mobile
{ 
	void c1()
	{
		System.out.println("This is Child class of Mobile:");
	}
	void c2(String s1,int a1) 
	{
		System.out.println("Brand Name: "+s1);
		System.out.println("Price: "+a1);
	}
}
class samsung extends brand
{
	void d1()
	{
		System.out.println("This is Child of brand:");
	}
	void d2(String s2,int a2)
	{
		System.out.println("Model Name: "+s2);
        System.out.println("Model No: "+a2);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		samsung obj=new samsung();
		obj.m1();
		obj.m2(64, 128);
		obj.c1();
		obj.c2("Appel", 85000);
		obj.d1();
	    obj.d2("Samsung", 10);

	}
}
