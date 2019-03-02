package linkedLists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class TestLinkedListCreator {

	
	private static HashMap<Integer, TestCase> testCases;
	private static BufferedReader br;
	private File testDataFile;
	
	public TestLinkedListCreator() {
		testCases = new HashMap<>();
		br = null; 
	}
	
	public void readFromFile(File file) {
			this.testDataFile = file; 
	}
	
	public HashMap<Integer, TestCase> createTestCases() {
		int numOfTestCases = 0;
		int numOfElements = 0;
		int valueToInsert = -1;
		TestCase testCase;
		try {
			br = new BufferedReader(new FileReader(testDataFile));
			numOfTestCases = Integer.parseInt(br.readLine());
			for(int testCaseIndex = 0; testCaseIndex < numOfTestCases; testCaseIndex++) {
				numOfElements = 0;
				valueToInsert = -1;
				testCase = new TestCase();
				DoublyLinkedListHR.DoublyLinkedList listToAdd = new DoublyLinkedListHR.DoublyLinkedList();
				numOfElements = Integer.parseInt(br.readLine());
				for(int element = 0; element < numOfElements; element++) {
					listToAdd.insertNode(Integer.parseInt(br.readLine()));
				}
				valueToInsert = Integer.parseInt(br.readLine());
				testCase.setLinkedList(listToAdd);
				testCase.setValueToInsert(valueToInsert);
				testCases.put(testCaseIndex, testCase);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return testCases;
	}
}

class TestCase{
	DoublyLinkedListHR.DoublyLinkedList testLinkedList;
	int valueToInsert;
	
	public TestCase() {
		testLinkedList = null;
		valueToInsert = -1;
	}
	
	public void setLinkedList(DoublyLinkedListHR.DoublyLinkedList list) {
		testLinkedList = list;
	}
	
	public void setValueToInsert(int value) {
		valueToInsert = value;
	}
}
