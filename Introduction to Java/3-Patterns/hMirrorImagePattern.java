/*  Pattern 1                Pattern 2
		    *                        1
		   **                       12
		  ***                      123
		 ****                     1234
 */


package cPatterns;
import java.util.Scanner;
public class hMirrorImagePattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//Pattern 1
		for (int i=1; i <=n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1 ;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Pattern 2
		for (int i=1; i <=n;i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1 ;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
