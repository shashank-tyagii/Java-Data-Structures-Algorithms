// Find the total sum of elements on both the diagonals and at all the four boundaries.

package j2DArrays;
public class dBoundariesSum {

	public static void totalSum(int[][] mat) {
		int sum =0;
		for (int i =0; i < mat.length; i++) {
			for (int j =0; j <mat[i].length; j++) {
				if (i ==0 || j==0 || i==j || i== mat.length-1 || j == mat[i].length-1|| i+j == mat.length-1) {
					sum = sum + mat[i][j];
				}
			}
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
