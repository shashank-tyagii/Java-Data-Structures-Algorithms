// Given the number 'n', find out and return the number of digits present in a number recursively.

package bRecursion;
import java.util.Scanner;
public class dNumberOfDigits {

	public static int count(int n){
		if (n==0) {
			return 0;
		}
		
		int count  = 1 + count(n/10);
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = count(n);
		System.out.println(ans);
	}

}
