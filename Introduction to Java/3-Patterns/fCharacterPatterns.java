/*  Pattern 1                   Pattern 2
    ABCD                        ABCD
    ABCD                        BCDE
    ABCD                        CDEF
    ABCD                        DEFG
 */

package cPatterns;
import java.util.Scanner;
public class fCharacterPatterns {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=1; i <=n;i++) {
			for (int j=0;j<n;j++) {
				 int c = 'A'+j;
				System.out.print((char) c);
			}
			System.out.println();
		}
		
		for (int i=0; i <n;i++) {
			for (int j=0;j<n;j++) {
				 int c = 'A'+j +i;
				System.out.print((char) c);
			}
			System.out.println();
		}
	}

}