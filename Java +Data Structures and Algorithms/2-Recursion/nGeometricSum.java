// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
package bRecursion;

public class nGeometricSum {

	public static double findGeometricSum(int k){
		// Write your code here

		if (k==0) {
			return 1;
		}
		
		double ans = 1.00000/(Math.pow(2, k)) + findGeometricSum(k-1);
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
