/*
					 5
					*
					*1*
					*121*
					*12321*
					*1234321*
					*123454321*
					*1234321*
					*12321*
					*121*
					*1*
					*

 */

package cPatterns;
import java.util.Scanner;
public class nHalfDiamondPattern {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		System.out.println("*");
		for (int i=1; i<=n;i++) {
			System.out.print("*");
			
			for (int j=1; j<=i;j++) {               //1234
				System.out.print(j);
			}
			
			for (int j= i-1 ; j>=1;j--) {           //321
				System.out.print(j);
			}
			
			System.out.println("*");
		}
		
		for (int i=n+1; i<=2*n-1;i++) {
			System.out.print("*");
			
			for (int j=1; j<=2*n-i; j++) {
				System.out.print(j);
			}
			for (int j= 2*n-i-1; j>=1;j--) {
				System.out.print(j);
			}
			
			System.out.println("*");
			
		}
		System.out.println("*");

	}

}
