package gDynamicProgramming;

public class hMinCostPath {

	public static int minCostPath(int[][] input) {
		int[][] dp = new int[input.length][input[0].length];
		return minCostPath(input, 0, 0);
	}
	// Recursion , time complexity -- o[n^3]
	public static int minCostPath(int[][] input, int i, int j) {
		// i =  row index
		// j =  column index
		if (i == input.length-1 && j == input[0].length-1) {
			return input[i][j];
		}
		if ( i > input.length -1 || j > input[0].length - 1) {
			return Integer.MAX_VALUE;
		}
		
		int min1 = minCostPath(input, i++, j);
		int min2 = minCostPath(input, i, j++);
		int min3 = minCostPath(input, i++, j++);
		
		return input[i][j] + Math.min(min1, Math.min(min2, min3));
	}
	
	// Memoization -- o[m *n]
	public static int minCostPathM(int arr[][]){
		int m = arr.length;
		int n = arr[0].length;
		int storage[][] = new int[m][n];
		for(int i = 0; i < m ; i++){
			for(int j = 0; j < n; j++){
				storage[i][j] = -1;
			}
		}
		return minCostPathM(arr, 0, 0, storage);
	}

	private static int minCostPathM(int[][] arr, int i, int j, int[][] storage) {
		int m = arr.length;
		int n = arr[0].length;

		if(i >= m || j >= n){
			return Integer.MAX_VALUE;
		}

		if(i == m - 1 && j == n - 1){
			storage[m - 1][n - 1] = arr[i][j];
			return storage[i][j];
		}

		if(storage[i][j] != -1){
			return storage[i][j];
		}

		int op1 = minCostPathM(arr, i , j + 1, storage);
		int op2 = minCostPathM(arr, i + 1 , j + 1, storage);
		int op3 = minCostPathM(arr, i + 1, j, storage );
		storage[i][j] = arr[i][j] + Math.min(op1,  Math.min(op2, op3));
		return storage[i][j];
	}
	
	
	public  static int minCostPathDP(int arr[][]){
		int m = arr.length;
		int n = arr[0].length;
		int storage[][] = new int[m][n];
		
		storage[m - 1][n - 1] = arr[m - 1][n - 1];
		// Fill Last Row
		for(int j = n - 2; j >= 0; j--){
			storage[m - 1][j] = storage[m - 1][j + 1] + arr[m - 1][j];
		}
		// Fill Last Column
		for(int i = m - 2; i >= 0; i--){
			storage[i][n - 1] = storage[i + 1][n - 1] + arr[i][n - 1];
		}
		
		for(int i = m - 2; i >= 0; i--){
			for(int j = n - 2; j >= 0; j--){
				storage[i][j] = arr[i][j] +  Math.min(storage[i][j + 1], 
						Math.min(storage[i + 1][j + 1], storage[i + 1][j]));
			}
		}
		return storage[0][0];
	}
}
