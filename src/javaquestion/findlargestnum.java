package javaquestion;

public class findlargestnum {
	
	public static void largest(int num1,int num2,int num3)
	{
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater" +num1);
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("num2 is greater" +num2);
		}
		else
		{
			System.out.println("num3 is greater" +num3);
		}
		
	}
	
	public static void main(String[] args) 
	{
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		largest(num1,num2,num3);
		// TODO Auto-generated method stub

	}

}
