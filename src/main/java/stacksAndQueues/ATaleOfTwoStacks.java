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
	
	public void enqueue(T t) {

		enqueueStack.push(t);
		
	}
	
	public void createDequeue() {
		
		//Should take O(N)
		
		while(!enqueueStack.empty()) {
			dequeueStack.push(enqueueStack.pop());
		}

	}
	
	public T dequeue() {
		T t = null;
		
		if(dequeueStack.isEmpty())
			createDequeue();
			
		//Should be O(1)
		t = dequeueStack.pop();
		
		return t;
	}
	
	public T peek() {
		T t = null;
		
		if(dequeueStack.isEmpty())
			createDequeue();
		
		t = dequeueStack.peek();
		
		return t;
	}
}
