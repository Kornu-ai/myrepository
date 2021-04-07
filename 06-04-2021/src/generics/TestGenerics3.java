package generics;
class TestGenerics3{  
public static void main(String args[]){ 
	//by using this we can create our own generic type
MyGen<Integer> m=new MyGen<Integer>();  
m.add(2);  
//m.add("babji") gives Compile time error  
System.out.println(m.get());  
}}  