package gDynamicProgramming;

public class nSubsetSum {

	 static boolean isSubsetPresent(int[] arr, int n, int sum) {
	        boolean[] dp = new boolean[n];
	       return isSubsetPresent(arr, n, sum, dp);

	    }

	    static boolean isSubsetPresent(int[] set, int n, int sum, boolean[] dp) {

	        if (n == 0) {
	            return false;
	        }
	        if (sum == 0) {
	            dp[n - 1] = true;
	            return true;
	        }

	       

	        // If last element is greater than
	        // sum, then ignore it
	        if (set[n - 1] > sum) {
	            dp[n - 1] = isSubsetPresent(set, n - 1, sum, dp);
	            return dp[n - 1];
	        }

	        /*
	         * else, check if sum can be obtained
	         * by any of the following
	         * (a) including the last element
	         * (b) excluding the last element
	         */
	        dp[n - 1] = isSubsetPresent(set, n - 1, sum, dp) || isSubsetPresent(set, n - 1, sum - set[n - 1], dp);
	        return dp[n - 1];
	    }
    }
	
	
