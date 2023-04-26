package javaquestion;

public class primenumber {
	
	public static boolean getprimenumber(int num)
	{
		//corner case 1 is not prime number and 2 is the smallest prime number
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
			
		{ 
			if(num % i==0)
		{
			return false;
		}
		}
		return true;
	}
	//find how many primeno in the given series for eg-till 18 how many prime no.
	public static void findprimenumer(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(getprimenumber(i))
			{
				System.out.print("  "  +i);
			}
		}
	}
		
	
	
	public static void main(String arg[])
	{
		System.out.println("primeno  "  +getprimenumber(10));
		findprimenumer(18);		
	}

}
