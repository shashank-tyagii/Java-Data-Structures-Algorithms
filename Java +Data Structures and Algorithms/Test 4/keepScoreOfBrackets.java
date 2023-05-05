package skillTest3;

import java.util.Stack;

public class keepScoreOfBrackets {


    static public int scoreOfParentheses(String S)
  {
    Stack<String> s = new Stack<>();
 
    // Stores index of
    // character of String
    int i = 0;
 
    // Stores total scores
    // obtained from the String
    int ans = 0;
 
    // Iterate over characters
    // of the String
    while (i < S.length())
    {
 
      // If s[i] is '('
      if (S.charAt(i) == '(')
        s.add("(");
      else
      {
 
        // If top element of
        // stack is '('
        if (s.peek() == "(")
        {
          s.pop();
          s.add("3");
        }
        else
        {
 
          // Stores score of
          // inner parentheses
          long count = 0;
 
          // Calculate score of
          // inner parentheses
          while (s.peek() != "(")
          {
 
            // Update count
            count += Integer.parseInt(s.peek());
            s.pop();
          }
 
          // Pop from stack
          s.pop();
 
          // Insert score of
          // inner parentheses
          s.add(String.valueOf(3 * count));
        }
      }
 
      // Update i
      i++;
    }
 
    // Calculate score
    // of the String
    while (!s.isEmpty())
    {
 
      // Update ans
      ans += Integer.parseInt(s.peek());
      s.pop();
    }
    return ans;
  }
}
