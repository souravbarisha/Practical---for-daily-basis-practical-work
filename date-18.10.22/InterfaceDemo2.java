package com.practical;

interface multiple_in1{ // 1st parent interface
	void show();
}
interface multiple_in2{ // 2nd parent interface
	void display();
}

public class InterfaceDemo2 implements multiple_in1,multiple_in2{
public void show() {
	System.out.println("hi");
}
public void display() {
	System.out.println("hello");
}
public static void main(String [] args) {
	InterfaceDemo2 obj = new InterfaceDemo2();
	obj.show();
	obj.display();
}
}
