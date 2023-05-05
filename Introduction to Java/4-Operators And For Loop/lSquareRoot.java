// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.

package dOperatorsAndForLoop;
import java.util.Scanner;
public class lSquareRoot {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int output =1;
		for (int i =1; i <=n; i++) {
			int square = i*i;
			if (square > n) {
				break;
			}
			output = i;
			
		}
		System.out.println(output);
	}

}
