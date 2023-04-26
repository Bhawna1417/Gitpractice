package String;

public class CountWordinaString {

	public static void countword(String str)
	{
		int count=1;
	
		for(int i=0;i<str.length();i++)
		{
	if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
	{
				count++;
	}
	}
		System.out.println("Total words in a string is " +count);
	}
	public static void main(String[] args) {
		
		
		String s="Bhawna Gupta is";
		int len=s.length();
		System.out.println(" sdsd" +len);
		String s1=" a";
		
		countword(s);
		countword(s1);
	}
		// TODO Auto-generated method stub

	

}
