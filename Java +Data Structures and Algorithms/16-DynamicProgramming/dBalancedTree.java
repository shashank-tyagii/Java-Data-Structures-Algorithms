package gDynamicProgramming;

import java.util.HashMap;

public class dBalancedTree {

	public static long balancedBTs(long n){ 
		
		if (n <= 1) { return 1; } 
		
		int mod =(int) Math.pow(10, 9) + 7; 
		
		long x = balancedBTs(n - 1); 
		long y = balancedBTs(n - 2); 
		
		long temp1 = (x * x) % mod; // Number of BTs made by attaching subtrees of height (n - 1) at both sides of root 
		long temp2 = (2 * x * y) % mod; // Number of BTs made by attaching subtrees of heights (n - 1) and (n - 2) at each side of root 
		
		long ans = (temp1 + temp2) % mod; 
		return ans; 
		}
	
	
	public static int balancedBTs(int height){ 
		
		if(height == 0){ return 1; } 
		
		int arr[] = new int[height + 1]; 
		arr[0] = arr[1] = 1; 
		int mod = (int) Math.pow(10, 9) + 7; 
		
		for(int i = 2; i <= height; i++){ 
			// Cast to long 
			long temp1 = (long) (arr[i- 1]) * arr[ i - 1]; 
			temp1 = temp1 % mod; 
			// Cast to long 
			long temp2 = 2 * (long) (arr[i - 1]) * arr[ i - 2]; 
			temp2 = temp2 % mod; 
			
			arr[i] = (int) (temp1 + temp2) % mod; 
			
		} return arr[height]; 
		}
	}
	
