package com.practical;
// to get the class name of array object in java
public class ClassNameArray {
public static void main(String[] args) {
	// declaration & initialization of an array
	int arr[] = {1,2,3};
	// getting the class name
	Class a = arr.getClass();
	String name = a.getName();
	// printing the class name
	System.out.println(a);
}
}
