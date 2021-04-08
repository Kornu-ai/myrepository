package basics;

public class Emp {
	int id;
	int salery;
	static String ceo;
	static {
		ceo="dxcc";    //if i have not mention ceo at any object it will taken other wise it will not executed
	}
	public Emp() {        //if any object have not data then this  constructor data will taken
		id=10;                  
		salery=101010101;
	}
	public void show() {
		System.out.println(id + "  :  " +salery +"  :  "+ ceo);
	}

}
