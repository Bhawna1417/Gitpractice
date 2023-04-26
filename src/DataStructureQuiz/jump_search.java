package DataStructureQuiz;

//Java program to implement Jump Search.
public class jump_search
{
 public static int jumpSearch(int[] arr, int x)
 {
int i,j,k;
int len=arr.length;
i=0;
j=(int) Math.sqrt(len);
while(arr[j]<x && j<len)
{
	i=j;
	j=(int)(j+Math.sqrt(len));
	if (i>=len)
	{
		return -1;
	}
}
for (k=i;k<=j;k++)
{
	if(arr[k]==x)
	{
		return k;
	}
}
return -1;
 }

 // Driver program to test function
 public static void main(String [ ] args)
 {
     int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                 34, 55, 89, 144, 233, 377, 610};
     int x = 55;

     // Find the index of 'x' using Jump Search
     int index = jumpSearch(arr, x);

     // Print the index where 'x' is located
     System.out.println("\nNumber " + x +
                         " is at index " + index);
 }
}