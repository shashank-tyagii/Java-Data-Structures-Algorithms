
// Write a program to print all the factors of a number other than 1 and the number itself.

package bConditionalAndLoops;
import java.util.Scanner;
public class kFactorsOfNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i =2;
		while (i <n) {
			if (n%i ==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
