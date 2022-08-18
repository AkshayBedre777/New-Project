package Abc;
class car{
	void parentMethod()
	{
		System.out.println("Parent Class: car ");
	}
	void vehicalType(String s)
	{
		System.out.println("Vehical Type: "+s);
	}
}
class Audi extends car  //child  class acquires the property of parent class
{
	void childMethod()
	{
		System.out.println("Child class Extends Parent Class Car: ");
	}
	void brand(String s1)
	{
		System.out.println("Brand: "+s1);
	}
	void speed(int a)
	{
		System.out.println("Speed: "+a);
	}
}
class BMW extends car   //sub child  class acquires the property of parent class
{
	void subChildMethod()
	{
		System.out.println("Sub child Extends Parent Class Car: ");
	}
	void millage (int a1)
	{
		System.out.println("millage : "+a1);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
	BMW b=new BMW();
	b.parentMethod();
	b.vehicalType("CAR");
    b.subChildMethod();
    b.millage(45);
    Audi a=new Audi();
    a.parentMethod();
    a.vehicalType("BUS");
    a.childMethod();
    a.brand("Honda City");
    a.speed(120);
   
    
	}

}
