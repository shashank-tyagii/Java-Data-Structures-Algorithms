// Print all sub-strings

package iStrings;
public class eSubstrings {
	
    // Output 1 :  a ab abc abcd b bc bcd c cd d 
	public static void printSubstrings(String str) {
		
//		for (int i=0; i < str.length(); i++) {
//			
//			for (int j =i; j<str.length(); j++) {
//				
//				System.out.print (str.substring(i,j+1) + " ");
//			}
//		}
	// Output 2 :  a b c d ab bc cd abc bcd abcd 
		for(int len=1;len<=str.length();len++){
	          // We have to print all strings wih length as "len"
	          for(int start=0;start<=str.length()-len;start++){
	              int end=start+len-1;
	              System.out.print(str.substring(start,end+1)+ " ");
	          }
	      }
	}
	public static void main(String[] args) {
		printSubstrings("abcd");

	}

}
