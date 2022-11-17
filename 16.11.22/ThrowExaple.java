package exceptionHandling;

public class ThrowExaple {
	public static void myDisplay(int a) throws ArithmeticException{
		if(a>=0 && a<=35) {
			throw new ArithmeticException("value can not be less than 35");
			
		}
		else {
			System.out.println("you are pass");
		}
	}
public static void main(String[] args) {
	myDisplay(30);
}
}
