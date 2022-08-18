package Abstraction;

  public class BackEnd extends Developer
{
	@Override
	void Data_Security()
	{
	  System.out.println("Data Security done by Back End Developer : ");
	}

	@Override
	void Data_Management() 
	{
		System.out.println("Data Management done by Back End Developer : ");
	}

	public static void main(String[] args)
	{
		BackEnd b = new BackEnd();
		b.data_Gathering();
		b.Data_Management();
		b.Data_Security();

	}

	@Override
	void User_Interface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void Functional_flow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void data_Gathering() {
		// TODO Auto-generated method stub
		
	}

}
