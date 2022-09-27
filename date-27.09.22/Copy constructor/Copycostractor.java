package com.practical;

public class Copycostractor {
// variable along with data type
	int age;
	String name;
	//constructor & initialize
	Copycostractor(int a, String n){
		age = a;
		name = n;
   }
	// contractor to initialize another object
	// 1st away
	/*Copycostractor (Copycostractor c){
		age = c.age;
		name = c.name;
	}*/
	// or 2nd away 
	Copycostractor(){}
	
	//method
	void show() {
		System.out.println(age+ " "+name);
	}
	public static void main (String [] args) {
		Copycostractor c1 = new Copycostractor(24, "sourav");
//		Copycostractor c2 = new Copycostractor(c1); // using 1st away
		Copycostractor c2 = new Copycostractor();  //  using 2nd away 

		c2.age = c1.age;
		c2.name = c1.name;
		c1.show();
		c2.show();
	}
}

