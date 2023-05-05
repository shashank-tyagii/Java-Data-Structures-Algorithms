// Given an array A of size n and an integer K, return all subsets of A which sum to K.
// Note subset can be of any size, if it was pair, then things would have been different
package cRecursion2;
public class mSubsetsArraySum {
	
public static int[][] subsetsSumK(int input[], int n, int start) {
		
        if (n == 0) {
			return new int[1][0];             // n==0 mean,  we have got an array exists whose sum is equal to n - > so, return array with one row
		}
		if (start == input.length) {          // no array found, return empty
			return new int[0][0];
		}
        if (n <0){
            return new int[0][0];
        }
		
		int first = input[start];
	
		int[][] smallSolution1 = subsetsSumK(input, n-first, start+1);      // arrays including this first number
		int[][] smallSolution2 = subsetsSumK(input, n, start+1);            // Arrays after this number which have sum = n
		
		
		 int[][] ans=new int[smallSolution1.length + smallSolution2.length][];
	        int k=0;
	        for(int i=0;i<smallSolution2.length;i++){             // Copy all arrays from subsets results
	            ans[i]=new int[smallSolution2[i].length];
	            for(int j=0;j<smallSolution2[i].length;j++){
	                ans[i][j]=smallSolution2[i][j];
	            }
	            k++;
	        }
	        for(int i=0;i<smallSolution1.length;i++)              // add first element to all arrays
	        { ans[k+i]=new int[smallSolution1[i].length+1];
	          ans[k+i][0]=first;
	            for(int j=1;j<=smallSolution1[i].length;j++)
	            {
	                ans[i+k][j]=smallSolution1[i][j-1];
	            } 
	       
	        }
	        return ans;

	}
	
	
	public static void main(String[] args) {
		
	int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4};
	int[][] sets = subsetsSumK(arr, 7, 0);
	
	for (int i =0; i < sets.length; i ++) {
		for (int j=0; j <sets[i].length; j++) {
			System.out.print(sets[i][j] + " ");
		}
		System.out.println();
	}

	}

}
