package lamda;

public class lamdaforloop {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("child class");
			}
         };
         Thread t=new Thread(r);
         t.start();
         for(int i=0;i<5;i++) {
				System.out.println("main class");
         }
	}
}