package Abstraction;

public  class FullStack extends Developer
 {

		@Override
		void User_Interface()
		{
			System.out.println("U.I ");
		}

		@Override
		void Functional_flow() 
		{
			System.out.println("Functional Flow: ");
		}
		@Override
		void Data_Security()
		{
		  System.out.println("Data Security: ");
		}

		@Override
		void Data_Management() 
		{
			System.out.println("Data Management: ");
		}

		@Override
		void data_Gathering() 
		{
			System.out.println("Data Gathering: ");
		}
		

	public static void main(String[] args)
	{
		Developer d=new FullStack();
		d.data_Gathering();
		d.Data_Management();
		d.Data_Security();
		d.Functional_flow();
		d.User_Interface();
	}

}
