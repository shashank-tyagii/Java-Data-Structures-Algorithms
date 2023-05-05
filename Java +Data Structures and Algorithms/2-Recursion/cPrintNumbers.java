// Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
package bRecursion;
import java.util.Scanner;
public class cPrintNumbers {

	public static void print(int n){            // Let's say n=6
		if (n==0) {
			return;
		}
		print (n-1);                            // Faith is this will print upto n-1 i.e 1,2,3,4,5           
		System.out.print(n + " ");              // This will print 6
	
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		print(n);
	}

}
