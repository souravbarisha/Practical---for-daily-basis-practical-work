package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	//creating HashSet and adding elements
public static void main(String[] args) {
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.add("one");
	lhs.add("two");
	lhs.add("three");
	lhs.add("four");
	lhs.add("five");
	System.out.println("Original list: "+lhs);
	// removing an exists element from the above mentioned list
	System.out.println("removing: "+lhs.remove("two"));// return true
	// removing an not existing element from the above mentioned list
	System.out.println("removing: "+lhs.remove("six")); // return false
	
	
}
}
