package file_I_O;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOS {
public static void main(String[] args) {
	try {
		FileOutputStream f = new FileOutputStream("D:\\anudip\\tes1.txt");
	    BufferedOutputStream b = new BufferedOutputStream(f);
	    String s = "Welcome to Coding World";
	    byte b1[] = s.getBytes(); // converting string into byte array
	    f.write(b1);
	    f.close();
	    System.out.println("done");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}
