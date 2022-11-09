package com.practical;
// append(), insert(), replace(), delete(), reverse() -- mutable class (string Buffer)
public class StringBufferExample {
public static void my() {
	// String Buffer
	// append()
	StringBuffer s = new StringBuffer("Hello");  // object of string buffer class
	s.append("World");
	System.out.println("String is : "+ s); // HelloWorld
	// insert()
	s.insert(2,"Riya"); //( int off set , string s)
	System.out.println("insert is : "+ s); // HeRiyalloWorld
   // replace()
	s.replace(1, 3, "java"); // (beginwith, endswith, string s)
	System.out.println("replace is : "+ s);// HjavaiyalloWorld
	
	
}
public static void main(String[] args) {
	my();
}
}
