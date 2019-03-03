package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortingComparatorTest {
	
	Player[] setOfPlayers;
	Checker checker;
	
	Player amy;
	Player david;
	Player heraldo;
	Player aakansha;
	Player aleksa;

	@Before
	public void setUp() throws Exception {
		
		checker = new Checker();
		
		amy = new Player("amy", 100);
		david = new Player("david", 100);
		heraldo = new Player("heraldo", 50);
		aakansha = new Player("aakansha", 75);
		aleksa = new Player("aleksa", 150);
		
		setOfPlayers = new Player[5];
		
		setOfPlayers[0] = amy;
		setOfPlayers[1] = david;
		setOfPlayers[2] = heraldo;
		setOfPlayers[3] = aakansha;
		setOfPlayers[4] = aleksa;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sampleHRInputTest() {
		
		
		Player[] expectedResults = new Player[5];
		
		expectedResults[0] = aleksa;
		expectedResults[1] = amy;
		expectedResults[2] = david;
		expectedResults[3] = aakansha;
		expectedResults[4] = heraldo;
		
		Arrays.sort(setOfPlayers, checker);
		
		assertArrayEquals(expectedResults, setOfPlayers);
	}

}
