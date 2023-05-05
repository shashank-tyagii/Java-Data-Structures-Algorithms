// Print any term on Fibonacci series

package bRecursion;
import java.util.Scanner;
public class eFibonacciNumber {

	public static int FibonacciTerm (int n) {
		if ( n ==2) {
			return 1;
		} else if (n==1) {
			return 0;
		}
		
		int ans = FibonacciTerm(n-1) + FibonacciTerm (n-2);
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = FibonacciTerm(n);
		System.out.println(ans);
	}

}
