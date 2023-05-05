// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
package bRecursion;
import java.util.Scanner;

public class bPower {

	public static int power(int x, int n) {
		if (n== 0) {
			return 1;
		}
		
		int ans;
		if (n%2 == 0) {
			ans = x * power (x, n/2) * power (x,(n/2) - 1);      // Time complexity is log n 
		} else {
			ans = x * power (x,n/2) * power (x,n/2);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int ans = power(x,n);
		System.out.println(ans);
	}

}
