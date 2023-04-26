package String;

public class Reversevowelorders_String {

	public static String revVowel(String str)
	{
		int start=0;
		int end=str.length()-1;
		char ch[]=str.toCharArray();
		
	while(start>end)
		{
		
			if (!checkvowel(ch[start]))
			{
				start++;
				continue;
			}
				
			if (!checkvowel(ch[end]))
			{
				end--;
				continue;
			}
			
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
		start++;
		end--;
		}
		return String.valueOf(ch);
	}
	
	public static boolean checkvowel(char ch)
	{
		
		
		if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(revVowel("equation"));
	}

}
