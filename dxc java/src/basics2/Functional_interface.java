package basics2;
interface Abc
{
	void show();
}

public class Functional_interface
{

	public static void main(String[] args)
	{
               	/*	Abc obj =new Abc()
		                              {
			                            public void show()
			                                   {
				                        System.out.println(" iam in anynomous");
		                                    	}
			                            };*/  
		// instead of doing all these i craete one functional intterface (keep in mind functional interface is used when it has only one method)
		//                 other wise we use normal interface ok..
		
		Abc obj =()->System.out.println("i am in anynomous");  // all these we do to reduce lines of code
		obj.show();	
	}
}
