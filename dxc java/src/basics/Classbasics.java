package basics;

public class Classbasics {

	public static void main(String[] args) {
		Sub/*this is class*/ obj =new Sub();// here new sub() is my object and obj is reference of my object
		obj.num1=30;//calling num1 by using obj refernce
		obj.num2=20;
		obj.operation();//calling method by using object reference
		System.out.println(obj.result);

	}

}