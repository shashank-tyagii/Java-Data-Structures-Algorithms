package dHashmaps;

// Every array index will store an LinkedList
public class MapNode<K, V> {
	K key;
	V value;
	MapNode<K, V> next;
	
	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
