package file_I_O;

import java.io.*;

public class SingleCharFIS {
public static void main(String[] args) {
/*	try {
	FileInputStream f = new FileInputStream("D:\\anudip\\test3.txt");
 int i = 0;
 while((i= f.read())!= -1){
	 System.out.println((char)i); // convert it into character
 }
 f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	} */
	
	try {
		FileInputStream f = new FileInputStream("D:\\anudip\\test3.txt");
	 int i = f.read();
	{
		 System.out.println((char)i); // convert it into character
	}
 f.close();
		}
		catch(Exception e) {
			System.out.println(e);
	} 
}
}
