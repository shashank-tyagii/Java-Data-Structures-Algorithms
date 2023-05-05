package iStacks;

import java.util.Stack;

public class dCheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String expression) {

			Stack<Character> stack = new Stack<>();
	        
	      	for (int i =0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				int count = 0;
			
				if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					stack.push(ch);
				} else if (ch == ')') {
					count = 0;
					while (!stack.isEmpty() && stack.peek() != '(') {
						stack.pop();
						count++;
					}
	                 if (count ==0) {
					return true;
					}
	            
					if (!stack.isEmpty()) {
	                    stack.pop();
	                }
	              
				}
			}
	        return false;
	}

}
