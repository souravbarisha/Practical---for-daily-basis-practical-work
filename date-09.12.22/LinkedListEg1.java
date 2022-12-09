package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg1 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();// create list
	l1.add("Mishab");
	l1.add("Avishek");
	l1.add("Atif");
	l1.add("Niladri");
	l1.add("Soumya");
	l1.add("Sourav");
	
	System.out.println(l1);
	Iterator<String> itr = l1.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	// adding an element at the specific position
	l1.add(2, "Nisha"); // add (int index, element
	System.err.println("After adding: "+l1);
	
	LinkedList<String> l2 = new LinkedList<String>();// create list
	l2.add("Peso");
	l2.add("Shifa");
	l2.add("Elijah");
	System.err.println("List 2 elements: "+l2);
	// adding ALL  2nd list elements to the 1st list
	l1.addAll(l2);
	System.err.println("After adding all elements of list 2: "+l1);
	//adding ALL  2nd list elements to the 1st list at a specific position
	l1.addAll(2,l2);
	System.err.println("After adding all elements of list 2 at a specific position: "+l1);
	// adding elements at the 1st position
	l2.addFirst("Pallabi");
	System.out.println("Add elements at 1st: "+l2);
	// adding elements at the last position
	l2.addLast("Subhajit");
	System.out.println("Add elements at last: "+l2);
	}
}
