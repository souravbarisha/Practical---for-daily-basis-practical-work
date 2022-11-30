package file_I_O;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIS {
public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("D:\\anudip\\test1.txt");
	   BufferedInputStream b = new BufferedInputStream (f);
	int i;
	while((i=b.read())!=-1) {
		System.out.println((char)i); // convert it into character
	}
	f.close();
	b.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
