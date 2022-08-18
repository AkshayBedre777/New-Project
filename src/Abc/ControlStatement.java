package Abc;

public class ControlStatement {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) //Entry controlled loop >>> while loop Runs zero & many times
		{
			System.out.println("While Loop "+i);
			i++;
		}
		
		int j=1;
		do         //Exit controlled loop. >>> do while loop Runs ones & many times 
		{
			System.out.println("Do While Loop "+j);
			j++;
		}
		while(j<=5);
		

		for(int k=10;k>=1;k--)
		{
			if(k==5)
			{
				continue; // jump statement *continue*
			}
			System.out.println(k+"*"+"Continue");
		}
		for(int l=1;l<=10;l++)
		{
			if(l==4)
			{
				break; // jump statement *break*
			}
			System.out.println(l+" Break");
		}

	}
}
