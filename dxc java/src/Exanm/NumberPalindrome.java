package Exanm;
import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,r,p=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		n1 = n;
		while(n1>0) {
			r = n1 % 10;
			p = p * 10 + r;
			n1 /= 10;
		}
		if(p == n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}