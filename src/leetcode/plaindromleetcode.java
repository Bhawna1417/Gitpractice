package leetcode;

public class plaindromleetcode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		isPalindrome(121);
		
		
	}
		    public static boolean isPalindrome(int x) {
		        
		        if(x<0)
		        {
		            return false;
		        }
		        
		        
		        int r=0;
		 
		        int original=x;
		        while(x!=0)
		        {
		           // s=x%10;
		            r=r*10+x%10;
		            x=x/10;
		        }
		        if(r==original)
		      return true;
		        else
		        	return false;
		        
		       
		        
		    }
		

	}


