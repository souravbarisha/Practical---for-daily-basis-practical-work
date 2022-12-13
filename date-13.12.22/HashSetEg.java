package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {
	// allowing null value
public static void main(String[] args) {
	Set<String> HS = new HashSet<String>();
	HS.add("AC");
	HS.add("Fan");
	HS.add("TV");
	HS.add("Laptop");
	HS.add("Coputer");
	HS.add("AC");
	HS.add(null);
	HS.add("Mouse");
	HS.add("Keyboard");
	HS.add("Earphone");
	System.out.println(HS);
	
	Iterator<String> itr = HS.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
