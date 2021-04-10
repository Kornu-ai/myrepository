package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_of_integers {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(7);
		values.add(10);
		values.add(39);
		values.add(20);

		Collections.sort(values);  //  Collections is a class see that Capital 'c'  sort is a method
		Collections.reverse(values);// many more methods try all 
		
 for(Integer in: values)
 {
	 System.out.println(in);
 }

	}

}


// hint :::::::   collections are mutable that means the originality of order changes by operation