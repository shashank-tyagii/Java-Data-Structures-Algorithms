// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
package gArrays;

public class iFindUniqueNumber {

	 public static int findUnique(int[] arr){
		 boolean[] isFound = new boolean[arr.length];
		 int num =0; 
			for (int i=0; i<arr.length -1; i++) {
				if (isFound[i] == false ) {
					num = arr[i];
				for (int j=i+1; j<arr.length ; j++) {
					if (arr[i] == arr[j]) {
						isFound[i] = true;
						isFound[j] = true;
						break;
					}
				} }
				
			}
			return num;
			
	    }
	public static void main(String[] args) {
		
		 int[] arr={1,3,1,3,6,6,7,10,7};
		  int num = findUnique(arr);
		  System.out.println(num);

	}

}
