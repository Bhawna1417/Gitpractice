package Craking_coding_puzzles;

import java.util.Arrays;

public class sortanString {
	
   public  static char[] sort(String s)
    {
    	// s="bhawna";
		char c[]=s.toCharArray();
		//System.out.print(c);
		Arrays.sort(c);
		return c;
    }

	public static void main(String[] args) {
	 
	System.out.println(sortanString.sort("bhawna"));
		// TODO Auto-generated method stub

	}

}
