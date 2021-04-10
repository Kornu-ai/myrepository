package basics2;
class Counter
{
	int count;
    public  synchronized void increment() //with out this i acnt gety out put as 2000 because at same time 
                                           // t1 ,t2 is arrived so same value is assigned by the for both
                                            // then the value is incresed by one instead of two times
	{
		count++;
	}
}

public class Synchronization
{

	public static void main(String[] args) throws InterruptedException
	{
	
		Counter c= new Counter();
		
		Thread t1 =new Thread(new Runnable()
				{
			            public   void run()
		                	{
		  		                for(int i=0;i<1000;i++)
		  		                {
		  		                	c.increment();
		  		                }
			            	  
		                   	}
				});
		Thread t2 =new Thread(new Runnable()
		       {
	            public   void run()
                	{
  		                for(int i=0;i<1000;i++)
  		                {
  		                	c.increment();
  		                }
	            	  
                   	}
		       });
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
