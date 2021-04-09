package basics;

public class Aa 
{
     
	public Aa()
	{	
	System.out.println("in Aa non parametarized");
	}
	
	public Aa(int i)
	{
		System.out.println("in Aa parametarized constructor");

	}
	
	
}
class B extends Aa
{
	public B()
	{	
		//super(5);// by this we get a as peramitarized and b as non parametarized
	System.out.println("in B non parametarized");
	}
	
	public B(int i)
	{
		//super(i);
		System.out.println("in B parametarized constructor");

	}
	
}
