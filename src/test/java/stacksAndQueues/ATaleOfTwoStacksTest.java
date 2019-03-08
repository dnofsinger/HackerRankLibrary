package stacksAndQueues;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATaleOfTwoStacksTest {

	MyQueue<Integer> myTestQueue;
	
	@Before
	public void setUp() throws Exception {
		
		myTestQueue = new MyQueue<>();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sampleInputTest() {
		
		myTestQueue.enqueue(5);
		myTestQueue.enqueue(10);
		myTestQueue.enqueue(15);
		
		assertEquals(new Integer(5), myTestQueue.dequeue());
		assertEquals(new Integer(10), myTestQueue.dequeue());
		assertEquals(new Integer(15), myTestQueue.dequeue());
		
	}
	
	@Test
	public void sampleTestCase0(){
	
		myTestQueue.enqueue(42);
		
		myTestQueue.dequeue();
		
		myTestQueue.enqueue(14);
		
		assertEquals(new Integer(14), myTestQueue.peek());
		
		myTestQueue.enqueue(28);
		
		assertEquals(new Integer(14), myTestQueue.peek());
		
		myTestQueue.enqueue(60);
		
		myTestQueue.enqueue(78);
		
		myTestQueue.dequeue();
		
		myTestQueue.dequeue();
		
	}

}
