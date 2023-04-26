package Test;

public class Deletemeasap {

	public static void main(String[] args) {
		
		
	String str="Bhawna";
		
		for(int i=str.length()-1;i>=0;i--)
		{
		
			char ch=str.charAt(i);
			System.out.print(ch);
		}
		
		
		///////////Rev an int
		
		int a=1234;
		int r=0;
		while(a!=0)
		{
			r=r*10+a%10;
			a=a/10;
		}
		
		System.out.print(r);
		// TODO Auto-generated method stub

	}

}
