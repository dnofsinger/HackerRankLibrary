package linkedLists;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertNodeInDoublyLinkedListTest {
	
	TestLinkedListCreator testCaseCreator;
	HashMap<Integer, TestCase> testCases;

	@Before
	public void setUp() throws Exception {
		testCaseCreator = new TestLinkedListCreator();
		testCaseCreator.readFromFile(new File("C:\\Users\\Owner\\git\\HackerRankLibrary\\src\\test\\java\\linkedLists\\DoublyLinkedListInsert_TestCase2.txt"));
		testCases = testCaseCreator.createTestCases();
	}

	@After
	public void tearDown() throws Exception {
		testCases = null;
	}
	
	@Test
	public void testNumOfTestCases() {
		assertEquals(14, testCases.size());
	}
	
	@Test
	public void testHackerRankTestCase2() {
		
	}

	@Test
	public void sortedInsertTest() {
		
		DoublyLinkedListHR.DoublyLinkedList testList =
				new DoublyLinkedListHR.DoublyLinkedList();
		
		testList.insertNode(1);
		testList.insertNode(3);
		testList.insertNode(4);
		testList.insertNode(10);
		
		DoublyLinkedListHR.sortedInsert(testList.head, 5);
		
		assertEquals(5, testList.head.next.next.next.data);
		
	}
	
	@Test
	public void sortedInsertTest_FirstIndex() {
		
		DoublyLinkedListHR.DoublyLinkedList testList =
				new DoublyLinkedListHR.DoublyLinkedList();
		
		testList.insertNode(1);
		testList.insertNode(3);
		testList.insertNode(4);
		testList.insertNode(10);
		
		DoublyLinkedListHR.DoublyLinkedListNode testNode = DoublyLinkedListHR.sortedInsert(testList.head, 0);
		
		assertEquals(0, testNode.data);
		
	}
	
	@Test
	public void sortedInsertTest_LastIndex() {
		
		DoublyLinkedListHR.DoublyLinkedList testList =
				new DoublyLinkedListHR.DoublyLinkedList();
		
		testList.insertNode(1);
		testList.insertNode(3);
		testList.insertNode(4);
		testList.insertNode(10);
		
		DoublyLinkedListHR.DoublyLinkedListNode testNode = DoublyLinkedListHR.sortedInsert(testList.head, 11);
		
		//1, 3, 4, 10, 11
		assertEquals(11, testNode.next.next.next.next.data);
		
	}

}
