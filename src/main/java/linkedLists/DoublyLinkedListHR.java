package linkedLists;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import linkedLists.InsertNodeAtPosition.SinglyLinkedListNode;

public class DoublyLinkedListHR {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the sortedInsert function below.

	/*
	 * For your reference:
	 *
	 * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
	 * DoublyLinkedListNode prev; }
	 *
	 */
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

		DoublyLinkedListNode nodeToInsert = new DoublyLinkedListNode(data);
		DoublyLinkedListNode headNode = head;
		DoublyLinkedListNode prevNode = head;
		DoublyLinkedListNode nextNode = head.next;

		int insertIndex = 0;
		
		boolean insertAtEnd = false;

		// Find the correct spot for insert.
		while (data > nextNode.data) {
			if(prevNode.next != null) {
				prevNode = prevNode.next;
			}else {
				insertAtEnd = true;
				break;
			}
			if(nextNode.next != null)
				nextNode = nextNode.next;
			else {
				insertAtEnd = true;
				break;
			}
			insertIndex++;
		}

		// We're in the correct spot after iterating
		// Make the connections

		if (0 == insertIndex) {
			headNode.prev = nodeToInsert;
			nodeToInsert.next = headNode;
			head = nodeToInsert;
		} else if(insertAtEnd){
			prevNode.next = nodeToInsert;
			nodeToInsert.prev = prevNode;
			nodeToInsert.next = null;
		}else {
			// Adjust previous Node's next
			prevNode.next = nodeToInsert;

			nodeToInsert.prev = prevNode;
			nodeToInsert.next = nextNode;

			// Adjust next node's previous
			nextNode.prev = nodeToInsert;
		}
		
		return head;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			DoublyLinkedList llist = new DoublyLinkedList();

			int llistCount = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llistCount; i++) {
				int llistItem = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist.insertNode(llistItem);
			}

			int data = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

		//	printDoublyLinkedList(llist1, " ", bufferedWriter);
		//	bufferedWriter.newLine();
		}

		//bufferedWriter.close();

		scanner.close();
	}
}
