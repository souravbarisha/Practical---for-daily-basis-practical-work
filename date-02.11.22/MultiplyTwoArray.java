package com.practical;
//matrix multiplication
public class MultiplyTwoArray {
	public static void main(String[] args) {
		// create matrix
		int a [][] = {{1,2,5},{3,4,5},{6,7,8}};
		int b [][] = {{1,2,2},{3,1,5},{4,5,6}};
		// for storing result creating another matrix
		int c [][] = new int [3][3];
		// logic and printing
		for(int i= 0; i<3; i++) {// printing row
			for(int j=0; j<3; j++) { // printing column
				c[i][j]= 0;
				for(int k=0; k<3; k++) {
				c[i][j] += a[i][k] * b[k][j]; // multiplication of two matrix
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

// 1,2,5      1,2,2
// 3,4,5      3,2,5