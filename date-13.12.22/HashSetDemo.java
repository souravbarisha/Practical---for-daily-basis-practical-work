package collections;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	// creating HashSet and adding elements
	HashSet<String> set = new HashSet<String>();
	set.add("ram");
	set.add("rima");
	set.add("shyam");
	set.add("ram");
	set.add("ramesh");
	System.out.println("Original list: "+set);
	// removing specific element from hash set
	set.remove("ram");
	System.out.println("After invoking remove: "+set);
	HashSet<String> set1 = new HashSet();
	set1.add("pallabi");
	set1.add("rahul");
	System.out.println("New set: "+set1);
	// adding both list
	set.addAll(set1);
	System.out.println("Updated list: "+set);
	// removing all the new elements(2nd)
	set.removeAll(set1);
	//remove all
	set.clear();
	System.out.println("present list: "+set);
	
}
}
