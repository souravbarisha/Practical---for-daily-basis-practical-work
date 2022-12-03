package file_I_O;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{
	transient
	 int id;
	String name;
	int fee;
	
	Student(int id, String name, int fee){
		this.id =id;
		this.name = name;
		this.fee = fee;
	}
}

public class ObjectInputEx_1 {
public static void main(String[] args) {
	try {
		FileInputStream os = new FileInputStream("D:\\anudip\\test1.txt");
	ObjectInputStream op = new ObjectInputStream(os);
	Student s = (Student)op.readObject();
	System.out.println("ID: "+s.id + " NAME: "+s.name+" FEE: "+s.fee);
	
	op.close();
	System.out.println("done");
	    
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	
}
}
