/*
			1357
			3571
			5713
			7135
 */
package cPatterns;
import java.util.Scanner;
public class qOddSquare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		
		for (int i=1; i<=n ; i++) {
			for (int j =i; j<=n;j++) {
				System.out.print(2*j-1);
			}
			for (int j=1; j<i;j++) {
				System.out.print(2*j-1);
			}
			System.out.println();
		}
		
	}

}
