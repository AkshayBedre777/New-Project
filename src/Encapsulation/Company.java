package Encapsulation;

public class Company
{
	private int Emp_Id;
	private String Tester,Developer;
	private double Salary;
	private int Mobile_No;
	public int getMobile_No()  // Getter Method
	{
		return Mobile_No;
	}
	public void setMobile_No(int mobile_No)   //Logic Under Setter method
	{
		Mobile_No = mobile_No;
		String strNum [] = {"7030260030","9535442125","75865485465","964532111"}; // only accept 10 digit no 
		String strPat="[0-9]{10}";
		for(String no:strNum)
		{
			System.out.println("Mobile Number: "+no+"=>"+no.matches(strPat));
		}
	}
	public int getEmp_Id() 
	{
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id)
	{
		Emp_Id = emp_Id;
			
	}
	public String getTester() 
	{
		return Tester;
	}
	public void setTester(String tester) 
	{
		Tester = tester;
	}
	public String getDeveloper() 
	{
		return Developer;
	}
	public void setDeveloper(String developer)
	{
		Developer = developer;
	}
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double salary) 
	{
		Salary = salary;
	}
	
}