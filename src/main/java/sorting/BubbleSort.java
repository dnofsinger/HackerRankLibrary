package sorting;

public class BubbleSort {
	
	static void countSwaps(int[] a) {
		
		int numSwaps = 0;

		int lastPosition = a.length - 1;
		int swapPosition;
		
		while(lastPosition > 0) {
			swapPosition = 0;
			
			for(int i = 0; i < lastPosition; i++) {
				
				//Check to see if current value is bigger than the next value
				if(a[i] > a[i + 1]) {
					//It is bigger, so let's swap the values.
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					
					numSwaps++;
					//Mark the swap Position
					swapPosition = i;
				}
				
			}
			
			lastPosition = swapPosition;
		}
		
		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.print("Last Element: " + a[a.length - 1]);
		

    }
	
}
