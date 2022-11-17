package exceptionHandling;

import java.io.IOException;

public class ThrowEx1 {
 void show() throws IOException{
	 throw new IOException("Throw exception");
 }
 void display() throws IOException {
	 show();
 }
 void fetch() {
	 try {
		 display();
	 }
	 catch(Exception e) {
		 System.out.println("exception solved");
	 }
 }
public static void main(String[] args )/*throws IOException */ {
	ThrowEx1 obj = new ThrowEx1();
	obj.fetch();
	/* if we call a method that declares an exception an exception, then we must declare the exception on main method
	obj.display();
	obj.show(); */
	System.out.println("the end");
}
}
