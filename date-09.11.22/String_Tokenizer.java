package com.practical;

import java.util.StringTokenizer;

// simple way to break a string, package: java.util.StringTokenizer
public class String_Tokenizer {
public static void show() {// show method
	StringTokenizer str1 = new StringTokenizer("Anudip Foundation Skill and Career Development Center");
	while(str1.hasMoreTokens()) {
		System.out.println(str1.nextToken(" "));
		StringTokenizer str2 = new StringTokenizer("This can be change our career, it's very good");
		while(str2.hasMoreTokens()) {
			System.out.println();
			System.out.println(str2.nextToken(","));
		}
	}
}
public static void main(String[] args) {
	show();
}
}
