//Pattern for N = 4
//4444
//4444
//4444
//4444

package cPatterns;
import java.util.Scanner;

public class bSquarePattern {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int i=1;
		while (i<=n) {
			int j=1;
			while (j<=n) {
				System.out.print(n);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
