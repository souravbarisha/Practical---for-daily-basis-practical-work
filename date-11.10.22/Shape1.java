package com.practical;
//super keyword-- reference variable which refer immedite parent class
public class Shape1 {
void print() {// parent class
	System.out.println("print circle");
}
}

class Size1 extends Shape1 {// chile class
	void print() {// same method of parent class(child class method)
		System.out.println("print triangle");
	}
	
     void display() {// new method of child class
			System.out.println("print nothing");
			
		}
     void show() {// final method
    	 super.print(); // refer immediate parent mathod
    	 display();
    	 print();
     }
	}

class SuperMethod{
	public static void main (String args[] ){
		Size1 obj = new Size1();
		obj.show();
	}
}