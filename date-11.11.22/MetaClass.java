package regularExpression;

import java.util.regex.Pattern;

public class MetaClass {
public static void main(String[] args) {
	// phone number 
	boolean b9 = Pattern.matches("[6-9][0-9]{9}", "7908415743");
	
	// email id
	boolean b10 = Pattern.matches("[a-z]+[0-9_#]*[a-z]*[@]{1}[a-z]+[.]+[a-z]{2,3}", "sourav123barisha@gmail.com");
	
	System.out.println(b9);
	System.out.println(b10);
	
	           
}
}
