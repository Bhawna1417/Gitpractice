package leetcode;

public class excelsheetColumnnumber {

	public static void main(String[] args) 
	
	{
	  int n1=  titletonumber("ZA");
		System.out.println(n1);
		
	}
	
	public static int titletonumber(String s)
	{
		int ans=0;
		int p=0;
		for(int i=s.length()-1;i>-0;i--)
		{
			char c=s.charAt(i);
			int val=(int)c-65+1;
			ans += val*Math.pow(26,p);
			p++;
			
		}
	return ans;
	}
	
}
