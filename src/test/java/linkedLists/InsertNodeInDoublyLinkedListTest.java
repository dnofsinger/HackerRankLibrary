package linkedLists;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertNodeInDoublyLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
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
