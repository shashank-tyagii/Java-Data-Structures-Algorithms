package ePriorityQueuePQ;
import java.util.ArrayList;

public class minPQ {

	private ArrayList<Integer> heap;

	public minPQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws priorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new priorityQueueException();
		}
		return heap.get(0);
	}
	
	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {                                  // Upheapify
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}
	
	 int removeMin() throws priorityQueueException{
			if(isEmpty()){
				// Throw an exception
				throw new priorityQueueException();
			}
			int temp = heap.get(0);
			heap.set(0, heap.get(heap.size() - 1));   // Replace first with last element from tree
			heap.remove(heap.size() - 1);
			int parentindex = 0;       // In arraylist, first element is the parent
			int minIndex = parentindex;
			int leftChildIndex = 1;    // At index 1 in arraylist, there's first child
			int rightChildIndex = 2;   // At index 2 in arraylist, there's second child

			while(leftChildIndex < heap.size()){                 // Down-Heapify

				if(heap.get(leftChildIndex) < heap.get(minIndex)){
					minIndex = leftChildIndex;
				}
				if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
					minIndex = rightChildIndex;
				}
				if(minIndex == parentindex){
					break;
				}else{
					int temp1 = heap.get(parentindex);
					heap.set(parentindex, heap.get(minIndex));
					heap.set(minIndex, temp1);
					parentindex = minIndex;
					leftChildIndex = 2 * parentindex + 1;
					rightChildIndex = 2 * parentindex + 2;
				}
			}
			return temp;

		}
}
