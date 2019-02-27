package graphs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RoadsAndLibrariesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void roadsAndLibrariesSampleInputTest() {
		
		//3 3 2 1
		//1 2
		//3 1
		//2 3
		
		int[][] cities = {{1,2},{3,1},{2,3}};
		
		assertEquals(4, RoadsAndLibraries.roadsAndLibraries(3, 2, 1, cities));
		
	}

}
