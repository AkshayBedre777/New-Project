package Abstraction;

 public class FrontEnd extends Developer
{
	@Override
	void User_Interface()         // initialization of abstract method
	{
		System.out.println("U.I done by Front End Developer: ");
	}

	@Override
	void Functional_flow() 
	{
		System.out.println("Functional Flow done by Front End Developer : ");
	}

	public static void main(String[] args)
	{
		FrontEnd f=new FrontEnd();
		f.Functional_flow();
		f.User_Interface();
	}

	@Override
	void Data_Security() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void Data_Management() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void data_Gathering() {
		// TODO Auto-generated method stub
		
	}

}
