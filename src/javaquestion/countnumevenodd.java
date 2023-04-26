package javaquestion;

public class countnumevenodd {
 
	public static void countevenodd(int num)
	{
		//num=1234;
		int rem=0;
		int even=0;
		int odd=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem%2==0)
			{
			    even++;
				
			}
			else
			{
				odd++;
				
			}
			num=num/10;
		}
		System.out.println("even no in digit" +even);
		System.out.println("Odd no in digit" +odd);
	}
	
	public static void main(String[] args) 
	{
		int num1 = 12345;
		countevenodd(num1);
		// TODO Auto-generated method stub

	}

}
