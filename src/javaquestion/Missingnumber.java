package javaquestion;

public class Missingnumber {

	public static void main(String[] args) 
	
	{
		int num[]={1,2,3,4,5,6,8};
		int no=num.length+1;
		int n1=findmissingnumber(num,no);
		System.out.println(n1);
		
	}
	
	
	
	
	public static int findmissingnumber(int num[], int totalno)
	{
		//totalno=num.length+1;
		int expno= totalno * (totalno+1)/2;

      int actualno=0;
      for (int i=0;i<totalno-1;i++)
      {
    	actualno =actualno+num[i];
	}
	return expno -actualno;
	
	
}
	

}
