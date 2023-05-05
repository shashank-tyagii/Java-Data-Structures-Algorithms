//Write a program that asks the user for a number N and a choice C. 
//And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
package dOperatorsAndForLoop;

import java.util.Scanner;
public class gSumOrProduct {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int c = scn.nextInt();
		
		if (c== 1) {
			//Addition code
			int sum =0;
			for (int i=1; i<=n;i++) {
				sum +=i;
			}
			System.out.println(sum);
		} else if (c==2) {
			// Multiplication code
			int product = 1;
			for (int i=1; i<=n;i++) {
				product *=i;
			}
			System.out.println(product);
		} else {
			System.out.println("-1");
		}
	}

}
