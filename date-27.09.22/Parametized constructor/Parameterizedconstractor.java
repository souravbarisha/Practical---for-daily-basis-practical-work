package com.practical;

public class Parameterizedconstractor {
int age;
String name;
Parameterizedconstractor(int a, String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+ " "+name);
}

public static void main (String [] args) {
	Parameterizedconstractor d = new Parameterizedconstractor(50,"karan");
	Parameterizedconstractor d1 = new Parameterizedconstractor(45,"rohan");
	d.show();
	d1.show();
}
}
