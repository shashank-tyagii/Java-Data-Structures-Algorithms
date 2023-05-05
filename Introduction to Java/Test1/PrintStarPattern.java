/*
		432*
		43*1
		4*21
		*321
 */

package eTest1;
import java.util.Scanner;
public class PrintStarPattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();	
		
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >=1; j--) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
	}

}
