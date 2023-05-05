package cRecursion2;

public class iBinarySearch {

	 public static int binarySearch(int[] arr, int x) {
	    	int idx =binarySearch(arr,x,0,arr.length-1);
	        return idx;
	    }
	    
	    public static int binarySearch(int[] arr, int x, int start, int end) {
	    	
			if (start > end) {
				return -1;
			}
		
			int mid = (start+end) / 2;
			int index;
			
			if (x == arr[mid]) {
	            return mid;
			} 
	        if (x > arr[mid]){
				return binarySearch(arr, x, mid+1, end);
			}
	        if (x< arr[mid]){
	        	return binarySearch(arr, x, start, mid-1);    
	        }
			
			return -1;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
