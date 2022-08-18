package CollectionFramework;
class ParentClass
{

	void method()
	{
		System.out.println("Parent Class Method:");
	}
}
public class ChildClass extends ParentClass
{
	void method()
	{
		System.out.println("Child Class Method: ");
	}

	public static void main(String[] args) 
	{
		ParentClass p=new ChildClass();    // UpCasting
		p.method();
		ChildClass c=new ChildClass();     //Runtime object Child class
		c.method();
		ParentClass p1=new ParentClass();  //Runtime object Parent class
		p1.method();
		//ChildClass c1=new ParentClass();   //DownCasting not supported by java
	}

}
