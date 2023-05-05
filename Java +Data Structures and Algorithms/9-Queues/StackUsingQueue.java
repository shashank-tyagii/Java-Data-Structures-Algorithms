package jQueues;
import java.util.*;

public class StackUsingQueue {

}
 class Stack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public Stack() {
    this.q1 = new LinkedList<>();
    this.q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
      return q1.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void push(int element) {
       q1.add(element);
    }

    public int pop() {
         if (isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int ans = q1.poll();

        Queue<Integer> tmp = this.q1;
        this.q1 = this.q2;
        this.q2 = tmp;

        return ans;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int ans = q1.poll();
        q2.add(ans);

        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;

        return ans;
    }
}