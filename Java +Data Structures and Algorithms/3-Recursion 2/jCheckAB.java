// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'

package cRecursion2;

public class jCheckAB {
   // Method 1
	public static boolean checkAB2(String str) { 
        if(str.length() == 0){
            return true; 
        } 
        
        if(str.charAt(0) == 'a') { 
            if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) { 
                return checkAB2(str.substring(3)); 
            } else { 
                return checkAB2(str.substring(1)); 
            } 
        } 
        return false; 
    
    }
	
	// Method2
	public static boolean checkAB(String input) {
		if (input.length() <=0) {
			return true;
		}
		
		if (input.length() == 1) {
			if (input.charAt(0) == 'a' || input.charAt(0) == 'b') {
				return true;
			}
			return false;
		}
		
		char ch = input.charAt(0);
		
		if (ch == 'a') {
			if (input.charAt(1) == 'a' || input.charAt(1) == 'b') {  // a should be followed by either a or b
				return checkAB(input.substring(1));
			}
		} 
		
		if (ch == 'b') {
			if (input.charAt(1) == 'b') {                           // b should be followed with b
				return checkAB(input.substring(2));                 // after bb
			}
		} 
			
			return false;
	
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
