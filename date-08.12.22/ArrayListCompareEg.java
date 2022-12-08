package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {
	public static void main(String[] args) {
		// arraylist a1
		List<String> a1 = new ArrayList<String>();// creating a arraylist // generic -- after java 5

		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Rose");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("Marigold");
		a1.add("Tulip");
		a1.add("Jasmine");
		a1.add("Orchaid");
		a1.add("Sourav");
		
		System.out.println(a1);
		// arraylist a1
		List<String> a2 = new ArrayList<String>();// creating a array list // generic -- after java 5

		a2.add("Rose");
		a2.add("Sunflower");
		a2.add("Rose");
		a2.add("Lily");
		a2.add("Daisy");
		a2.add("Marigold");
		a2.add("Tulip");
		a2.add("Jasmine");
		a2.add("Orchaid");
		a2.add("Sourav");
		
		System.out.println(a2);
		
		// compare both array list
		boolean b = a1.equals(a2);
		System.out.println(b);
		// compare both array list
		a1.add("Red Rose"); // add new element in a1 array list
		boolean b1 = a1.equals(a2);
		System.out.println(b1);
}
}
