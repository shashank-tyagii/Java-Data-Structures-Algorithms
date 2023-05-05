// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// abc de ghihjk a uvw h j ---->> a
package iStrings;
public class nMinLengthWord {

	 public static String minLengthWord(String input){	
         if (input == ""){
             return "";
         }
    	String output = "";
    	int count = 0;
    	int min = Integer.MAX_VALUE;
    	String temp ="";
    	for (int i =0; i < input.length(); i++ ) {
    		char ch = input.charAt(i);
    		if (ch ==' ') {
    			if (count < min) {
    				min = count;
    				output = temp;
    			}
                count = 0;
    			temp = "";
    		} else {
    			temp = temp + ch;
    			count++;
    		}
    	}
         if (count < min) {
    				output = temp;
    			}
    	return output;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
