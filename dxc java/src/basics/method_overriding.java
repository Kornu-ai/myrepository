package basics;

public class method_overriding 
{

	public static void main(String[] args) 
	{
		//this is run time polymorphism
		AAA obj=new BBB();   //even if i changed to AAA output not changed because we changed just refernce but not object to that reference
		obj.show();
		
		obj=new CCC();
		obj.show();
	}

}
