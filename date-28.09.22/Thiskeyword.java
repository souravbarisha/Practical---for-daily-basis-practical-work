package com.practical;
// with / without this keyword
public class Thiskeyword {// class 1 outer class
	// instance variable
	int rollno;
	String name;
	float fee;
	
	// parameterized constructor
	Thiskeyword (int rollno, String name, float fee){
	this.rollno= rollno;
	this.name= name;
	this.fee= fee;
             }
//method
void display() {
	System.out.println(rollno+ " "+name+" "+fee);
               }
public class Staticvariable{
	public static void main(String [] args) {
		// Staticvariable.change();
		//object
		Thiskeyword s1 = new Thiskeyword(111,"sourav",10000);
		Thiskeyword s2 = new Thiskeyword(222,"bapan",15000);
		s1.display();
		s2.display();
	}
}
}
