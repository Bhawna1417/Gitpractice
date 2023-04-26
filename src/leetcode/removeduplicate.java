package leetcode;

public class removeduplicate {

	public static int main(String[] args) {
		
		
		int array[]= {1,2,2,3,3,4,88,88,90};
		int n;
		int j=0;
		for (int i=0;i<=array.length-1;i++)
		{
			if (array[i]!=array[i+1])
			{
				array[j++]=array[i];
			}
			//return j;
		}
		return j;
		
		

	}

}
