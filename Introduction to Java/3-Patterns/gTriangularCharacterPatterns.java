/*  Pattern 1                    Pattern 2                     Pattern 3
 	A                            A                             D
 	BB                           BC                            CD
 	CCC                          CDE                           BCD
 	DDDD                         DEFG                          ABCD
 */
package cPatterns;
import java.util.Scanner;
public class gTriangularCharacterPatterns {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=0; i <n;i++) {
			for (int j=0;j<=i;j++) {
				 int c = 'A'+i;
				System.out.print((char) c);
			}
			System.out.println();
		}
		
		
		for (int i=0; i <n;i++) {
			for (int j=0;j<=i;j++) {
				 int c = 'A'+i+j;
				System.out.print((char) c);
			}
			System.out.println();
		}
		
		for (int i=0; i <n;i++) {
			for (int j=0;j<=i;j++) {
				 int c = 'A'+n-1-i+j;
				System.out.print((char) c);
			}
			System.out.println();
		}
	}

}
