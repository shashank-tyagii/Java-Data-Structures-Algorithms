// Given a decimal number (integer N), convert it into binary and print.
package dOperatorsAndForLoop;

import java.util.Scanner;

public class kDecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int num =n;
		long binary = 0;
		long factor =1;
		while (num>0) {
			int rem = num %2;
			num = num/2;
			binary = binary + rem * factor;
			factor *=10;
		}
		
		System.out.println(binary);
	}

}
