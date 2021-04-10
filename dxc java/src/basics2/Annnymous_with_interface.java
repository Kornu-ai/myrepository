package basics2;


interface Babji
{
	void show();
}
/*class Rohit implements Babji
{
	public void show()
	{
		System.out.println(" i am rohit"); //  instead of doing this i install an anonymous class at
		                                            main then memory is saved because i never use it again
	}
			
}*/

public class Annnymous_with_interface {

	public static void main(String[] args) {
		Babji obj =new Babji() 
		                        {
			                        public void show()
		                            	{
		                     		System.out.println(" i am rohit");
		                               	} 
		                         };
		obj.show();
	}

}
