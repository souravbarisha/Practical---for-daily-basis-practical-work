package file_I_O;

import java.io.Console;

public class ConsoleEx_1 {
public static void main(String[] args) {
	try {
	Console c = System.console();
	System.out.println("Please Enter Your Name: ");
    String s = c.readLine();
    System.out.println("Welcome "+s);
    System.out.println("Please Enter Your Password: ");
    char[] ch = c.readPassword();
    String s1 = String.valueOf(ch);// converting char array to string
    System.out.println("Your Password is: "+s1);
    
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
