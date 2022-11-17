package exceptionHandling;

public class TryCatch_2 {
public void show() {
	String a = "i am error";
	System.out.println(a);

try {
	int i = 50/0; // Arithmetic exception
	System.out.println(i);
	String s = "riya";
	System.out.println(s.length());
	int arr [] = new int [3]; // new array
	arr[4] = 24; // array index out of bound exception
	int m = Integer.parseInt(s); // number format exception
	System.out.println(m);
}
catch(Exception e) {
	System.out.println(e);
}
String b = "i cannot be handle";
System.out.println(a+" "+b); // i am error + i cannot be handle
}

public static void main(String [] args) {
	TryCatch_2 ep = new TryCatch_2();
	ep.show();
}}
