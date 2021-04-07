package serilization;
import java.io.*;  
class Persist{  
 public static void main(String args[]){  
  try{  
  //Creating the object  
  Student s1 =new Student(211,"ravi");  
  //Creating stream and writing the object  
  FileOutputStream fout=new FileOutputStream("testout.txt");  
  try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
	out.writeObject(s1);
}  
  System.out.println("success");  
  }catch(Exception e){System.out.println(e);}  
 }  
}  