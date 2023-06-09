package ePriorityQueuePQ;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class jBuyTheTicket {

	public static int buyTicket(int input[], int k) {
		
		Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10,Collections.reverseOrder());
        for(int i: input){
            q.add(i);
            pq.add(i);
        }
        int count =0;
        while(!pq.isEmpty()){
            if(q.peek().equals(pq.peek())){
                if(k==0){
                    return count+1;
                }
                else 
                {
                    count++;
                    q.poll();
                    pq.poll();
                    k--;
                }
            }
            else {
                q.add(q.peek());
                q.poll();
                if(k==0){
                    k = q.size()-1;
                    
                }
                else {
                    k--;
                }
            }
        }
        return count;
	}
}
