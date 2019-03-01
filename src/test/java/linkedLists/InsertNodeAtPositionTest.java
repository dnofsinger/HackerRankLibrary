package linkedLists;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertNodeAtPositionTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	private final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	@Before
	public void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void insertNodeAtPosition_Test() {
		
		InsertNodeAtPosition.SinglyLinkedList linkedListTest = new InsertNodeAtPosition.SinglyLinkedList();
		
		linkedListTest.insertNode(16);
		linkedListTest.insertNode(13);
		linkedListTest.insertNode(7);
		
		InsertNodeAtPosition.insertNodeAtPosition(linkedListTest.head, 1, 2);
		
		assertEquals(1, linkedListTest.head.next.next.data);
		
	}
	
	@Test
	public void insertNodeAtPosition2_Test() {
		
		InsertNodeAtPosition.SinglyLinkedList linkedListTest = new InsertNodeAtPosition.SinglyLinkedList();
		
		linkedListTest.insertNode(16);
		linkedListTest.insertNode(13);
		linkedListTest.insertNode(7);
		
		linkedListTest.head = InsertNodeAtPosition.insertNodeAtPosition(linkedListTest.head, 1, 0);
		
		assertEquals(1, linkedListTest.head.data);
		
	}
	
	@Test
	public void insertNodeAtPositionEnd_Test() {
		
		InsertNodeAtPosition.SinglyLinkedList linkedListTest = new InsertNodeAtPosition.SinglyLinkedList();
		
		linkedListTest.insertNode(16);
		linkedListTest.insertNode(13);
		linkedListTest.insertNode(7);
		
		linkedListTest.head = InsertNodeAtPosition.insertNodeAtPosition(linkedListTest.head, 1, 3);
		
		assertEquals(1, linkedListTest.head.next.next.next.data);
		
	}

}
