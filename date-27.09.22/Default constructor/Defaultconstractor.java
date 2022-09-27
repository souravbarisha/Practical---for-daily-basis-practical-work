package com.practical;

public class Defaultconstractor {
int age;
String name;
void show() {//method to display age and name
	System.out.println(age + " "+ name);
}

public static void main(String [] args) {
//	1st boject for name & age
	Defaultconstractor d = new Defaultconstractor();
//	 boject for name & age
	Defaultconstractor d1 = new Defaultconstractor();
	d.show();
	d1.show();
}
}
