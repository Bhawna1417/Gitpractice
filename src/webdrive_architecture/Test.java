package webdrive_architecture;

import java.util.Scanner;

public class Test {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            int grade = in.nextInt();
	            // your code goes here
	            if(grade < 38){
	                System.out.println(grade);
	            }
	            else{
	                int q = grade/5;
	                int rem = grade%5;
	                if(rem >= 3){
	                    System.out.println((q+1)*5);
	                }
	                else{
	                    System.out.println(grade);
	                }
	            }
	        }
	    }
	}