package generics;

import java.util.ArrayList;
import java.util.*;

public class Grneric_basics {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("babji");
		arr.add("bbajikornu");
		String s=arr.get(1);
		System.out.println("my name in first index is "+s);
		//i want to iterate
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
