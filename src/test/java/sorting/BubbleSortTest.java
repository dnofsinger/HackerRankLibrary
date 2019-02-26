package sorting;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BubbleSortTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void bubbleSortInput0_Test() {
		
		//Array is sorted in 0 swaps.
		//First Element: 1
		//Last Element: 3
		
		int[] arr = {1, 2, 3};
		
		String expectedResults = "Array is sorted in 0 swaps.\r\n" + 
				"First Element: 1\r\n" + 
				"Last Element: 3";
		
		BubbleSort.countSwaps(arr);
		
		assertEquals(expectedResults, outContent.toString());
		
	}
	
	@Test
	public void bubbleSortInput1_Test() {
		
		//Array is sorted in 0 swaps.
		//First Element: 1
		//Last Element: 3
		
		int[] arr = {3, 2, 1};
		
		String expectedResults = "Array is sorted in 3 swaps.\r\n" + 
				"First Element: 1\r\n" + 
				"Last Element: 3";
		
		BubbleSort.countSwaps(arr);
		
		assertEquals(expectedResults, outContent.toString());
		
	}

}
