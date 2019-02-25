package stacksAndQueues;

import java.util.Stack;

public class BalancedBrackets {
	
	// Complete the isBalanced function below.
    static String isBalanced(String s) {

    	String result = "YES";
    	
    	Stack<Character> charStack = new Stack<>();
    	
    	//Go through the entire string and add '{', '(', and '[' to the stack.
    	//If a '}', ')', and ']' show up, pop an item from the stack and verify that there is a matching bracket.
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		switch(s.charAt(i)) {
    		
    		case '{':
				charStack.push(s.charAt(i));
				break;
			case '(':
				charStack.push(s.charAt(i));
				break;
			case '[':
				charStack.push(s.charAt(i));
				break;
    		
			case '}':
				if(charStack.empty() || charStack.pop() != '{')
					result = "NO";
				break;
			case ')':
				if(charStack.empty() || charStack.pop() != '(')
					result = "NO";
				break;
			case ']':
				if(charStack.empty() || charStack.pop() != '[')
					result = "NO";
				break;
    		}
    	
    		if(result.equals("NO"))
    			break;
    	}
    	
    	//Check to see if our stack is empty, if the stack isn't empty after looping through the string
    	//then we have open brackets not matched.
    	
    	if(!charStack.empty()) {
    		result = "NO";
    	}
    	
    	return result;
    	
    }

}
