// The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going backwards) for which the price of the stock was less than today's price.
// For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85], then the stock spans will be [1, 1, 1, 2, 1, 4, 6].

package iStacks;
import java.util.Stack;
public class eStockSpan {

	//  [100, 80, 60, 70, 60, 75, 85]  ---->>> [1, 1, 1, 2, 1, 4, 6]
	public static int[] stockSpan(int[] price) {
		
		Stack<Integer> stack = new Stack<>();
        int n = price.length;
        int[] output = new int[n];
        
        // We will only store respective index of the element
        stack.push(0);
        output[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] < price[i]) {
                stack.pop();       // pop until we get a number which is greater than the current element
            }

            if (stack.isEmpty()) {
                output[i] = i + 1;  // if 4th element, i.e i= 3 is largest, then output[i] = 4
            } else {
                output[i] = i - stack.peek();        // Lets say if at index = 4, the number is greater than the current number
            }
            stack.push(i);    // always push the current index
        }
        return output;
	}
}
