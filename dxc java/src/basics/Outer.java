package basics;

public class Outer
{
	public void show() 
	{
		System.out.println("i am show in outer"); 
	}
/*static*/public class Inner   // if i amke a class as static as an member o class so it not needed to call this class see in InnerClassDemo
	      {
		      void dispaly()
		      {
			System.out.println("i am in display of inner");
		      }
       	}


}
