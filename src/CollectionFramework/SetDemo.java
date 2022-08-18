package CollectionFramework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {

	public static void main(String[] args)
	{
		//HashSet<Integer> hs=new HashSet<Integer>();
		//HashSet<String>hs=new HashSet<String>();
		HashSet hs=new HashSet();  //Unordered ,No duplicates allowed
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		hs.add(null);              // only allow one null value
		System.out.println("HashSet: "+hs);
		for(Object o:hs)           //for each loop 
		{
			System.out.println(o);
		}
		
		//LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		//LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		LinkedHashSet lhs=new LinkedHashSet();  //Ordered ,No duplicates allowed
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add("Akshay");
		System.out.println("\nLinked HashSet: "+lhs);
		
		TreeSet ts=new TreeSet();
		ts.add(600);
		ts.add(800);
		ts.add(300);
		ts.add(100);
		ts.add(900);
		try 
		{
		ts.add(null);   //null value not supported in TreeSet
		}catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("\nTreeSet Element: "+ts); 
		System.out.println("\nDescending Order: "+ts.descendingSet());
		System.out.println("\nSmallest No: "+ts.pollFirst());
		System.out.println("\nLargest No : "+ts.pollLast());
	}
}
