package com.practical;
//super keyword-- reference variable which refer immedite parent class
public class Shape {// parent class
	String name = "circle"; // data menber of parent class

}
class Size extends Shape{// child class
	
 String name = "Triangle"; //  data menber of child class
 void print() {
	 System.out.println(name);
	 System.out.println(super.name); // super keyword
 }

}

class SuperIV{
	public static void main (String args[] ){
		Size obj = new Size();
		obj.print();
	}
}
