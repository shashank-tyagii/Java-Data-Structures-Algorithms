

package cPatterns;

import java.util.Scanner;

public class cSquarePatterns {

	public static void main(String[] args) {
		
	// Pattern 1             Pattern 2             Pattern 3           
	/* 1111                  1234                  4321
	 * 2222                  1234                  4321
	 * 3333                  1234                  4321
	 * 4444                  1234                  4321
	 */

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int i=1;
		
		while(i<=n) {
			int j=1;
			while (j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		i=1;
		while (i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		i=1;
		while (i<=n) {
			int j=0;
			while(j<n) {
				System.out.print(n-j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
