package com.practical;

 class TestBinding {
void show() { // dynamic binding
	System.out.println(("ab samjhe??"));
	
}}

 public class DynamicBinding extends TestBinding {
	void show() { 
		System.out.println("override");
		
	}

	public static void main(String [] args) {
		TestBinding obj = new DynamicBinding();
		obj.show();
	}
}
