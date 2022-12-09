package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
public static void main(String[] args) {
	LinkedList<String> l1 = new LinkedList<String>();// create list
	l1.add("Mishab");
	l1.add("Avishek");
	l1.add("Atif");
	l1.add("Niladri");
	l1.add("Soumya");
	l1.add("Sourav");
	
	System.out.println("List 1 elements: "+l1);
	//Retrieves the 1st elements of the list -- by default
	System.out.println(l1.peek());
	//Retrieves the 1st elements of the list
	System.out.println(l1.peekFirst());
	//Retrieves the last elements of the list
		System.out.println(l1.peekLast());
	//Retrieves and remove the 1st elements of the list -- by default
	System.out.println(l1.poll());
	System.out.println("List 1 elements: "+l1);
	//Retrieves the 1st elements of the list
	System.out.println(l1.pollFirst());
	System.out.println("List 1 elements: "+l1);
	//Retrieves the last elements of the list
	System.out.println(l1.pollLast());
	System.out.println("List 1 elements: "+l1);
	 //Retrieves and remove the 1st elements of the list by default
	System.out.println(l1.pop());
	System.out.println("List 1 elements: " + l1);
	
}
}
