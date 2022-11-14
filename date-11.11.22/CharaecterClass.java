package regularExpression;

import java.util.regex.Pattern;

public class CharaecterClass {
public static void main(String[] args) {
	// character class
	// [abc] =a,b,c
	//[^abc] = any char except abc, [a-zA-z]= either lower/upper case and both
	boolean b5 = Pattern.matches("[a-zA-Z]", "A");
	boolean b6 = Pattern.matches("[pqr]", "pqr");
	boolean b7 = Pattern.matches("[^abc]", "r");
	System.out.println(b5+" "+b6+" "+b7);
}
}
