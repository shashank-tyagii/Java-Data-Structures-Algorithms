/*				   1
				  232
				 34543
				4567654                */
package cPatterns;
import java.util.Scanner;

public class lNumbersIsocelesTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=1; i<=n;i++) {
			
			for (int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i;j++) {
				System.out.print(i+j-1);
			}
			for (int j=1; j<i;j++) {
				System.out.print(2*i-1-j);
			}
			
			System.out.println();
		}
		
	}
}

