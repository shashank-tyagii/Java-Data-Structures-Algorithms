package jQueues;
import java.util.*;

public class reverseFirstKElements {

	public static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
		//Your code goes here
         if (queue.isEmpty() || k > queue.size()) {
            return queue;
        }

        if (k <= 0) {
            return queue;
        }

        Stack stack = new Stack();
        
       /* Push the first K element into a Stack*/
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        /* Enqueue the contents of stack at the back of the queue*/
        
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
		/* Remove the remaining elements and enqueue them at the end of the Queue*/
        
        for (int i = 0; i < queue.size() - k; i++) {
        queue.add(queue.poll());
    }
        
        return queue;
	}

}
