package file_I_O;

import java.io.FileReader;

public class ReaderEx_1 {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("D:\\anudip\\test1.txt");
	int i;
	while((i = fr.read()) != -1) {
		System.out.print((char)i);
	}
	fr.close();
	System.out.println("\nDone");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
