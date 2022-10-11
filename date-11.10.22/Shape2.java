package com.practical;
// refer immediate parent class constructor
public class Shape2 {// parent class
	// constructor of parent class
	public Shape2 () {
		System.out.println("Hello");
	}
}

class Size2 extends Shape2 {// child class
	// constructor of child class
	Size2(){
		// invoke immediate parent class constructor line no 7
		super();
		System.out.println("hi");
	}
}

class Supercons{
	public static void main(String args[]) {
		Size2 obj = new Size2();
	}
}
