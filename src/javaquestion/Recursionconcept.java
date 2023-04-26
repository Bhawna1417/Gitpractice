package javaquestion;

public class Recursionconcept {

	static int n1=0,n2=1,n3=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =3;
		System.out.println("Factorial of No. using recursion " +recurcive(8));
		System.out.println("fibbonacci "+ fibonnaci(num));
	}
		
		 private static String fibonnaci(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		static int recurcive(int n)
		{
			 
		System.out.println("recurtion")	; 
		//recurcive(); //Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.
	
		if (n==1)
		
		return 1;
		
		
		else
		
			return (n*recurcive(n-1));
		
		}
		
//////////Fibonacci 
		
		static void fibbonacci(int num)
		{
			while(num>0)
			{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fibbonacci(num-1);
		
		}
			
		
		
	}
}


