// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).

package bRecursion;
public class kAllIndexOfNum {

	public static int[] allIndexes(int input[], int x) {
	       
        int[] output =  allIndexes(input, x,0);
        
        return output;
		
	}
   
	public static int[] allIndexes(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return new int[0];
		}
		
		int[] temp = allIndexes(input, x, startIndex+1);
		
        int[] output;
        
        if (x == input[startIndex]){
            output = new int[temp.length +1];
            output[0] = startIndex;
            
            for (int i = 0; i< temp.length ; i++){
                output[i+1] = temp[i];
            }
            
        } else{
            output = temp;
        }
        return output;
        
	}
	public static int[] allIndices(int[] arr, int x, int idx, int count) {
	    if (idx == arr.length) {
	      return new int[count];                      // Create an array of total terms equal to x
	    }

	    int[] iarr;

	    if (arr[idx] == x) {
	      iarr = allIndices(arr, x, idx + 1, count + 1);
	      iarr[count] = idx;                        // While returning from base case, add both terms
	    } else {
	      iarr = allIndices(arr, x, idx + 1, count);
	    }

	    return iarr;
	  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
