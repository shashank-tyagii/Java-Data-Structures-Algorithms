// Given a string S, remove consecutive duplicates from it recursively
package cRecursion2;

public class bRemoveDuplicates {

	public static String removeConsecutiveDuplicates(String s, int index) {
		
		if (index ==s.length()-1) {
			return "" + s.charAt(index);
		} else if (index >= s.length()) {
			return "";
		}
		
		String output;
		int i;
        for (i=1 ; i <s.length()-index; i++){
            if (s.charAt(index+i-1) != s.charAt(index+ i)){
                break;
            }
        }
        
			output = s.charAt(index)+    removeConsecutiveDuplicates(s, index+i);
		
		
		return output;
	}
	
	// Method 2
	public static String removeConsecutiveDuplicates(String s) { 
		if(s.length() <= 1) { 
			return s; 
			} 
		if(s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1)); 
			} else { 
				String small = removeConsecutiveDuplicates(s.substring(1)); 
				return s.charAt(0) + small; } 
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
