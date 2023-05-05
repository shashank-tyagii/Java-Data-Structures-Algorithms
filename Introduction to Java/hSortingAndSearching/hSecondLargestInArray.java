// Find second largest in Array
package hSortingAndSearching;
public class hSecondLargestInArray {

	public static int secondLargestElement(int[] arr) {
		int largest1 = Integer.MIN_VALUE;
    	int largest2 = Integer.MIN_VALUE;
    	
    	for (int i= 0; i < arr.length; i++) {
    		if (arr[i] > largest1) {
                largest2= largest1;
    			largest1 = arr[i];
    		}
    		else if ((arr[i] > largest2) && (arr[i] <largest1)){
                largest2= arr[i];
            }
    	}
    	return largest2;//Your code goes here
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
