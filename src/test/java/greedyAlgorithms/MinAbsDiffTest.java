package greedyAlgorithms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinAbsDiffTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void minAbsDiff_Test() {
		int[] input0 = {3, -7, 0};
		
		int[] input1 = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		
		int[] input2 = {1, -3, 71, 68, 17};
		
		Assert.assertEquals(3, MinAbsDiff.minimumAbsoluteDifference(input0));
	
		Assert.assertEquals(1, MinAbsDiff.minimumAbsoluteDifference(input1));
		
		Assert.assertEquals(3, MinAbsDiff.minimumAbsoluteDifference(input2));
	}

}
