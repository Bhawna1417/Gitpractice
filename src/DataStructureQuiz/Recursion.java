package DataStructureQuiz;

public class Recursion {
	
	public static void PD(int n)
	{
		if(n==0)
			return;
		System.out.println(n-1);
		PD(n-1);
		System.out.println(n);
	}
	
	public static void TOI(int no,String source,String dest,String helper)
	{
		if(no==0)
			return;
		TOI(no-1,source,helper,dest);
		System.out.println(+no+ " moving " +source+ " to " +dest);
		TOI(no-1,helper,dest,source);
	}

	
//	public static void Coin_toss(int n,String h,String t)
//	{
//		if (n==0)
//return;
//		Coin_toss(n-1,h,t);
//		System.out.println(n,h+t);
//	}
	public static void main(String[] args) {
		
		PD(5);
		TOI(3,"s","d","h");
		// TODO Auto-generated method stub

	}

}
