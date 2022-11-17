package exceptionHandling;
// when multiple catch existed then only 1st exception will execute 
public class MultiCatchBlock {
	static void mFunc(){
		try {
//			int i = 50/0; // Arithmetic Exception
//			System.out.println(i);
			
			int arr[] = new int[3]; // Array index out of bound exception
			arr[4] = 24;
		}
		catch(ArithmeticException e) {
			System.out.println("only 1st Arithmetic Exception will execute");
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("now Array inderx out of bound exception will execute");
		}
		finally {
			System.out.println("this is finally block");
		}
	}
public static void main(String[] args) {
	mFunc();
}
}
