package stacksAndQueues;

import java.util.Stack;

public class BalancedBrackets {
	
	// Complete the isBalanced function below.
    static String isBalanced(String s) {

    	String result = "YES";
    	
    	Stack<Character> charStack = new Stack<>();
    	
    	//Go through half of the string, Java should round down on odd numbers.
    	for(int i = 0; i < s.length() / 2; i++) {
    		charStack.push(s.charAt(i));
    	}
    	
    	
    	//Go through the second half of the string, let's pop off the characters from the stack
    	//and see if they match.
    	for(int j = s.length() / 2; j < s.length(); j++) {
    		
    		switch(s.charAt(j)) {
    			case '}':
    				if(charStack.pop() != '{')
    					result = "NO";
    				break;
    			case ')':
    				if(charStack.pop() != '(')
    					result = "NO";
    				break;
    			case ']':
    				if(charStack.pop() != '[')
    					result = "NO";
    				break;
    		}
    		
    		if(result.equals("NO"))
    			break;

    	}
    	
    	return result;
    	
    }

}
