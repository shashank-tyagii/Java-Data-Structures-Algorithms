/*
1
21
321
4321
 */

package cPatterns;
import java.util.Scanner;
public class eReverseNumberPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=1; i <=n;i++) {
			for (int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
