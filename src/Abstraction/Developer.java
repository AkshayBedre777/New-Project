package Abstraction;

public abstract class Developer 
{
	void Work()                                        // Regular Method
	{
		System.out.println("Non Abstarct Method: ");
	}
	
	abstract void User_Interface();                    // Abstract Method only definition
	abstract void Functional_flow();
	abstract void Data_Security();
	abstract void Data_Management();
	abstract void data_Gathering();
	
}
