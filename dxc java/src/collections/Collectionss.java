package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectionss {

	public static void main(String[] args) {
		Collection values =new ArrayList();
		values.add(9);
		values.add(1);
		values.add(67);
		
		
	Iterator it =values.iterator();	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}

}
