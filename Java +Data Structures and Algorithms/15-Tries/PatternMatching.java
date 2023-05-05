package fTries;

import java.util.ArrayList;

public class PatternMatching {

	public boolean patternMatching(ArrayList<String> vect, String pattern) {
       
		Trie1 tree = new Trie1();
		String word = "";
		for (int i = 0; i < vect.size(); i++) {
	    		  word = vect.get(i);
			
			for (int j =0 ; j < word.length(); j++) {
				tree.add(word.substring(j));
			}
		}
		
		return tree.search(pattern);
		
	}
	
	
}

// This class is without isTerminating item
class Trie1 {
private TrieNode root;
	private int numWords;

	public Trie1() {
		root = new TrieNode('\0');
		numWords = 0;
	}
	
	public void remove(String word){
		if(remove(root, word)) {
			numWords--;
		}
	}
	
	private boolean remove(TrieNode root, String word) {
		if(word.length() == 0){
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			return false;
		}
		boolean ans = remove(child, word.substring(1));
		// We can remove child node only if it is non terminating and its number of children are 0	

		if(child.childCount == 0){
			root.children[childIndex] = null;
			child = null;
			root.childCount--;
		}
		return ans;
	}
	
	private boolean add(TrieNode root, String word){
		if(word.length() == 0){
		
				return true;
			
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}
	public void add(String word){
		if(add(root, word)) {
			numWords++;
		}
	}
	
	public boolean search(String word){
		 return search(root,word);
	}
	private boolean search(TrieNode root, String word){
	    if(word.length()==0 ){
	        return true;
	    } else if (word.length()==0) {
	    	return false;
	    }
	    int childIndex = word.charAt(0) -'a';
	    TrieNode child = root.children[childIndex];
	    if(child==null){
	        return false;
	    }
	    return search(child,word.substring(1));
	}
	
	public int countWords() {
		return numWords;
	}
	
}
