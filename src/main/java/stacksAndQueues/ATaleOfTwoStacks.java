package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class ATaleOfTwoStacks {

	public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
	
}

class MyQueue<T>{
	Stack<T> enqueueStack = new Stack<>();
	Stack<T> dequeueStack = new Stack<>();
	
	boolean pushMode = true;
	
	public void enqueue(T t) {
		
		
		//We should check to see if we are in push mode, if we aren't
		//then we need to transfer the dequeue stack to the enqueue stack.
		if(!pushMode) {
			while(!dequeueStack.empty()) {
				enqueueStack.push(dequeueStack.pop());
			}
		}
		
		pushMode = true;
		
		enqueueStack.push(t);
		
	}
	
	public void createDequeue() {
		
		//Clear out the dequeue stack and start afresh. Instead of adding to existing stack.
		
		while(!enqueueStack.empty()) {
			dequeueStack.push(enqueueStack.pop());
		}
		
		pushMode = false;
	}
	
	public T dequeue() {
		T t = null;
		
		createDequeue();
		
		if(!dequeueStack.isEmpty())
			t = dequeueStack.pop();
		
		return t;
	}
	
	public T peek() {
		T t = null;
		
		createDequeue();
		t = dequeueStack.peek();
		
		return t;
	}
}
