package exceptionHandling;

public class TryCatch {
public static void main(String[] args) {
	try {// may exception occur
		int num = 25/0; // logic
		System.out.println("Result");// if exception not occure this line will execute
	}
	catch(ArithmeticException r) {
		System.out.println("number can't divided by zero");// handling exception
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println(25/5);
	}
	System.out.println("The End"); // this line will execute because outside try catch
}
}
