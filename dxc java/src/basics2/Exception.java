package basics2;

public class Exception
{

	public static void main(String[] args) 
	{
		try {
		int a =10;
		int b=0;
		int c=a/b;
		}
		catch(ArithmeticException e) {System.err.println("divide by zero");}
	 finally
	 {
		 System.out.println(" i am finally");
	 }
		
		
		
	}

}
