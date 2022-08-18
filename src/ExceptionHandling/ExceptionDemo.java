package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExceptionDemo {

	public static void main(String[] args)
	{
	
		int a=50,b=0,c;              
		try                              // In try block we write risky code   
		{
	      c=a/b;   //Arithmetic Exception                   
		}catch (ArithmeticException e)   // In catch block we handle exception
		{
		   System.out.println("\nArithmatic Exception Handled: ");
		}
		try 
		{
			int arr[]=new int[4];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
			for(int i:arr)
		    {
				System.out.println(i); //Array Index Out Of Bounds Exception
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
		    System.out.println("\nArray Index Out Of Bounds Exception Handled: ");
		}
		
		String s="Akshay";
		try
		{
			System.out.println(s.charAt(9)); //String Index Out Of Bounds Exception
		}
		catch (Exception e) 
		{
			System.out.println("\nString Index Out Of Bounds Exception Handled: ");
		}
		
		PrintWriter pw=null;
		
		    try 
			{
				pw=new PrintWriter(new File("E:\\Abc.txt")); //File Not Found Exception 
			} 
			catch (FileNotFoundException e)
			{
				System.out.println("\nFile Not Found Exception Handled: ");
			}
		 
		    finally 
		    {
		    	System.out.println("\nStatement Must be Executed : ");
			}
		    
		pw.write("This is JAVA file");
		pw.flush();
		pw.close();
		
	}
	}
