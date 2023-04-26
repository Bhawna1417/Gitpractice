package Stack;

import java.util.Stack;

public class ReverseUsing_stack 
{

	public  String reversestr(String s)
	{
		Stack<Character> st=new Stack<Character>();
		String revstr="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			st.push(ch);
			
		}
		
		while(!st.isEmpty())
		{
			revstr=revstr+st.pop();
		}
		
		return revstr;
		
	}
	public static void main(String[] args) 
	{
		ReverseUsing_stack s=new ReverseUsing_stack();
      String str="Bhawna";
      System.out.println(s.reversestr(str));
		


	}

}
