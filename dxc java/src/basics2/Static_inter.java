package basics2;

interface Test
{
	int a=10;                 // the variable inside an interface is constant
	static void show()
	{
		System.out.println("hai");
	}
}

public class Static_inter
{

	public static void main(String[] args)
	{
		
       Test.show();       // method is directly called with out craeting object
	}

}
