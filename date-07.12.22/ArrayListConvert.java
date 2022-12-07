package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	// List al1 = new ArrayList(); non - generic
	List<String> a1 = new ArrayList<String>();// creating a arraylist // generic -- after java 5

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
	// convertion of list to array
	System.out.println("List to Array");
	String [] arr = a1.toArray(new String[a1.size()]);
	for(String s : arr) {
		System.out.println(s);
	}
	// array to list
	System.out.println("Array to List ");	
	List<String> a11 = new ArrayList<String>();
	a11 = Arrays.asList(arr);
	
	System.out.println(a11);
	
}
}
