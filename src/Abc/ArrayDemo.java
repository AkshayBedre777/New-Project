package Abc;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"Akshay","Kapil","Rohit","Virat","Dhoni"};
		System.out.println(str.length);
		for(int i=0;i<str.length;i++) 
		{
			System.out.println(str[i]);
		}
		int arr1[]= {100,200,300,400,500};
		for(int j:arr1)    //using Enhance for loop
		{
			System.out.println(j);  
		}
		int arr2[]=new int[5];
		arr2[0]=11;
		arr2[1]=22;
		arr2[2]=33;
		arr2[3]=44;
		arr2[4]=55;
		for(int k:arr2)  
		{
			System.out.println(k);  
		}
		
	}

}
