package com.practical;
// MULTIDIMETIONNAL ARRAY
public class Array2D {
public static void main(String[] args) {
	// declaring & intializing 2D array
	int arr[][]= {{2,5,6},{4,6,8}};
	for(int i=0;i<2;i++) {// for printing row
		for(int j=0;j<3;j++) {// for printing column
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		
	}
}
}
