package com.practical;

abstract class Testabstract{ // abstract class
	abstract void display(); // abstract method
	void show() {
		System.out.println("non abstract method invoked");
	}
}

class Demo1 extends Testabstract { // 1st child class
	void display() {
		System.out.println("Demo1 method invoked");
	}
}
 class Demo2 extends Testabstract { // 2nd child class
	 void display() {
		 System.out.println("Demo2 method invoked");
	 }
 }
public class AbstractMethod { 
public static void main(String [] args) {
	Testabstract obj= new Demo1();
	Testabstract obj1= new Demo2();
	obj.display();
	obj.display();
	obj.show();
}
}
