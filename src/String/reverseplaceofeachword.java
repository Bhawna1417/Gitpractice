package String;

public class reverseplaceofeachword {
	
	public static void reversplace(String str)
	{
		String finalstr=" ";
		String tempStr=" ";
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch!=' ')
			{
				tempStr=tempStr+ch;
			}
			else
			{
				finalstr=tempStr+finalstr+" ";
				tempStr=" ";
				
			}
		}
		finalstr=tempStr+finalstr;
		System.out.println(finalstr);
		
	}
//Using string builder method 2
	public static void reversmeth2(String str)
	{
		
		StringBuilder finalstr=new StringBuilder();
		StringBuilder tempStr=new StringBuilder();
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch!=' ')
			{
				tempStr=tempStr.insert(0,ch);
			}
			else
			{
				finalstr=tempStr.append(finalstr).append(" ");
				tempStr.setLength(0);
				
			}
		}
		finalstr=tempStr.append(finalstr);
		System.out.println(finalstr);
		
	}
	
	public static void main(String[] args) 
	{
		reversplace("Revrse the place of word");
		reversmeth2("Reverse using string builder");


	}

}
