// You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. 
// Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
package dOperatorsAndForLoop;
import java.util.Scanner;
public class mCheckCharacterSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();	
		
		int[] num = new int[n];
		for (int i=0; i<n; i++) {
			num[i] = scn.nextInt();
		}
		if(n==1){
            System.out.println("true");
            return;
        }
		int i=1;
		while (n>1 && num[i]<=num[i-1] && i <n) {
			if (num[i]==num[i-1]) {                 // If two numbers are same
				System.out.println("false");
				return;
			}
			if (i==n-1) {                             // If reached last number
				 System.out.println("true");
				 return;
			 }
			
			i++;
		}
		
		while (n >1 && num[i]>=num[i-1] && i<n) {
			if (num[i]==num[i-1]) {
				System.out.println("false");
				return;
			}
			 if (i==n-1) {
				 System.out.println("true");
				 return;
			 }
			i++;
		}
		System.out.println("false");
		
		
	}

}
