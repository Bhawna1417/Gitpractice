package Test;

public class Datahiding {
	
	public void abc(int a, int b)
	{
		System.out.println("int a");
		
	}
	
	public int abc(int a, String b)
	{
		//System.out.println("int b");
		return a;
	}
	
	public static void main(String [] args)
	{
		Datahiding hd= Datahiding();
		hd.abc(5,10);
		System.out.println("main");
		
	}
	
	

}
