package greedyAlgorithms;

import java.util.Arrays;

/**
 * This class is for designing a solution for "Minimum Absolute Difference in an Array" 
 */
public class MinAbsDiff {
	
	static int minimumAbsoluteDifference(int[] arr) {
		
		int minAbsDiffValue = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1; i++) {
			
				//Calculate the min abs diff between the two consecutive items
				int diff = Math.abs(arr[i] - arr[i + 1]);
				
				if(diff < minAbsDiffValue)
					minAbsDiffValue = diff;
				
		}
		
		return minAbsDiffValue;
    
	}
	
}
