// Return an array of subsequence of String
package cRecursion2;

public class eReturnSubsequence {
	public static String[] findSubsequences(String str) {
		
		if (str.length() ==0) {
			String[] abc = {""};
			return  abc;
		}
		
		String[] output = new String[(int)(Math.pow(2, str.length()))];   // 2 x 2 x 2 ....... either empty or character
		int k =0;
		String[] temp = findSubsequences(str.substring(1));           // This will return subsequences from next character       
		for (int i = 0; i  <temp.length; i++) {
			output[k] = "" + temp[i];              // add empty
			k++;
			output[k] = str.charAt(0) + temp[i];   // or character
			k++;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		String[] out = new String[3];
		out = findSubsequences("abc");
		for (int i =0; i < out.length; i++) {
			System.out.println(out[i]);	
		}
		
	}

}
