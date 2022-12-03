package file_I_O;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
// write a java program to read first 3 line from a file
public class ReadLine {
public static void main(String[] args) {// main method
	LineNumberReader b = null; // bufferreader class
	
	String s = " "; // blank string
	try {
		LineNumberReader l = new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\anudip\\test5.txt")));// check condition
	 while(((s = l.readLine()) != null) && l.getLineNumber() <= 3) {
		 System.out.println(s);
	 }
	 l.close();
	}
	catch(FileNotFoundException e) {// file not found exception
		System.out.println("File not found");
	}
	catch(IOException I) {// input output exception
		System.out.println("unable to read file");
	}
}
}
