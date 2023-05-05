// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

package dOperatorsAndForLoop;

import java.util.Scanner;

public class iReverseOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int num=n;
		int revNum =0;
		while (num>0) {
			int digit = num%10;
			num = num/10;
			revNum = revNum *10 + digit;
		}
		System.out.println(revNum);
	}

}
