package sorting;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

	QuickSort testQuickSort;
	int[] testValues;
	
	@Before
	public void setUp() throws Exception {
		testValues = new int[100];
		testQuickSort = new QuickSort();
		Random random = new Random();
		
		for (int i = 0; i < testValues.length; i++) {
			testValues[i] = random.nextInt(100);
			System.out.println(testValues[i]);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		System.out.println("Sorting...");
		
		testQuickSort.quickSort(testValues, 0, 99);
		
		int max = -1;
		
		for(int i = 0; i < testValues.length; i++) {
			
			System.out.println(testValues[i]);
			if(testValues[i] >= max) {
				max = testValues[i];
			}else {
				fail("Array hasn't been sorted.");
			}
			
		}
		
	}

}
