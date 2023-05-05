
// Break and continue functions
package dOperatorsAndForLoop;

public class eBreak_continue {

	public static void main(String[] args) {
		// Break
		for(int i = 0; i < 2; i = i + 1) {
		     for(int j = 0; j < 2; j = j + 1) {
		          if (j == 1)
		              break;
		          System.out.println(j +" ");        //  Output -  0  0
		      }
		 } 
		
		
		for (int i = 1; i<=10; i++) {
			if (i==5) {
				continue;                  // Skip 5
			}
			System.out.println(i);
		}
	}

}
