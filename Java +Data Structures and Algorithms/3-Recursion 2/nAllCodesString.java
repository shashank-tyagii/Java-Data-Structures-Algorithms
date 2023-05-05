// Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
// 1123 - aabc, kbc , alc , aaw , kw
package cRecursion2;

public class nAllCodesString {

public static  String[] getCode(String input){
	
        
		if (input.length() == 0) {
            String[] ss = new String[1];
            ss[0] = "";
			return ss;
		}
        if (input.length() < 0) {
			return new String[1];
		}
		
		if (input.length() == 1) {
			int n = Integer.parseInt(input);
			char ch = (char) (96 + n);
			String[] str = new String[1];
			str[0] = "" + ch;
			return str;
		}
		
		String ch1 = input.substring(0, 1);
		int n1 = Integer.parseInt(ch1);
		char c1 = (char)(96+n1);
		String ch2 = input.substring(0,2);
		int n2 = Integer.parseInt(ch2);
		
			char c2 = (char)(96+n2);	
		
		
		 String[] str1 = getCode(input.substring(1));
		 String[] str2 = getCode(input.substring(2)); 
        String[] output;
        if (n2 < 27){
            output = new String[str1.length+ str2.length];
        }
        else {
            output = new String[str1.length];
        }
		 
		
	
		int k=0;
		for (int i=0; i < str1.length; i++) {
			output[k] = c1 + str1[i];
			k++;
		}
        if (n2 <27){
            for (int i=0; i < str2.length; i++) {
			output[k] = c2 + str2[i];
			k++;
		}
        }
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
