package Arrays_op;

public class Compare2arraysequal {

	public static void main(String[] args) {
		
		
		{
			//Approach1
			int a[]= {3,6,8,1,7,10,13};
			int a1[]={3,6,8,1,7,10,13};
			boolean status=Arrays.equals(a, a1);
			if(status==true)
			{
			System.out.println(status+"equal+");
			}
			//for(int i=0;i<a.length;i++)
			else
			{
				System.out.println(status+"notequal+");	
			}
			
			//Approach 2
			
			boolean status1=true;
			if (a.length==a1.length)
			{
				for(int i=0;i<a.length;i++)
				{
					if(a[i]!=a1[i])
					{
						status1=false;
					}
					else
					{
						status1=true;
					}
					
					
				}
				
				
			}
			
			
			
		// TODO Auto-generated method stub

	}

}
		// TODO Auto-generated method stub

	}


