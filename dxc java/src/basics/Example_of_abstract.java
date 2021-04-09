package basics;

public class Example_of_abstract {

	public static void main(String[] args) {
		printer obj = new printer();
		obj.show(  4.4 );
		                        // now at 4.4 what number we place may int float it works that is the main advantage of abstract
	}
}
class printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
	
	
}
