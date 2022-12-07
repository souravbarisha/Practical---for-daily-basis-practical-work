package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {
public static void main(String[] args) {
	List<String> a1 = new ArrayList<String>();// creating a string arraylist // generic -- after java 5

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
	// sorting
	System.out.println("String sorted list : ");
	Collections.sort(a1);
	for(String a : a1) {
		System.out.println(a);
	}
	
	List<Integer> a11 = new ArrayList<Integer>();// creating a Integer arraylist 
	a11.add(20);
	a11.add(60);
	a11.add(20);
	a11.add(10);
	a11.add(67);
	a11.add(38);
	a11.add(98);
	a11.add(5);
	a11.add(30);
	a11.add(11);
	a11.add(25);
	
	System.out.println("Integer sorted list : ");
	Collections.sort(a11);
	for(Integer i : a11) {
		System.out.print(i+", ");
	}
	System.out.println("\n reverse list : ");
	Collections.reverse(a11);
	System.out.println(a11);
}
}
