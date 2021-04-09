package basics;

public class AAA 
{
   void show() 
   {
	   System.out.println("in super class");
   }
}

class BBB extends AAA
{
	@Override
	void show()
	{
		System.out.println("in child class");
	}
	
}
class CCC extends AAA
{
	@Override
	void show()
	{
		System.out.println("in c");
	}
}
