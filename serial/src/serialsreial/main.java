package serialsreial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) throws  IOException {
		User username=new User();
		username.name="babji";
		username.password="kavya";
		FileOutputStream file =new FileOutputStream("C:\\Users\\babji\\git\\myrepository\\serial\\src\\serialsreial\\testout.ser");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(username);
		obj.close();		

	}

}
