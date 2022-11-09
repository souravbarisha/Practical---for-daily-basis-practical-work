package com.practical;
//append(), insert(), replace(), delete(), reverse() -- mutable class (string Builder)
public class StringBuilderExample {
	public static void my() {
		// stringBulder
		StringBuilder s1 = new StringBuilder("World");  // s1 = World
		// replace()
		s1.replace(1, 3, "java"); 
		System.out.println("replace is : "+ s1); // Wjavald
		//delete(),
		s1.delete(1,3);
		System.out.println("after delete s1 is : "+ s1 ); // Wvald
		// reverse
		s1.reverse();
		System.out.println("reverse of s1 is : "+ s1); //dlavW
	}
	public static void main(String[] args) {
		my();
	}
}
