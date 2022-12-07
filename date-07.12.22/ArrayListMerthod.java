package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMerthod {
public static void main(String[] args) {
	List<String> a1 = new ArrayList<String>();// creating a arraylist // generic -- after java 5

	a1.add("Ram");
	a1.add("Sam");
	a1.add("Rose");
	a1.add("Liza");
	a1.add(2,"Devid");
	a1.add("Maria");
	
	String element = a1.get(2); // get()
	System.out.println("Get index : "+ element);
	System.out.println("ArrayList is : "+ a1.isEmpty());// isEmpty() metthod
	String elemet1 = a1.remove(4); // remove()
	System.out.println("Remove index : "+ element);
	for(int i = 0; i<a1.size(); i++) {
		System.out.println(a1.get(i));
	}
}
}
