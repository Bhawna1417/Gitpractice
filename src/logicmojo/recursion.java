package logicmojo;

public class recursion {
	
	public static void rec(int i)
	{
		if (i==5)
		{
			return;
		}
		 rec(i+1);
		System.out.println(i);
		
	}
	
	public static int fact(int n)
	{
		if (n<=1)
		
			return 1;
			
		
		else 
			return n*fact(n-1);
		
	}

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		//recursion.rec(1);
		recursion.fact(5);


	}
	

}
