package fTries;

import java.util.ArrayList;

public class PalindromePair {
	
}

class Trie2 {

	private TrieNode root;
	public int count;

	public Trie2() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}



	/*..................... Palindrome Pair................... */

	public boolean isPalindromePair(ArrayList<String> words) { 
		for(String word : words) { 
			this.add(reverseWord(word)); 
			} 
		
		return isPalindromePair(this.root, words); 
		
	} 
	
	private static String reverseWord(String word) { 
		String reverse = ""; 
		for(int i = word.length() - 1; i >= 0; i--) { 
			reverse += word.charAt(i); 
			} 
		
		return reverse; 
		} 
	
	private boolean isPalindromePair(TrieNode root, ArrayList<String> words) { 
		if (words == null || words.size() == 0) { 
			return false; 
			} 
		
		for (String word : words) { 
			if (doesPairExistFor(root, word, 0)) { 
				return true; 
				} 
			} 
		
		return false; 
		} 
	
	private boolean doesPairExistFor(TrieNode root, String word, int startIndex) { 
		/* Since an empty string is always a palindrome, we return 'true' */ 
		if (word == "") { return true; } 
		if (startIndex == word.length()) { 
			if (root.isTerminating) { 
				/* * When there exists an exact match of the word we are * searching for in the Trie, irrespective of the trie * extends further in the same path. * */ 
				return true; 
				} 
			/* * When trie extends further, there doesnt exist an exact * match of the string we are looking for. * However, it may happen that any of the the branch * extending from root may form a palindrome. * * */ 
			return checkRemainingBranchesInTrie(root, ""); 
			} 
		
		int charIndex = word.charAt(startIndex) - 'a'; 
		TrieNode correspondingChild = root.children[charIndex]; 
		if(correspondingChild == null) { 
			/* * This means that, down the line in the characters that we are looking * for against the word in the trie, the character doesn't exist in the trie. * This character can be anywhere in the range [0 - (word length-1)] * * */
			if (root.isTerminating) { 
				return checkWordForPalindrome(word.substring(startIndex)); 
				} 
			return false; 
			} 
		
		return doesPairExistFor(correspondingChild, word, (startIndex + 1)); 
		} 
	
	
	private boolean checkRemainingBranchesInTrie(TrieNode root, String word) { 
		/* * * This function recursively explores all the branches from the root * while keeping a track of the characters in the 'word' and checks * each word whenever the terminating condition is true. * * If the word is a palindrome, we return true and stops exploring the * other branches. If it is otherwise, we keep on checking the remaining * branches. * * Once all the branches are explored, and we don't find any branch or * word that makes itself a palindrome we return false at last. * */ 
		if (root.isTerminating) { 
			if (checkWordForPalindrome(word)) { 
				return true; 
				} 
			} 
		
		for (TrieNode childNode : root.children) { 
			if (childNode == null) { 
				continue; 
				} 
			String fwd = word + childNode.data; 
			
			if (checkRemainingBranchesInTrie(childNode, fwd)) { 
				return true; 
				} 
			} return false; 
			} 
	
	private static boolean checkWordForPalindrome(String word) { 
		
		int startIndex = 0; 
		int endIndex = word.length() - 1; 
		
		while (startIndex < endIndex) { 
			if (word.charAt(startIndex) != word.charAt(endIndex)) { 
				return false; 
				} 
			
			startIndex += 1; 
			endIndex -= 1; 
			} return true; 
			
	
	}

	
	 


	
} 
	
