package exceptionHandling;

public class ThrowUnchecked {
	public static void eligible(int age) {
		if(age<18) {
			// throw ArithmeticException if person age is < 18
			throw new ArithmeticException("you are not eligible fot vote");
		}
		else {
			System.out.println("person eligible for vote");
		}
	}
public static void main(String[] args) {
	eligible(12);
	System.out.println("done");
}
}
