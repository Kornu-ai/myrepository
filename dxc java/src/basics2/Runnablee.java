package basics2;
class Hii implements Runnable
{
 public void run()                      //runnable interface inside have only one method which is run
 {
	 for(int i=0;i<10;i++)
	 {
		 System.out.println("hi");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
 }
}
class Hell implements Runnable
{
	public void run()
	 {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("hello");
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		 }
	 }

}
public class Runnablee
{

	public static void main(String[] args)
	{
		Runnable obj1  =new Hii();
		Runnable obj2 = new Hell();
		
		Thread t1 =new Thread(obj1);
		Thread t2 =new Thread(obj2);

		t1.start();
		t2.start();

	}

}
