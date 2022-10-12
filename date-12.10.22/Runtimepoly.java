package com.practical;
// runtime polymorphism -- method overriding
public class Runtimepoly {
	int value = 50;  // data member
void show() {  // parent class method
	System.out.println("show anything");
}
}
class TestRuntimepoly extends Runtimepoly{
	int value = 70; // we can not over ride data member
	void show() { // method override
		System.out.println("show nothing");
	}
	// reference variable of parent class refers to the object of child class
	public static void main(String [] args) {
		Runtimepoly obj = new TestRuntimepoly(); // upcasting
		obj.show();
		System.out.println("value is : "+ obj.value); // method will print of child class 
		                                               // but data member will print of parent class
	}
}
