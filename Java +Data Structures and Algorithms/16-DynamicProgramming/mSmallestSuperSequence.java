package gDynamicProgramming;

public class mSmallestSuperSequence {

	public static int smallestSuperSequence(String S, String V) {

		 int[][] dp = new int[S.length()][V.length()];

		 return smallestSuperSequence(S, 0,  V, 0,dp);
			
	}

	public static int smallestSuperSequence(String str1, int i,  String str2, int j, int[][] dp) {

		if ( str1.length() == 0){
				return str2.length();
			}

			if ( str2.length() == 0){
				return str1.length();
			}
			if (i >= dp.length || j >= dp[0].length) {
				return 0;
			}

		

			if (dp[i][j] != 0) {
				return dp[i][j];
			}
			
			
			if (str1.charAt(0) == (str2.charAt(0))) {
				 dp[i][j] = 1 + smallestSuperSequence(str1.substring(1), i +1, str2.substring(1) , j+1, dp);
				 return dp[i][j];
			} else {
				int op1  = smallestSuperSequence(str1.substring(1), i+1, str2 , j, dp);
				int op2 = smallestSuperSequence(str1, i, str2.substring(1) , j+1, dp);
				
				dp[i][j] = 1 + Math.min(op1, op2);
				return dp[i][j];
			}
			
	        
		}
        
	}
