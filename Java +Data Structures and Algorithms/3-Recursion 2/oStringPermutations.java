package cRecursion2;

public class oStringPermutations {

	public static String[] permutationOfString(String input){ 
		if(input.length() == 0){ 
			String output[] = {""}; 
			return output; 
			} 
		
		String[] smallerOutput = permutationOfString(input.substring(1)); 
		String output[] = new String[input.length()*smallerOutput.length]; 
		int k =0; 
		for(int i = 0; i < smallerOutput.length; i++){ 
			String currentString = smallerOutput[i]; 
			for(int j = 0; j <= currentString.length(); j++){ 
				output[k] = currentString.substring(0, j) + input.charAt(0) + currentString.substring(j); k++; } 
			} 
		return output; 
		}
//	public static String[] permutationOfString(String input){   // abc
//		
//		if (input.length() ==1) {
//			String[] ss = new String[1];
//			ss[0] = input;
//			return ss;
//		}
//		
//		char ch = input.charAt(0);                   // a
//		String[] output = new String[factorial(input.length())];  // 3 x 2 x 1 = 6
//		String[] smallSolution = permutationOfString(input.substring(1));  // bc - {bc,cb}
//		int m =0;
//		for (int i =0; i < input.length(); i++) {
//			for (int j = 0; j < smallSolution.length; j++) {
//                int p=0; output[m] = "";
//				for (int k=0; k < smallSolution[0].length()+1; k++) {
//					if (i ==k) {
//						output[m] = output[m]+ch;                          // add a 
//					} else {
//                        output[m] = output[m]+smallSolution[j].charAt(p);
//                        p++;
//                    }
//					
//				}
//				m++;
//			}
//		}
//
//		return output;
//	}
//    public static int factorial(int n) {
//		if (n==0 || n==1) {
//			return 1;
//		}
//		
//		int fact = n * factorial(n-1);
//		return fact;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
