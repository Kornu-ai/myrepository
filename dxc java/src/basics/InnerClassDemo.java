package basics;

import basics.Outer.Inner;

public class InnerClassDemo {

	public static void main(String[] args) 
	{
		Outer obj=new Outer();
		obj.show();
		Inner obj1= obj.new Inner(); //obj is not required to when we make inner class as static
		obj1.dispaly();

	}

}
