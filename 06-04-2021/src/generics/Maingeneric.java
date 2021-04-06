package generics;

public class Maingeneric {
	public static  <array> void Pleaseprint(array[] inputarray) {
		for(array Element: inputarray ) {
			System.out.println(Element);
		}
	}

	public static void main(String[] args) {
		Integer[] intarray = {1,2,3,4,5,6};
		Double[] doublearray= {1.2,2.3,3.4,4.5,5.6,6.7};
		Character[] chararray= {'a','b','c','d','e','f'};
		System.out.println("my int array is");
        Pleaseprint(intarray);
        System.out.println("my double array is");
        Pleaseprint(doublearray);
       
	}

}
