package Polymorphism;
public class Child1 extends Parent1
{
	  void display(int a,int b)                
	{
		System.out.println("Child Class Default Method: "+a+" "+b);    
	}
	
	  public void display1(float f)
	{
		System.out.println("Child Class Public Method: "+f);
	}
	
	  protected void display2(String s)
	{
		System.out.println("Child Class Protected Method: "+s);
	}
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child1 c=new Child1();  // Runtime object
		Parent1 p=new Child1();
		p.display(10,20);
		p.display1(12.14f);
		p.display2("Akshay");
		Parent1 p1=new Parent1();
		p1.display(20,40);
		p1.display1(55.12f);
		p1.display2("Bedre");
		 // we can't use static,final keyword with method while overriding 
		// private Access modifier can't use 
		// parent class method public >>> child class method should be public 
		// parent class method protected >>> child method protected,public
		// parent class method default >>> child class method default,public,protected
		}
}
