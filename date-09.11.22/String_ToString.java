package com.practical;

public class String_ToString {
int RollNo;
String Name, Address;
String_ToString(int rollno, String name, String address){
	this.RollNo = rollno;
	this.Name = name;
	this.Address = address;
}
public String toString() {// return object into string  by toString method
	return RollNo +" "+ Name+ " "+ Address;
	
}
public static void main(String[] args) {
	String_ToString s1 = new String_ToString(123,"sourav","das");
	String_ToString s2 = new String_ToString(123,"puja","bera");
	System.out.println(s1);
	System.out.println(s2);
}
}
