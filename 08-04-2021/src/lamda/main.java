package lamda;

public class main {

	public static void main(String[] args) {
		newclass mi=new newclass();
		Thread t= new Thread(mi);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("hello");
		}

	}

}
