package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
public static void main(String[] args) {
	List<String> a1 = new ArrayList<String>();// declaring ArrayList Using List
	// method add --- we can add the elements in the list
	a1.add("Rose");
	a1.add("Sunflower");
	a1.add("Rose");
	a1.add(0,"Lily");
	a1.add(2,"Daisy");
	a1.add("Marigold");
	a1.add(6,"Tulip");
	a1.add("Jasmine");
	a1.add("Orchaid");
	a1.add("Lotus");
	a1.add(5,"Lavender");
	a1.add("Sourav");
	
	System.out.println(a1);
	// no of size
	System.out.println("Size of array list : "+a1.size());	
	// specific element of given index using get
	System.out.println("Element of index value is: "+ a1.get(6));
	// remove any element from list using remove()
	a1.remove(6);
	System.out.println(a1);
	System.out.println("Size of ArrayList is : "+a1.size());
}
}
