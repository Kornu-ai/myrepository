package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List values =new ArrayList();
		values.add(4);
		values.add(6);
		values.add(10);  // 10 is normal 10 its a object because refer wrapper unctionality
		                  //  integer ii =new integer(10);
		                 // inorder to convert that object to integer refer List_of_integer example
		
		
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		  
		
		////////////////   or   ////////////*/
		
		 for(Object o : values)
		 {
			 System.out.println(o);
		 }
		 
	}

}
