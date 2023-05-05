package eTest1;

import java.util.Arrays;

public class bMaxProfit {

	public static int maximumProfit(int budget[]) {
		
		Arrays.sort(budget);
		int n = budget.length;
		
		int max= Integer.MIN_VALUE;
		
		for (int i =0; i < budget.length; i++) {
			int profit = budget[i] * (n-i);
			if (profit > max) {
				max = profit;
			}
			
		}
		return max;
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
