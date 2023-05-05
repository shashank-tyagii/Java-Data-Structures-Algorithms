package gDynamicProgramming;

public class k01Knapsack {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {

		  if(maxWeight==0||n==weights.length){
	            return 0;
	        }
	        if(weights[n]>maxWeight){
	            return knapsack(weights,values,n++,maxWeight);
	        } else{
	            return Math.max(values[n]+knapsack(weights,values,n++,maxWeight-weights[n]),
	                            knapsack(weights,values,n++, maxWeight));
	        }
	}
	
	 static int knapsackDP(int[] weight, int[] value, int n, int maxWeight) {

        int[] dp = new int[weight.length];
        return knapsack(weight, value ,maxWeight);

	 	}
	 
	 public static int knapsack(int[] weight,int value[],int maxWeight){

				int storagePrev[] = new int[maxWeight+1];
		        int storageCurrent[] = new int [maxWeight+1];
		        for(int i=1;i<value.length+1;i++){
		            for(int w = 1;w<maxWeight+1;w++){
		                if(weight[i-1]>w){
		                    storageCurrent[w] = storagePrev[w];
		                }
		                else { 
		                storageCurrent[w]= Math.max(storagePrev[w - weight[i-1]]+ value[i-1],storagePrev[w]);
		                }
		            }
		                storagePrev = storageCurrent ;
		                storageCurrent = new int[maxWeight+1];
		            
		        }
		        return storagePrev[maxWeight];
			}
	 
	 public static int knapsackI(int W, int val[], int wt[])  {

			 int n = val.length;
			 int[][] dp = new int[n+1][W+1];
	
			 for(int i=n-1; i>=0; i--) {
				 for(int w=0;w<=W;w++) {
	
					 int ans;
					 if(wt[i] <= w) {
						 int ans1 = val[i] + dp[i+1][w-wt[i]];
						 int ans2 = dp[i+1][w];
						 ans = Math.max(ans1, ans2);
					 }else{
						 ans = dp[i+1][w];
					 }
			 dp[i][w] = ans;
			 }
		 }
			 return dp[0][W];
}
}
