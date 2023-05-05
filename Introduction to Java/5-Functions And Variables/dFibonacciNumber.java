// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.

package fFunctionsAndVariables;

import java.util.Scanner;

public class dFibonacciNumber {

	public static boolean checkMember(int n){
		if (n == 0 || n==1){
            return true;
        }
		int a = 0;
		int b = 1;
		int c = a+b;
		while (c<=n) {
			if (c==n) {
				return true;
			}
			c= a+b;
			a=b;
			b=c;
		} return false;

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		boolean output = checkMember(num);
		System.out.println(output);
		
	}

}
