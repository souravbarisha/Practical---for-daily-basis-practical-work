package com.practical;

public class SquareStatic {// non static variable/ data member
int a =20;
static int square(int x) {// static method
	return x*x;
}
public static void main(String [] args) {
	//int a = 20;
	int result = SquareStatic.square(2);
	System.out.println(result);
	//System.out.println(a); // not able to call non static variable direct
}
}
