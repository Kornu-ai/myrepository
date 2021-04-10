package basics2;
class Hi extends Thread
{
 public void run()
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
class Hello extends Thread
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
public class Multi_threading
{

	public static void main(String[] args)
	{
		Hi t1  =new Hi();
		Hello t2 = new Hello();
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
