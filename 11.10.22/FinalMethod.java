package com.practical;

// final method
public class FinalMethod {
// creating final method
	final void display() {
		System.out.println("this is the final method");
	}
	
	/*class main extends FinalMethod {
		// try to override final method
		public final void display() { // will get error due to final method can't be override
			System.out.println("the final method is overridden");
		}
	}*/
	public static void main (String []args) {
		FinalMethod obj = new FinalMethod();
		obj.display();
	}
}
