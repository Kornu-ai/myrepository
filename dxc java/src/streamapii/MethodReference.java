package streamapii;

import java.util.Arrays;
import java.util.List;

public class MethodReference
{

	public static void main(String[] args) 
	{
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		values.forEach(MethodReference::doubleit);	
	}
public static void doubleit(int i)
{
	
	
	System.out.println(i*i);
}
}
