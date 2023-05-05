// Combination using factorial function

package fFunctionsAndVariables;
import java.util.Scanner;
public class aPermutation_nPr {
	
	public static int factorial(int n) {
		int ans = 1;
		for (int i=1; i<=n; i++) {
			ans *=i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		int output = factorial(n)/(factorial(r)* factorial(n-r));
		
		System.out.println(output);
		}

}
