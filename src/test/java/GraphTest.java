import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphs.Graph;

public class GraphTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void roadsAndLibrariesTest() {
		
		//3 3 2 1
		//Number of Cities: 3
		//Number of Roads: 3
		//Cost of Library: 2
		//Cost of Road: 1
		// 1 2
		// 3 1
		// 2 3
		long cost = 0;
		int[][] roads = {{1, 2},{3, 1},{2, 3}};
		cost = Graph.roadsAndLibraries(3, 2, 1, roads);
		
		assertEquals(4, cost);
	}
	

}
