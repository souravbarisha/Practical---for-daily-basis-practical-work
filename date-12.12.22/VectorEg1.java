package collections;

import java.util.Vector;

public class VectorEg1 {
public static void main(String[] args) {
	Vector<String> vc = new Vector<String>(4); // creating vector
	// adding elements to a vector
	vc.add("Dog");
	vc.add("Cat");
	vc.add("Tiger");
	vc.add("Lion");
	// checking size & capacity
	System.out.println("Size: "+ vc.size());
	System.out.println("Capacity: "+ vc.capacity()); // old cap *3/2 +1
	// add more elements
	vc.addElement("Cow");
	vc.addElement("Goat");
	System.out.println("After adding elements: ");
	System.out.println("Size: "+ vc.size());
	System.out.println("Capacity: "+ vc.capacity());
	// checking cat is present in the vector or not
	System.out.println(vc);
	if(vc.contains("Cat")) {
		System.out.println("Element present");
	}
	else {
		System.out.println("Element not present");
	}
	// getting 1st element
	System.out.println("1st element: "+ vc.firstElement());
	// getting last element
	System.out.println("last element: "+ vc.lastElement());
    // checking index of specified element
	System.out.println("index: "+ vc.indexOf("Cat"));

}
}
