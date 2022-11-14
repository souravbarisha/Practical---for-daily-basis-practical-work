package regularExpression;

import java.util.regex.Pattern;

public class Quantifires {
public static void main(String[] args) {
	// Quantifires
	// x?  --> x occur once or not at all 
	// x+  --> x occur once or more than one 
	// x*  --> x occur zero or more time
	// x{n} --> x occur n time // Ex- x{7} -- only 7 times
	// x{n,} --> x occur n time or more than n time // Ex- x{7} -- minimum 7 char or more 
	
	
	boolean b8 = Pattern.matches("[a-zA-Z0-9]","Anudip123ppp");
	System.out.println(b8);
}
}
