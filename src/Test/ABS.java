package Test;

public class ABS
{ 
	 int bal=1000;
	
  public synchronized int withdraw(int amt)
  {
	  bal=bal-amt;
	  return bal;
	  
  }
 
  


}
//TC1= 