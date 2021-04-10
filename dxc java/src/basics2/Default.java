package basics2;
@FunctionalInterface
interface Demo
 {
	void abc();
	 default  void bcd()
	{
		System.out.println(" iam in interface Demo");
	}
 }
interface Mydemo
{
	default void bcd()
	{
		System.out.println(" iam in interface MyDemo");
	}
}
class DemoImp implements Demo,Mydemo  //Demo,Mydemo when i use this my bcd() will go where is main problem to solve this use bcd() inside Demoimp 
                                               // or use like below
{
	public  void abc()
	 {
		 System.out.println("i am in abc in demoImp");
	 }

	@Override
	public void bcd() {
		
		Mydemo.super.bcd();              // by changing this to Demo i go to demo interface Mydemo.super for Mydemo interface
	}
}

public class Default 
{
	public static void main(String[] args) 
	{
		Demo obj = new DemoImp();
		obj.abc();
		obj.bcd();
	}

}
