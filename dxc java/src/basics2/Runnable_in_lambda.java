

//  now our aim is to reduce no of lines of code 



package basics2;
public class Runnable_in_lambda
{

	public static void main(String[] args) throws InterruptedException
	{

		
		Thread t1 =new Thread(()->                       
		 {
			 for(int i=0;i<5;i++)
			 {
				 System.out.println("hi  "+ Thread.currentThread().getPriority()); //we want to know current priority
				 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		});
		Thread t2 =new Thread(()->
		 {
			 for(int i=0;i<5;i++)
			 {
				 System.out.println("hello");
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			 }
		 });
		t1.setPriority(Thread.MAX_PRIORITY); //priority varies from 1-10
		System.out.println(t1.getPriority());
		t1.setName("babji Thread");
        t2.setName("rahul Thread ");
       System.out.println(t1.getName());
        System.out.println(t2.getName());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("bye");

	}

}