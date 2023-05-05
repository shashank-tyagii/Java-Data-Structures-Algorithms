package jQueues;
import java.util.*;

public class reverseQueue {

	public static void reverseQueue(Queue<Integer> queue) {
		if (queue.size() <= 1) {
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
	}
}
