// Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
package bRecursion;

public class qReplacePi {

	public static String replace(String input){
		String ss = replace(input,0);
		return ss;
	}
    public static String replace(String input, int startIndex){
	
		if (startIndex>=input.length()-1) {
			if (startIndex == input.length()-1) {
				String s = ""+ input.charAt(input.length()-1);
				return s;
			} else if (startIndex >=input.length()) {
				return "";
			}
		}
		
		String output = "";
		if (input.charAt(startIndex) == 'p' && input.charAt(startIndex+1) == 'i' ) {
			output = output + "3.14" + replace(input, startIndex+2);
		} else {
			output = output + input.charAt(startIndex) + replace(input, startIndex+1);
		}

		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
