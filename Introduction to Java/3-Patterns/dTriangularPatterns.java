/*   Pattern 1                     Pattern 2              Pattern 3
     1                             1                      1
     12                            23                     23
     123                           345                    456
     1234                          4567                   78910
 */

package cPatterns;
import java.util.*;
public class dTriangularPatterns {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i=1; i <=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		for (int i=1; i <=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+j-1);
			}
			System.out.println();
		}
		
		int x=1;
		for (int i=1; i <=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}

	}

}
