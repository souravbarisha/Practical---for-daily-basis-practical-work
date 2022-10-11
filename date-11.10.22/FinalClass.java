package com.practical;

// final class -- can't extend the final class
public class FinalClass {

}

class test extends FinalClass{// can't extend final class
	void show () {
		System.out.println("nothing");
	}
	public static void main(String [] args) {
		test t = new test();
		t.show();
	}
}