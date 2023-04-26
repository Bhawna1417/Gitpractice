package oopsconcepts_part1;

public class function_methodconcept {

	public static void main(String[] args) //void in main method never return a value thats why we marked void()
	{
		// TODO Auto-generated method stub
		function_methodconcept met=new function_methodconcept();
		met.nonreturn();
		met.noinput();
		met.give(30, 10);
	}
	
public void nonreturn()  //non return type method
{
	System.out.println("Nonreturntypemethod");
	
	
}
	public int noinput() //no input some output
	{
		int a=5;  ///local variable (scope is with the method only
		int b = 0;
		int c;
		c=a+b;
		System.out.println("noinput method " +c);
		return c;
		
		
	}
	
	public void give(int a,int b)  //some input some output
	
	{
		int c;
		c=a/b;
		System.out.println("noinput method " +c);
	}

}
