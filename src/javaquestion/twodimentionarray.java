package javaquestion;

public class twodimentionarray {
	
	
	
	public static void main(String arg[])
	{
		
		String str[][]=new String [3][5];
		System.out.println("No of rows" +str.length);
		System.out.println("No of column " +str[0].length);
	//First row 
		str[0][0]="A";
		str[0][1]="B";
		str[0][2]="C";
		str[0][3]="D";
		str[0][4]="E";

		//Second row
		str[1][0]="A1";
		str[1][1]="B1";
		str[1][2]="C1";
		str[1][3]="D1";
		str[1][4]="E1";
	//third row
		
		str[2][0]="A2";
		str[2][1]="B2";
		str[2][2]="C2";
		str[2][3]="D2";
		str[2][4]="E2";
		System.out.println("data " +str[1][3]);
		
		//print all the values of 2d array
		for (int raw=0;raw<str.length;raw++)
		{
			for(int col=0;col<str[0].length;col++)
			{
		
		System.out.println("all " +str[raw][col]);
			}
			
	}
	//	System.out.println(str[raw][col]);
	}
}
