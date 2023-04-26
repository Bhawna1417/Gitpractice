package String;

public class ReverseEachWordOfString {
	
	static void reverse(String str)
	{
		String final_st="";
		String temp_str="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch ==' ')
			{
				final_st=final_st+ temp_str+" ";
				temp_str="";
				
			}
			else
			{
				temp_str=ch+temp_str;
			}
		}
		final_st=final_st+temp_str;
		System.out.println(final_st);
	}
	///Using string builder method 2
	
	public static void revstrbuild(String str)
	{
		
		StringBuilder finalstr=new StringBuilder();
		StringBuilder tempstr=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch==' ')
			{
				finalstr=finalstr.append(tempstr).append(" ");
				tempstr.setLength(0);
				
			}
			else
			{
				tempstr=tempstr.insert(0, ch);
			}
			
		}
		finalstr=finalstr.append(tempstr);
		System.out.println(finalstr);
	}

	public static void main(String[] args) {
		
		reverse("bhawna gupta");
		revstrbuild("Hi this is reverse the each word of string");
		
		// TODO Auto-generated method stub

	}

}
