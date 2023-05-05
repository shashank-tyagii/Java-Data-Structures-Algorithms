// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
package dOperatorsAndForLoop;
import java.util.Scanner;
public class fAllPrimeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		boolean prime = true;
		
		for (int i =2; i<=n;i++) {
			prime = true;
			for (int j =2; j<i;j++) {
				if (i%j ==0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
			}
		}
	}

}
