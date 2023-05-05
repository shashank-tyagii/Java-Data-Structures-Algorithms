package gDynamicProgramming;

public class iLCS {

	public static int lcs(String s, String t) {
		int[][] storage = new int[s.length() + 1][t.length() + 1];
        return lcsDP(s, t, storage);
    }
	
	// Recursion - Bad approach
	 public static int lcsREC(String s1, String s2) {


	        int m = s1.length();
	        int n = s2.length();
	        if (m == 0 || n == 0) {
	            return 0;
	        }
	        if (s1.charAt(0) == s2.charAt(0)) {
	            return 1 + lcsREC(s1.substring(1), s2.substring(1));
	            
	        } else {
	            int op1 = lcsREC(s1.substring(1), s2);
	            int op2 = lcsREC(s1, s2.substring(1));
				int op3 = lcsREC(s1.substring(1),s2.substring(1) );
	            return Math.max(op1, Math.max(op2, op3));
	        }

	 	}
	 
	 public static int lcsDP(String s1, String s2, int[][] storage) {

	        int m = s1.length();
	        int n = s2.length();

	        if (storage[m][n] > 0) {
	            return storage[m][n];
	        }
	        if (m == 0 || n == 0) {
	            storage[m][n] = 0;
	            return storage[m][n];
	        }
	        if (s1.charAt(0) == s2.charAt(0)) {
	            storage[m][n] = 1 + lcsDP(s1.substring(1), s2.substring(1), storage);
	            return storage[m][n];

	        } else {
	            int op1 = lcsDP(s1.substring(1), s2, storage);
	            int op2 = lcsDP(s1, s2.substring(1), storage);
	            storage[m][n] = Math.max(op1, op2);
	            return storage[m][n];
	        }

	    }
	 
	 
	 
}
