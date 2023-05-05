package j2DArrays;

public class fPrintSpiral {

	
	public static void spiralPrint(int matrix[][]){
		int m = matrix.length;
		
		if (m==0) {
			System.out.println("");
			return;
		}
		int n = matrix[0].length;
		
		
		int rs = 0;            // Row start index
		int re = n-1;          // Row end index
		int cs = 0;            // Column start index
		int ce= m-1;           // Column end index
		
		int total = m*n;       // total number of elements to keep a track
		int count = 0;
		while (count < total) {
			// print first row from row start to row end
			for (int i = rs; i <=re ; i++) {          
				System.out.print(matrix[cs][i]+ " ");  count++; if (count >=total) { return;}
			}
			cs ++;           // Increment column start by 1 because we will never come again to this column
			
			// print last column from updated column start to column end
			for (int i =cs ; i <= ce ; i++ ) {
				System.out.print(matrix[i][re]+ " ");       count++; if (count >=total) { return;}
			}
			re--;           // Decrease row end as last column is done
			
			for (int i = re ; i >=rs; i--) {
				System.out.print(matrix[ce][i] + " ");  count++; if (count >=total) { return;}
			} ce--;        // Decrease the column end
			
			for (int i = ce ; i >=cs; i--) {
				System.out.print(matrix[i][rs]+ " ");   count++; if (count >=total) { return;}
			} rs++;       // Increase row start
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
