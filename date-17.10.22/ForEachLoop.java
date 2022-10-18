package com.practical;

public class ForEachLoop {
public static void main(String [] ergs) {
	// declaring arrya
	int sum = 0;
	int arr[]= {1,2,3,5,8,10};
	// using for each loop
	for (int i : arr) {
		sum = sum+i;
		
	}
	System.out.println("sum is : "+ sum); 
	
}
}
