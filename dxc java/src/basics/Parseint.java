package basics;

public class Parseint {

	public static void main(String[] args) {
		String s="1234";
	//	int a=s; not working because int canot take string to solve this we use parseint
		int a =Integer.parseInt(s);
		
		System.out.println(a);
	}

}
