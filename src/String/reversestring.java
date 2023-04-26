package String;

import java.util.Stack;

public class reversestring {


	//Reverse a String
	//Difference between String and StringBuffer (String is immutabale whereas stringbuffer is mutable)
	//Do we have reverse function in String?=no
	
	public static void main(String arg[])
	{
		
		//1. using for loop and charAt() method
		
		String s="BHAWNA";
		String s1="BHAWNA";
		int len=s.length();
		String rev="";
		System.out.println(s1.toLowerCase()); //Convert in lower case
		
		long count=s.chars().filter(e->(char)e=='A').count();
		System.out.println(count);  ///Char occurance in the String
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//2. using StringBuffer class and reverse function
		StringBuffer strbf=new StringBuffer(s);
		
		System.out.println("Reverse strng using string buffer " +strbf.reverse());
		
		
		//3 Using stack reverse an string
		
		String stackstr="Harshul Singh";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<stackstr.length();i++)
		{
			char ch=st.push(stackstr.charAt(i));
			
		}
		while(!st.empty())
		{
			System.out.print(st.pop());
		}
		
		
		///using char array
		String rev1="";
		char ch[]=s.toCharArray();
		int len1=ch.length;
		for(int j=len1-1;j>=0;j--)
		{
			rev1=rev1+ch[j];
		}
		System.out.println("Using char array" +rev1);
		
		
	}
}
