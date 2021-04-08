import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		
		//gives me the square of the number
		Function <Integer,Integer> f=n->n*n;  
		System.out.println(f.apply(4));
		
		
       //gives me the sum of the number
		issum g=(a,b)->a+b;
		System.out.println(g.add(10,20));
		
		
		//to print a text
		ispr fi=()->System.out.println("hello");
		fi.prinnt();
	}

}
