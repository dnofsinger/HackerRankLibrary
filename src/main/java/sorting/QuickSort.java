package sorting;

public class QuickSort {

	void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		if(left < index - 1) { //Sort left half
			quickSort(arr, left, index - 1);
		}
		if(index < right) { //Sort the right half
			quickSort(arr, index, right);
		}
	}
	
	int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];
		
		while(left <= right) {
			//Find an element that should be on the right
			while(arr[left] < pivot) left++;
			
			//Find an element that should be on the left
			while(arr[right] > pivot) right--;
			
			//Swap elements, and move left and right indices
			if(left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		
		return left;
	}
	
	void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
