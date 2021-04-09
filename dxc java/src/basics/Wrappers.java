package basics;

public class Wrappers {

	public static void main(String[] args) {
		int a=10;                     //primitive datatype
		Integer aa=new Integer(a);  // boxing   assigning aa=10 in object formate
		int j = aa.intValue();     //unboxing   assigning j =aa because aa in object we do aa.intvalue() here it is default method
		Integer value= a;         //autoboxing
		int k= value ;           //autounboxing
		
		System.out.println(a+"\n"+aa+"\n"+j+"\n"+value+"\n"+k+"\n");

	}

}
