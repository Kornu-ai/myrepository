package basics;

public class Clac
{
   int addprint(int ...n)
   {
	int  sum=0 ;
	 for(int i : n)  
	 {
		sum+=i; 
	 }
	
	 return sum;  
   }
	
	
	
	
}
