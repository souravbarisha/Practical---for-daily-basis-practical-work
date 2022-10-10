package com.practical;
//method overriding (1. same name method 2. same parameters 3. IS-A relationship
// creating parent class
public class TestOverridding {
void run() {// method 1
	System.out.println("running mode on");
}
}

// creating child class
class overrridding extends TestOverridding{
	// defining same name method as its declared in the parent class
	void run() {// method 2
		System.out.println("running mode off");
		
	}
	
// main method
	public static void main(String [] args) {
		// creating an object of child class
		overrridding a = new overrridding();
		a.run();
	}
}