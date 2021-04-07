package serilization;
import java.io.*;  
class Depersist{  
 public static void main(String args[]) {  
  try{  
  try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("testout.txt"))) {
	Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name);
}  
  }catch(Exception e){System.out.println(e);}  
 }  
}  