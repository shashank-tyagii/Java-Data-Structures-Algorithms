package dHashmaps;
import java.util.ArrayList;

public class Map <K, V> {
	ArrayList<MapNode<K, V>> buckets;
	int size;
	int numBuckets;
	public Map() {
		numBuckets = 50;
		buckets = new ArrayList<>();
		for (int i = 0; i < numBuckets; i++) {       // Add null to each index of arraylist
			buckets.add(null);
		}
	}
	
	public int size() {
		return size;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);         // Get the index using the Hash function
		MapNode<K, V> head = buckets.get(bucketIndex); // Get the head of Linkedlist at that index
		MapNode<K, V> prev = null;       
		while (head != null) {
			if (head.key.equals(key)) {
				size--;
				if (prev == null) {
					buckets.set(bucketIndex, head.next);  // If first node is the key, then directly change to arraylist index as head.next
				} else {
					prev.next = head.next;            // skip the node
				}
				return head.value;                      
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	private int getBucketIndex(K key) {      // Will convert key into a integer using it's address and return an index
		int hashCode = key.hashCode();
		return hashCode % numBuckets;
	}
	
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);          // Get the arraylist index
		MapNode<K, V> head = buckets.get(bucketIndex);  // Get the head of linkedList at that address
		while (head != null) {                          // Check throughout the linkedlist if that key already exists
			if (head.key.equals(key)) {
				head.value = value;                    // If key already exists, then update the value
				return;
			}
			head = head.next;
		}
		head = buckets.get(bucketIndex);                // move back the head to previous value
		MapNode<K, V> newElementNode = new MapNode<K, V>(key , value);  // Create a new node
		size++;
		newElementNode.next = head;                    // Add that linkedlist to this node
		buckets.set(bucketIndex, newElementNode);       //  Set this as head on arraylist    
		double loadFactor = (1.0*size)/numBuckets;
		if (loadFactor > 0.75) {
			rehash();
		}
		
	}
	// We will double the array but, copy to new array will not be direct, as we need to calculate fresh index and then insert to new array
	private void rehash() {
		System.out.println("Rehashing: buckets" + numBuckets + " size " + size);
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for (int i = 0; i < 2*numBuckets; i++) {
			buckets.add(null);
		}
		size = 0;
		numBuckets *= 2;
		for (int i = 0; i < temp.size(); i++) {
			MapNode<K, V> head = temp.get(i);
			while (head != null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);      // Calculation of fresh Index because of increased size is required
				head = head.next;
			}
		}
	}
}
