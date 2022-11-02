package com.practical;

public class CopyArray {// class
public static void main(String[] args) {
	// declaration a source array
	char [] copyFrom = {'d','e','c','f','f','e','i','n'};
	// declaring a Destination array
	char[] copyTo = new char[7];  // new array
	System.arraycopy(copyFrom, 2, copyTo, 0, 5);
	// printing the destination array
	System.out.println(String.valueOf(copyTo));
}
}
