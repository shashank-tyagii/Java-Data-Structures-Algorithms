package bRecursion;

import java.util.Scanner;

public class aFactorial {

	public static int fact (int n) {
		if (n==0 ) {
			return 1;
		} else if (n <0) {
			return -1;
		}
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = fact(n);
		System.out.println(ans);

	}

}
