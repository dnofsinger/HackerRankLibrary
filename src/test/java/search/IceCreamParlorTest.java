package search;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sorting.BubbleSort;

public class IceCreamParlorTest {

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
	public void whatFlavorsSampleInputTest() {

		//	Sample Input
		//	2
		//	4
		//	5
		//	1 4 5 3 2

		//  Sample Output:		
		//  1 4
		
		int[] testCosts = {1, 4, 5, 3, 2};
		
		IceCreamParlor.whatFlavors(testCosts, 4);
		
		String expectedResults = "1 4\r\n";
		
		assertEquals(expectedResults, outContent.toString());
		
	}
	
	@Test
	public void whatFlavorsSampleInput2Test() {
		
		int[] testCosts = {2, 2, 4, 3};
		
		IceCreamParlor.whatFlavors(testCosts, 4);
		
		String expectedResults = "1 2\r\n";
		
		assertEquals(expectedResults, outContent.toString());
	
	}

}
