// For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
package j2DArrays;
public class cLargestSumRowColumn {

	public static void findLargest(int mat[][]){
    	int max = Integer.MIN_VALUE;		
		int index = 0;
		String str = "row";
    if (mat.length == 0){
		 System.out.println(str+ " "+ index + " " + max);
        return;
    }
   
		for (int i =0; i < mat.length; i++) {
			int sumRow =0;
			for (int j=0; j <mat[i].length ; j++) {
				sumRow = sumRow+mat[i][j];
			}
			if (sumRow>max) {
				max = sumRow;
				index=i;
				str = "row";
			}
		}
		
		for (int i =0; i < mat[0].length; i++) {
			int sumRow =0;
			for (int j=0; j <mat.length ; j++) {
				sumRow = sumRow+mat[j][i];
			}
			if (sumRow>max) {
				max = sumRow;
				index=i;
				str = "column";
			}
		}
		
		System.out.println(str+ " "+ index + " " + max);		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
