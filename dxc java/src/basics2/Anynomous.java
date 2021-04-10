package basics2;
class AnyA
{
	public void show()
	{
		System.out.println("i am show a");
	}
}
/*class AnyB extends AnyA
{
	public void show()
	{
		System.out.println("i am show b");

	}                    //instead of doing this i create a anynomous class  in main as below ... the main need is there is no use of this show
}*/                      //    in this  b just print only insted i create at main
public class Anynomous {

	public static void main(String[] args) {
		AnyA obj =new AnyA() {
			                  public void show()         // this is my AnyB class ok right think....
			                    {
				                  System.out.println("i am show b");
			                     }
		                     };
		obj.show();
	}
}
