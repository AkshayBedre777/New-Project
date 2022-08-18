package Encapsulation;

public class ImpClass {

	public static void main(String[] args) 
	{
		Company c=new Company();
		c.setDeveloper("Front End Developer ");
		c.setSalary(80000);
		c.setTester("Functional Test Engineer ");
		c.setEmp_Id(324541);
		c.setMobile_No(260030);  
		System.out.println("\nDeveloper: "+c.getDeveloper()+"\nSalary:  "+c.getSalary()+"\nEmployee ID: "+c.getEmp_Id());
		System.out.println("Tester: "+c.getTester()+"\nSalary: "+c.getSalary()+"\nEmployee ID: "+c.getEmp_Id());
		c.setDeveloper("Back End Developer ");
		c.setSalary(100000);
		c.setTester("Performance Test Engineer ");
		c.setEmp_Id(654541);
		System.out.println("\nDeveloper: "+c.getDeveloper()+"\nSalary:  "+c.getSalary()+"\nEmployee ID: "+c.getEmp_Id());
		System.out.println("Tester: "+c.getTester()+"\nSalary: "+c.getSalary()+"\nEmployee ID: "+c.getEmp_Id());

	}

}
