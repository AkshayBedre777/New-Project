package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
//     	ArrayList<Integer> al=new ArrayList<Integer>();
//	    ArrayList<String> al=new ArrayList<String>();
//		List al=new ArrayList();
		ArrayList al=new ArrayList();
		
		// Add new elements to the ArrayList
		al.add("Akshay"); //0
		al.add(100);       //1
		al.add(50.50);   //2
		al.add('A');   //3
		al.add(true);   //4
		System.out.println("ArrayList : "+al);
		
		//Size
		System.out.println("\nSize of ArrayList: "+al.size());
		
		//Remove
		
	   al.remove(1);   // Remove by using index
	  // al.remove("Akshay");  //Remove by using object
		System.out.println("\nAfter removing element from ArrayList: "+al);
		
		//Insert new element 
		
		al.add(1, "Bedre"); // add element at 1st index
		al.add("Java"); // add element at last 
		System.out.println("\nArrayList after adding element: "+al);
		
		// Retrieve specific element 
		
		System.out.println("\nRetrieve Specific Element: "+al.get(1));
				
		// Replace or Change Element 
		al.set(5, "Selenium");
		System.out.println("\nAfter Replacing Element: "+al);
				
		//search element
				
		System.out.println(al.contains("Selenium")); // true
		System.out.println(al.contains("Java"));     // false
				
		// isEmpty
		System.out.println(al.isEmpty()); // false
		
		ArrayList al1=new ArrayList();
		al1.add('B');
		al1.add('A');
		al1.add('D');
		al1.add('E');
		al1.add('C');
		
		ArrayList al2=new ArrayList(); //Empty ArrayList
		
		al2.addAll(al1); // add all Element to Empty ArrayList
		System.out.println("\nAfter Adding all Elements: "+al2);
		
		al2.removeAll(al1); // remove all
		System.out.println("\nAfter Removing all Elements: "+al2);
		
		// sorting element 
		
		System.out.println("\nElements in ArrayList: "+al1);
		Collections.sort(al1); // Ascending order
		System.out.println("\nAfter sorting Elements in ArrayList: "+al1); 
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println("\nAfter sorting Elements in Reverse order: "+al1); 
		
		Collections.shuffle(al1);
		
		System.out.println("\nAfter Shuffling Elements: "+al1);
		}
}
