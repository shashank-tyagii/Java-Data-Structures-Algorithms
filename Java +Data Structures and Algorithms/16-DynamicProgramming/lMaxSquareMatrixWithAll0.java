package gDynamicProgramming;

public class lMaxSquareMatrixWithAll0 {

	public static int findMaxSquareWithAllZeros(int[][] input){
        
		 int max = 0;
			if (input.length == 0){
				return 0;
			}
			int[][]dp = new int[input.length][input[0].length];
			for (int i = 0; i < input.length; i++) {
				if (input[i][0] == 0) {
					dp[i][0] = 1;
					max = 1;
				}
			}
			
			
			for (int j =0; j < input[0].length; j++) {
				if (input[0][j] == 0) {
					dp[0][j] = 1;
					max = 1;
				}
			}
		
		for ( int i = 1; i < input.length; i++) {
			for (int j=1; j <input[0].length; j++) {
				if (input[i][j] == 0) {
					int op1 = dp[i-1][j-1];
					int op2 = dp[i-1][j];
					int op3 = dp[i][j-1];
					dp[i][j]= 1 + Math.min(op2, Math.min(op1, op3));
					
					if (dp[i][j] > max) {
						max = dp[i][j];
					}
				}
				
			 
			}
		}
		
		return max;
		
		}
	
	
	

}
