// Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
// That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
package gDynamicProgramming;

public class eMinCountOfSquares {

	// Iterative approach
	public static int minCount(int n) {
		// Write your code here
		int[] dp = new int[n+1];
		dp[1] = 1;	
		for(int i=2;i<=n;i++) {		
			int min = Integer.MAX_VALUE;
			
				for(int j=1;j*j<=i;j++) {
					min = Math.min(min, dp[i-(j*j)]);		
				}
					
		dp[i] = min+1;
				
		}
				
		return dp[n];
	}
	
	// Memoization approach - Complexity  - [n], SC - O[2 x n]- Takes stack calls space as well
	public static int minSquares(int n, int dp[]) {
		if(n == 0) {
		return 0;
		}
		int minAns = Integer.MAX_VALUE;
		for(int i=1; i*i <= n;i++) {
		int currAns;
		if(dp[n-(i*i)] == -1){
		currAns = minSquares(n-(i*i),dp);
		dp[n-(i*i)] = currAns;
		} else {
		currAns = dp[n-(i*i)];
		}
		if(minAns > currAns) {
		minAns = currAns;
		}
		}
		int myAns = 1 + minAns;
		return myAns;
		}
	
	public static void main(String[] args) {
		int n= 41;
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++) {
		dp[i] = -1;
		}
		int ans = minSquares(n,dp);
		System.out.println(ans);
		}

}
