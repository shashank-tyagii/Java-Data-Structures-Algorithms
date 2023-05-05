// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
package bRecursion;

public class lMultiplicationMxN {

	public static int multiplyTwoIntegers(int m, int n){
		if (m ==1 || n==1) {
			if (m==1){ return n;}
            else return m;
		} 
		
	   int product = m-1 + n-1 +1 + multiplyTwoIntegers(m-1, n-1);
	   System.out.println(product);
	   return product;
	}
	
	public static void main(String[] args) {
		multiplyTwoIntegers(7, 4);

	}

}
