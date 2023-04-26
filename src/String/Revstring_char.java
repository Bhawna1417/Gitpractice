package String;

//Write a function that reverses a string. The input string is given as an array of characters s.
//Example 1:

//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
public class Revstring_char {
	
	 public static void reverseString(char[] s)
	    {
	        int start=0;
	        int end=s.length-1;
	       while(start<end)
	       {
	           char temp=s[start];
	           s[start]=s[end];
	           s[end]=temp;
	           start++;
	           end--;
	       }
	       System.out.println(s);
	    }
	 
	 

	public static void main(String[] args) 
	{
		char [] s= {'h','e','l','l','o','a'};
		reverseString(s);
		

	}

}
