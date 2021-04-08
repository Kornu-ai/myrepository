package basics;

public class StaticDemo {

	public static void main(String[] args) {
		Emp naveen=new Emp();
		Emp babji=new Emp();
		Emp kavay=new Emp();

		naveen.id=10;
		naveen.salery=10000;
		naveen.ceo="larry";

		babji.id=11;
	    babji.salery=5000;
		babji.ceo="larry";
		//babji.ceo="dxcc";    by make this line active the ceo of both objects gets changed because i make ceo as static
		
		
		naveen.show();
		babji.show();
		kavay.show();

		
	}

}
