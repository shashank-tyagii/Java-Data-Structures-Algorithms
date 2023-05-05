// For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.

package j2DArrays;
public class eWavePrint {

	public static void wavePrint(int mat[][]){
		int m = mat.length;
        
        if (m==0){                // Only row because, if row doesn't exist, then column obiously don't exist
            System.out.print("");
            return;
        }
        
		int n = mat[0].length;
        
        
		 for (int j = 0; j < n; j++) {
 
              if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                  System.out.print(mat[i][j] + " ");
                }
              }
              else {
                for (int i = m - 1; i >= 0; i--) {
                  System.out.print(mat[i][j] + " ");
                }
              }
    }

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
