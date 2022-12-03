package file_I_O;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterEx_1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\anudip\\test1.txt");
		fw.write("Hello World"); // writing on file
		fw.close();
		System.out.println("\nDone");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
