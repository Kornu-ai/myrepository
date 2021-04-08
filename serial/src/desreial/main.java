package desreial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Object user=null;
		FileInputStream file =new FileInputStream("C:\\Users\\babji\\git\\myrepository\\serial\\src\\serialsreial\\testout.ser");
        ObjectInputStream obj =new  ObjectInputStream(file);
        user =obj.readObject();
        
		
	}

}
