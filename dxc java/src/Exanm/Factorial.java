package Exanm;
public class Factorial {
	public static void main(String[] args) {
		//input =5; output =120
		int input =5,result =1;
		for(int i=input;i>=1;i--) {
			result = result * i;
		}
		System.out.println("Factorial of " + input+ " is: "+ result);
	}
}