package com.practical;

public class Staticvariable1 {
int rollno;
String name;
 float fee;
static String college= "SRM";
// STATIC VOID CHANGE(){
// college= "ITC"
// constructor
Staticvariable1(int rollno, String name,float fee){
	this.rollno= rollno;
	this.name= name;
	this.fee= fee;
}
//method
void display() {
	System.out.println(rollno+ " "+name+" "+fee+" "+college);
}
public class Staticvariable{
	public static void main(String [] args) {
		// Staticvariable.change();
		//object
		Staticvariable1 s1 = new Staticvariable1(111,"sourav",10000);
		Staticvariable1 s2 = new Staticvariable1(222,"bapan",15000);
		s1.display();
		s2.display();
	}
}
}
