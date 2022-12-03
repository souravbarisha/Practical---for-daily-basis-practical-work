package file_I_O;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// writing state of an object into byte stream -SERIALIZATION
class Students implements Serializable{
	int id;
	String name;
	int fee;
	
	Students(int id, String name, int fee){
		this.id =id;
		this.name = name;
		this.fee = fee;
	}
}

public class ObjectOutPutEx_1 {
public static void main(String[] args) {	
	try {
		Students s = new Students(101,"sourav",3000);
		
		FileOutputStream os = new FileOutputStream("D:\\anudip\\test1.txt");
	    ObjectOutputStream op = new ObjectOutputStream(os);
	op.writeObject(s);
	op.close();
	System.out.println("done");
	    
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
