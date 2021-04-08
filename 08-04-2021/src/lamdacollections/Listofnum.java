package lamdacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listofnum {

	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(15);
		a1.add(16);
		a1.add(17);
		a1.add(8);
		a1.add(10);
		a1.add(1);
       System.out.println(a1);
      // Comparator<Integer> c = (o1,o2)->(o1 < o2)? -1 : (o1 > o2)? 1 : 0;       
       Collections.sort(a1);
       System.out.println(a1);


	}

}
