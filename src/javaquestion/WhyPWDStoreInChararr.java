package javaquestion;

import java.util.Arrays;

public class WhyPWDStoreInChararr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pwd="Bhawna";
		System.out.println("Pwd is " +pwd);
		
		char a[]=new char[]{'b','h','a','w','n','a'};
		System.out.println("Pwd is " +a);
		
		Arrays.fill(a, '$');
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
