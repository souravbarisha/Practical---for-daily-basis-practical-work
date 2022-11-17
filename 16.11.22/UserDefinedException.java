package exceptionHandling;

class UserDefinedException1 extends Exception {
	public UserDefinedException1(String s) {
		super(s);
	}}
public class UserDefinedException{
	 public static void main(String[] args) {
		try {
			throw new UserDefinedException1("User defined exception");
		}catch(UserDefinedException1 u) {
			System.out.println("Exception mil geya");
			System.out.println(u.getMessage());
		}
	}

}