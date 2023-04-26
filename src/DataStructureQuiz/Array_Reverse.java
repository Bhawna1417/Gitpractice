package DataStructureQuiz;

import java.util.Scanner;

public class Array_Reverse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java program to reverse an array

		/* Java program to insert an element in an array */

	
		
		int a[]= {3,2,4,5};
		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Enter no. of elements you want in array:"); n =
		 * s.nextInt(); int a[] = new int[n+1];
		 * System.out.println("Enter all the elements:" );
		 */

//		for(int i = 0; i < n; i++)
//		{
//		a[i] = s.nextInt();
//		}
		System.out.println("Reversed array is : ");
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.println(a[i] + " ");
		}

		
	

	}

}
