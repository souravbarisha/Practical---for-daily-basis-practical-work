package file_I_O;

import java.io.FileOutputStream;

public class FileOutStreamExample2 {
	public static void main(String[] args) {
		try {
			// write byte to string
		FileOutputStream f = new FileOutputStream("D:\\anudip\\test1.txt");
		String s = "Welcome to Anudip Foundation";
		byte b[] = s.getBytes();
		f.write(67);
		f.close();
		System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
