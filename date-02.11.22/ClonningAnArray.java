package com.practical;

public class ClonningAnArray {
public static void main(String[] args) {
	int [] arr = {44,4,5,6}; // declaring & initializing an array
	System.out.println("print the actual array");
	for(int i : arr) // for each loop for printing
		System.out.println(i); // print
	System.out.println("print the clone array");
	int carr [] = arr.clone(); // creating clone array
	for(int i : carr) // for each loop for cloning array
		System.out.println(i);
	System.out.println("both array are eual or not?");
	System.out.println(arr = carr); // checking
}
}
