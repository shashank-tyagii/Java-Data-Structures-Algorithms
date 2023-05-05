// For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
package j2DArrays;
public class bRowWiseSum {

	public static void rowWiseSum(int[][] mat) {
	
		for (int i =0; i < mat.length; i++) {
			int sum =0;
			for (int j=0; j <mat[i].length ; j++) {
				sum = sum + mat[i][j];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{2,4,6,8}};
		rowWiseSum(arr);
	}

}
