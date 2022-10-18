package com.practical;
// we can take any no. of arguments
public class Varargs {
static void show(String...text) {// using varargs = variable arguments
	System.out.println("show method invoked");
	for(String s:text) {// for each loop
		System.out.println(s);
	}
}
public static void main(String[] args) {
	show();// zero arguments
	show("hi");// one args
	show("i","love","coding");// three args
	// we can give multiple arguments 
}
}
