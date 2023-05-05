package iStacks;

import java.util.Stack;

public class cBalancedParanthesis {

	public static boolean isBalanced(String expression) {
	    
			Stack<Character> stack = new Stack<>();
			for (int i =0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '('||ch == '{'||ch == '[' ) {
					stack.push(ch);
				}
				
				if (ch == ')') {
					if (stack.isEmpty() == false && stack.peek() == '(') {
						stack.pop();
					} else {
						return false;
					}
				} else if(ch == ']') {
					if (stack.isEmpty() == false && stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
					
				} else if(ch == '}') {
					if (stack.isEmpty() == false && stack.peek() == '{') {
						stack.pop();
					} else {
						return false;
					}
				}
				
				
			}

				return stack.isEmpty();
    }
	
	
	
	
}
