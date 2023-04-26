package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Collections.ListConcept.employees;

public class test {

	
		
	// Function to find a pair in an array with a given sum using hashing
		public static void findPair(int[] A, int sum)
		{
			// create an empty HashMap
			Map<Integer, Integer> map = new HashMap<>();

			// do for each element
			for (int i = 0; i < A.length; i++)
			{
				// check if pair `(A[i], sum-A[i])` exists

				// if the difference is seen before, print the pair
				if (map.containsKey(sum - A[i]))
				{
					System.out.printf("Pair found (%d, %d)", A[map.get(sum - A[i])], A[i]);
					return;
				}

				// store index of the current element in the map
				map.put(A[i], i);
			}

			// we reach here if the pair is not found
			System.out.println("Pair not found");
		}

		public static void main (String[] args)
		{
			int[] A = { 8, 7,0,10, 2, 5, 3, 1 ,2,5,6};
			int sum = 10;

			findPair(A, sum);
		}
	}