package sorting;

import java.lang.reflect.Array;

public class MergeSort {

	void mergesort(int[] arr) {
		int[] helper = new int [arr.length];
		mergesort(arr, helper, 0, arr.length - 1);
	}
	
	void mergesort(int[] arr, int[] helper, int low, int high) {
		
		if(low < high) {
			int middle = (low + high) / 2;
			mergesort(arr, helper, low, middle);
			mergesort(arr, helper, middle + 1, high);
			merge(arr, helper, low, middle, high);
		}
		
	}
	
	void merge(int[] arr, int[] helper, int low, int middle, int high) {
		// Copy both halves into the helper array
		for(int i = low; i <= high; i++) {
			helper[i] = arr[i];
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		//Loop through the helper array. Compare both halves, copying back the smaller
		//element from the the halves into the original array.
		while(helperLeft <= middle && helperRight <= high) {
			if(helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft++;
			}else {
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		//Copy the rest of the left side of the array into the target array
		int remaining = middle - helperLeft;
		for(int i = 0; i <= remaining; i++) {
			arr[current + i] = helper[helperLeft + i];
		}
	}
	
}
