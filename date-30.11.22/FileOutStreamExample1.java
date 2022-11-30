package file_I_O;

import java.io.FileOutputStream;

public class FileOutStreamExample1 {
public static void main(String[] args) {
	try {
	FileOutputStream f = new FileOutputStream("D:\\anudip\\test.txt");// destination
	String s = "Welcome to Anudip Foundation";
	byte b[] = s.getBytes(); // converting string into byte array
	f.write(b);
	f.close();
	System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
