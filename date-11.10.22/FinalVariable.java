package com.practical;
// final keyword -- can't change the value of final variable
// final variable, final class, final method

// final variable --->>>
public class FinalVariable {
 final int value =50; // final variable
 void display() {
	 System.out.println(value);
	 // we can't change the value of the final variable
	// value = 70; // complie time error
 }
 public static void main(String [] args) {
	 FinalVariable fv = new FinalVariable();
	 fv.display();
 }
}
