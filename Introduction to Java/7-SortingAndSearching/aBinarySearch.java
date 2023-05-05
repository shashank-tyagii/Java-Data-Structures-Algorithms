// Binary search for sorted arrays

package hSortingAndSearching;

public class aBinarySearch {

	public static int binarySearch(int[] arr, int x) {     // return Index
		int start = 0;
		int end = arr.length -1;
		while ( start <= end) {
            int mid = (start+end)/2;
			if ( x > arr[mid]){
				start = mid+1;
			} else if ( x < arr[mid]) {
				end = mid-1;
			} else {            // Found the element
                return mid;
            }
			
		}
		return -1;
    }
	public static void main(String[] args) {
		int[] arr = {1, 3 , 5 , 8, 10, 12, 15, 20};
		int x =4;
		int index = binarySearch(arr, x);
		System.out.println(index);
	}

}
