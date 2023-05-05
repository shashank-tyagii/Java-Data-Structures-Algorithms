// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

package bConditionalAndLoops;
import java.util.Scanner;

public class lPowerOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int i =1;
		int power = 1;
		while (i<=n) {
			power = power *x;
			i++;
		}
		
		System.out.println(power);
	}

}
