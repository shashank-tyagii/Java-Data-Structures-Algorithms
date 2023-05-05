/*
				1=1
				1+2=3
				1+2+3=6
				1+2+3+4=10
				1+2+3+4+5=15
 */
package cPatterns;
import java.util.Scanner;
public class pSumPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i=1; i<=n;i++) {
			int sum =0;
			for (int j=1; j<=i;j++) {
				sum = sum+j;
				System.out.print(j);
				if (j<i) {
					System.out.print("+");
				}
			}
			System.out.println("="+sum);
		}
	}
}
