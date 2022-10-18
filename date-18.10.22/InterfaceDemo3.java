package com.practical;

interface Multiple {// interface
 static int add(int a) {
	 return a+a;
 }
 void display();
 default void show(){// abstract method
	 System.out.println("Default method");
 }
}
class chaildclass implements Multiple{
	public void display() {// overriding of interface 1st method show
		System.out.println("hi");
	}
}
public class InterfaceDemo3{
	public static void main(String [] args) {
		Multiple obj = new chaildclass();
		obj.display();
		System.out.println(Multiple.add(5));
		obj.show();
	}
}