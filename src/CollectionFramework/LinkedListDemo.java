package CollectionFramework;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Akshay");
		l.add("Rohit");
		l.add("Virat");
		l.add("Akshay");
		l.add("Dhoni");
		
		// Using for loop
		
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
		
		// Using ForEach Loop
		
//		for(Object obj:l)
//		{
//			System.out.println(obj);
//		}
		
		// By using Iterator Method
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\nLinked List Elements: "+l);
		
		l.addFirst("Mahi");
		l.addLast("Hardik");
		
		System.out.println("\nAfter adding First & Last Element: "+l);
		
		System.out.println("\nGet First: "+l.getFirst());
		System.out.println("\nGet Last: "+l.getLast()); 
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("\nAfter removing Fist & Last: "+l);
		
		l.clear();
		System.out.println("\nClear: "+l);

	}

}
