// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

package dOperatorsAndForLoop;
import java.util.Scanner;
public class hArithmeticProgressionTerm {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		for (int i=1; i<=n;i++) {
			int term = 3*i+2;
			if (term%4 ==0) {
				n++;                   // To increase number of terms
				continue;
			}
			System.out.print(term + " ");
		}
	}

}
