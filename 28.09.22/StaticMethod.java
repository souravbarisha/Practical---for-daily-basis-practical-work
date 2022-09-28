package com.practical;

public class StaticMethod {
int rollno;
String name;
float fee;
static String college = "MIT";
//static method to change the value of static variable
static void change() {// static method
	college = "ITC";
	
}
//constructor
StaticMethod(int rollno, String name, float fee){
	this.rollno = rollno;
	this.name = name;
	this.fee = fee;
}
// method
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}
public class StaticMethod1{
	public static void main(String[] args) {
		// calling static mathod with class name
		StaticMethod.change();
		// creating object
		StaticMethod s1 = new StaticMethod(100,"sourav",15000);
		StaticMethod s2 = new StaticMethod(200,"bapan",20000);
		s1.display();
		s2.display();
	}
}
}
