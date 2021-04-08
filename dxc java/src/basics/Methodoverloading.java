package basics;

public class Methodoverloading {

	public static void main(String[] args) {
		Mul obj = new Mul();
		obj.product();
		obj.product(2,5);
		obj.product(2,3,4);
		obj.product(2.5,3.5);
		
		/* this is method overloading multiple methods have same name but differnt in parameters*/


	}

}
