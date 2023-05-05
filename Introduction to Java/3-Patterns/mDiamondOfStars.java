/*			  *
			 ***
			*****
			 ***
              *                */
package cPatterns;
import java.util.Scanner;
public class mDiamondOfStars {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int mid = (n/2)+1;
		
		for(int i=1; i<=mid;i++) {
			
			for(int j=1; j<=mid-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		for(int i = mid+1 ; i<=n; i++) {
			for (int j=1 ; j<=i-mid ; j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<= n-2*(i-mid); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
