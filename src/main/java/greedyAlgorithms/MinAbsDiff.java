package greedyAlgorithms;

/**
 * This class is for designing a solution for "Minimum Absolute Difference in an Array" 
 */
public class MinAbsDiff {
	
	static int minimumAbsoluteDifference(int[] arr) {
		
		int minAbsDiffValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				//Don't compare the same values
				if(i == j)
					continue;
				//Calculate the min abs diff between i and j
				int diff = Math.abs(arr[i] - arr[j]);
				
				if(diff < minAbsDiffValue)
					minAbsDiffValue = diff;
				
			}
		}
		
		return minAbsDiffValue;
    
	}
	
}
