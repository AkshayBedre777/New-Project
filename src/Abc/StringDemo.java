package Abc;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";   // using String Literals
		String str=new String("Akshay"); //using New Keyword
		StringBuffer sb=new StringBuffer("Byte");
		char ch=str.charAt(2);
		System.out.println(ch);
		boolean b=str.equals(s);
		System.out.println(b);
	    System.out.println(s.toLowerCase());
	    System.out.println(str.toUpperCase());
	    int len=s.length();
	    System.out.println(len);
	    System.out.println(str.replace("A", "B"));
	    System.out.println(str.substring(2));
	    System.out.println(str.substring(2, 4));
	    sb.append(" Technology");
	     System.out.println(sb);
	
	}

}
