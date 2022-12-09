package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemove {
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
    // remove element specific element from array list 1
	l1.remove("Niladri");
	System.err.println("After Removeing: "+l1);
	// Removing specific element on the basis of particular position
	l1.remove(1);
	System.err.println("After Removeing from particular position: "+l1);
   // remove all elements from list 2
	l1.removeAll(l2);
	// remove 1st element from the list
	l1.removeFirst();
	System.out.println("After Removeing 1st element : "+l1);
	// remove last element from the list
	l1.removeLast();
	System.out.println("After Removeing last element : "+l1);
   // adding new elements to the list 1
	l1.add("Pallabi");
	l1.add("Anudip");
	l1.add("Java");
	l1.add("Pallabi");
	l1.add("Collection");
	System.out.println("updated list elements: "+l1);
	// remove first occurrence of element
	l1.removeFirstOccurrence("Pallabi");
	System.out.println("Remove first occurrence: "+ l1);
	// remove last occurrence of element
		l1.removeLastOccurrence("Pallabi");
		System.out.println("Remove last occurrence: "+ l1);
   // Traversing the list of elements in reverse order
		Iterator i = l1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// remove all the elements 
		l1.clear();
		Iterator<String> itr1 = l1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
}
}
