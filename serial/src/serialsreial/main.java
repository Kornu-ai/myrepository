package serialsreial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.imageio.IIOException;

public class main {

	public static void main(String[] args) throws  IOException {
		User username=new User();
		username.name="babji";
		username.password="kavya";
		FileOutputStream file =new FileOutputStream("C:\\Users\\babji\\eclipse-workspace\\serial\\src\\serialsreial\\userinfo.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(username);
		obj.close();		

	}

}
