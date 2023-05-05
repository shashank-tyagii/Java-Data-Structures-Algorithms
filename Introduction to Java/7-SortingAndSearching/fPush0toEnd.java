//ou have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.

package hSortingAndSearching;
public class fPush0toEnd {

	public static void pushZerosAtEnd(int[] arr) {
    	// Method 1
		 /*for (int i = arr.length-2; i>=0; i--) { 
			if (arr[i] == 0) {
			for (int j = i; j < arr.length-1; j++) {
				if (arr[j+1] == 0) {
					break;
				}
			              swap (arr,j,j+1 );
			}
			}
		} */
		
		//Method 2
		
		int i =0; int k = 0;
		while (i<arr.length) {
			if (arr[i] == 0) {   // Skip zero elements
				
			} else {
				arr[k] = arr[i];
				k++;             // replace kth element of the array with non zero element
			}
			i++;
		}
		while (k<arr.length) {
			arr[k] =0;
			k++;
		}
		
		
    }
	
	public static void main(String[] args) {
		int [] arr = {1,0,0,5,6,0,9,4,0,1};
		pushZerosAtEnd(arr);
		print(arr);
	}
	public static void swap (int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}

}
