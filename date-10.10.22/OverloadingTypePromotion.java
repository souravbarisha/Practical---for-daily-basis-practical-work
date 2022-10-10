package com.practical;

public class OverloadingTypePromotion {
void add (int a, long b) {// method 1
	System.out.println(a+b);
}
void add(int a, int b, int c) {// method 2
	System.out.println(a+b+c);
}
public static void main(String []args) {
	OverloadingTypePromotion obj = new OverloadingTypePromotion();
	obj.add(2,3); // 2nd int will be promoted to long
	obj.add(10,30,20);
}
}

// byte - int --- short --- long-float-double
// char -- int - float-double-long