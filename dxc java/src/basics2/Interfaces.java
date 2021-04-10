package basics2;

public class Interfaces {

	public static void main(String[] args) {
		Apple obj= new Orange();
		obj.show();                // we never create the object of interface but we need to creeate the refernce of interface there by implements object

	}

}
interface Apple{
	void show();	 
}
class Orange implements Apple
{
	public void show()
	{
		System.out.println("10 apples");
	}
}
