/*       ****                 4444
	     ***                  333
	     **                   22
	     *                    1
 */

package cPatterns;
import java.util.Scanner;
public class iInvertedTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=1; i<=n;i++) {
			for (int j =1; j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		for (int i=1; i<=n;i++) {
			for (int j =1; j<=n-i+1;j++) {
				System.out.print(n-i+1);
			}
			System.out.println();
		}
	}

}
