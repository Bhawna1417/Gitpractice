package Test;

public class class1

{

	public static void main(String arg [])
	{
		
		String s="this as a dog";
		char[] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		int n=12345;
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		System.out.println(sb.reverse());
		int a[]= {1,2,3,5};
				
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
			
		}
	 System.out.println("missing " +(sum1-sum));
		
		
		
		}
	}
 
  
 

