// Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
package j2DArrays;
public class gPrint2DarrayMultiples {

	public static void print2DArray(int input[][]) {
		
		int rows = input.length;
		
		if (rows == 0) {
			System.out.println("");
			return;
		}
		
		for (int i =0; i < input.length; i++) {
			
			for (int k = input.length- i; k > 0; k--) {
				
				for (int j =0; j < input[i].length; j++) {
					System.out.print(input[i][j] + " ");
				}
			}
			
			
			System.out.println();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
