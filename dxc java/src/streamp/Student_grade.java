package streamp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String name;
    int marks;
    Student(String name ,int marks)
    {
    	this.name=name;
    	this.marks=marks;
    }
}
public class Student_grade {

	public static void main(String[] args) {
		Function<Student,String> f= s->{
			int marks = s.marks;
			String grade="";
			if(marks>=80) grade ="A";
			 else if(marks>=50) grade ="B";
			 else if(marks>=60) grade ="C";
			 else if(marks>=35) grade ="D";
			else grade ="Fail";
            return grade;
		};
		Predicate<Student> p=s-> s.marks>=35;
		Consumer<Student> c=s1->
		{
			System.out.println("student name  " +s1.name);
			System.out.println("student marks  " +s1.marks);
			System.out.println("student grade  " +f.apply(s1));
			System.out.println();	
		};
		
		Student[] s= {new Student ("durga",100),
				new Student ("Babji",75),
				new Student ("Niti",65),
				new Student ("Yami",36),
				new Student ("Larry",25),
				
		};
		for(Student s1 :s)
		{
			if(p.test(s1))
			{
			c.accept(s1);
			}
		}
		
		
		

	}

}
