package javaquestion;

public class Numberpalindrom {
	
	public static void ispalindrom(int num)
	{
		int r=0;
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			r=num%10;//to get remainder
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Palindrom");
			
			}
		else
		{
			System.out.println("No Palindrom");
		}
	}

	public static void main(String[] args)
	{
		//ispalindrom ispal=new ispalindrom(151);
		// TODO Auto-generated method stub
		ispalindrom(151);
		ispalindrom(152);

	}

}
