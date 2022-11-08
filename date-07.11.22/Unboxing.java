package Wrapper;
// wrapper to primitive
public class Unboxing {
public static void main(String[] args) {
	Integer a = new Integer(2);
	Integer i = a.intValue(); // converting Integer to int 
	Integer j = a; // now compiler will write int.value() unboxing
	System.out.println(a+" "+i+" "+j);
}
}
