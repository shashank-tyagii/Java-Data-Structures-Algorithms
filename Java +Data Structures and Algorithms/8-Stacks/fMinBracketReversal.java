package iStacks;

// For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
// If the expression can't be balanced, return -1.
// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.


import java.util.Stack;

public class fMinBracketReversal {

	public static int countBracketReversals(String expression) {
		//Your code goes here
          if (expression.length() == 0) {
            return 0;
        }

        if (expression.length() % 2 != 0) {
            return -1; // Only even numbers of brackets can be balanced
        }

        Stack <Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char currentCharacter = expression.charAt(i);

            if (currentCharacter == '{') {
                stack.push(currentCharacter);
            } else {
//                pop if there is a balanced pair
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(currentCharacter);
                }
            }
        }

        int count = 0;

//        only unbalanced brackets are there in stack now
        while (!stack.isEmpty()) {
            char char1 = stack.pop();
            char char2 = stack.pop();
            /*when char1 = } and char2 = {, then we need to reverse both of them so count will increase by 2*/
            if (char1 != char2) {
                count += 2;
            } else {
                count++;
            }
        }
        return count;
	}
}
