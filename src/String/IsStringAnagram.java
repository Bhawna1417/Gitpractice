package String;

import java.util.Arrays;

public class IsStringAnagram {
	
	public static boolean anagram(String s1,String s2)
	{
		if (s1.length()==s2.length())
		{
			//return true;
			char c1[]=s1.toLowerCase().toCharArray();
			char c2[]=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
			}
		else 
		{
			return false;
			}
		
		
		
	}

	public static void main(String[] args) 
	{
		String s1="cat";
		String s2="tac";
		boolean b1=anagram(s1,s2);
		System.out.println(b1);
		System.out.println(anagram("Listen", "SILENT"));
		System.out.println(anagram("Elvis", "Lives"));
		System.out.println(anagram("Elvis", "Live s"));
		System.out.println(anagram("CAT", "Lives"));
		

	}

}
