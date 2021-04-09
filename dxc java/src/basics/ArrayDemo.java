package basics;

public class ArrayDemo
{

	public static void main(String[] args)
	{
    	Student s1=new Student();
		s1.id=10;
		s1.increase();
		System.out.println(s1.id);
		
		Student s2=new Student();
		s2.id=100;
		s2.increase();
		System.out.println(s2.id);
		
		Student s3=new Student();
		s3.id=1000;
		s3.increase();
		System.out.println(s3.id);
		
		Student s4=new Student();
		s4.id=10000;
		s4.increase();
		System.out.println(s4.id);  /*  
		
		
		insted of doing this  i want to create an array of objects as below
		
		Student s[]={s1,s2,s3,s4};
		
		*/
	}

}
