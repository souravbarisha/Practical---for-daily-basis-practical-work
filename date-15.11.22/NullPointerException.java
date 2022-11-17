package exceptionHandling;
// invoked method on the null object
public class NullPointerException {
/*	int a = 10;
	// method invoked by using null object
	public static NullPointerException ram() {
		return null;
	}*/
	String str = null; // string value null
	int arr[] = null; // array object null
String convert(String s) {
	return s.toUpperCase();
}
	
public static void main(String[] args) {
	NullPointerException obj = new NullPointerException();
 //	NullPointerException obj = new NullPointerException.ram();
 // through method passing arguments as null
	System.out.println(obj.convert(null));
	System.out.println(obj.arr.length);
	System.out.println(obj.str.equals("Sourav"));
	//System.out.println(obj.a);
}
}
