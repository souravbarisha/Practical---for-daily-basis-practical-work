package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {
public static void main(String ...args) {
	// creating & adding elements
	TreeSet<String> set = new TreeSet<String>();
	set.add("A");
	set.add("N");
	set.add("D");
	set.add("P");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("V");
	set.add("C");
	set.add("R");
	System.out.println("ORIGINAL SET: "+ set);
	// traversing elements through iterator in descending
	Iterator itr = set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("Lowest Value: "+ set.pollFirst());
	System.out.println("Updated set After PollFirst: "+ set);
	System.out.println("Highest Value: "+ set.pollLast());
	System.out.println("Updated set After PollLast: "+ set);
	
	System.out.println("Reverse set: "+ set.descendingIterator());
	
	// sortedset set operation
	System.out.println("Head set: "+set.headSet("D")); //Before D all
	System.out.println("Sub set: "+set.subSet("C","N"));//Alphabet btw C to N
	System.out.println("Tail set: "+set.tailSet("O"));// After O all
		
}
}
