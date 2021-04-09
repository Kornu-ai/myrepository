package basics;

  class Aaaa   // when i make this final it cant be extended
{
	 public void show() // when i make this final cant be over ridden
	{
		System.out.println(" in a show");
	}	
}
class Baa extends Aaaa
{
	@Override
  public void show()
  {
		System.out.println(" in b show");

   }
}
public class Final_method
{

	public  static void main(String[] args)
	{
		Aaaa obj =new Baa();
		obj.show();		
	}
}
