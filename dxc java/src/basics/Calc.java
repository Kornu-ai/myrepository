package basics;

class Calc 
{
      int add(int a,int b) 
      {
    	  return a+b;
      }	
}

// now i want to create advanced calculator which have sub method then i use inheritence

class AdvCalc extends Calc

// if i dont wnat to use extends class  i agian place add method in adv calc also so inorder to avoid reduendency we use this. it is single level inheritence
{
	int sub(int a, int b)
	{
		return a-b;
	}
}

// i want to use very adv calculator to mul  then we use this below

class VeryAdvCalc  extends AdvCalc

 // this is multi level inheritence
{
	int mul(int a ,int b)
	{
	return a*b;	
	}	
}

