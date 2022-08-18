package Abc;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
	System.out.println(ts.pollFirst());
	System.out.println(ts.pollLast());
		

	}

}
