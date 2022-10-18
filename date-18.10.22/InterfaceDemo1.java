package com.practical;

 interface Test {// interface
void show();  // common method
}
class Class2 implements Test {// 1st child class
	public void show() {  // method of class
		System.out.println("Hello my future Employees");
	}}
class InterfaceDemo1 implements Test{// 2 child class
	public void show() {
		System.out.println("welcome to the company");
	}

	public static void main (String [] args) {
		InterfaceDemo1 obj = new InterfaceDemo1(); // create the object 
		Class2 obj1 = new Class2();
		obj.show();  // calling the method
	    obj1.show();
	}
}
