package com.practical;
// method overloading- same name method with different argumants
// two way we can overload the methodes
//1. changing no. of arguments
//2. changing data type of arguments
public class OverloadingChangingArgs {
	//1. changing no. of arguments ->>>>>>>
	
/*static int sum(int a, int b) { // two arguments
	return a+b;
}
static int sum(int x, int y, int z) { // three arguments
	return x+y+z;
}*/

	//2. changing data type of arguments ->>>>>>>
	
static int sum(int a, int b) { // two arguments
	return a+b;
}
static double sum(double a, double b) { //two arguments
	return a+b;
}
 public static void main(String []args) {
//	 System.out.println(OverloadingChangingArgs.sum(5,6));
//	 System.out.println(OverloadingChangingArgs.sum(5, 6,7));
	 
	 System.out.println(OverloadingChangingArgs.sum(5,6));
	 System.out.println(OverloadingChangingArgs.sum(5.5, 6.5));
 }
}
