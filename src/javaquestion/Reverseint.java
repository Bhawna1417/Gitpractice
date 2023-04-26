package javaquestion;

public class Reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123;
		int t=0;
		int r = 0;
		
		while(num!=0)
		{
			 r= r * 10+num%10;
			num=num/10;
		}
		
			System.out.println("reverse" +r);

		//using string buffer
			int num1=12345;
			System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
			
			
			
		
	}

}
