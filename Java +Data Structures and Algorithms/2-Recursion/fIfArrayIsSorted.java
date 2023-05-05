// Check if an array is sorted or Not
package bRecursion;
public class fIfArrayIsSorted {

	public static boolean checkSorted (int[] arr) {
		
		if (arr.length <= 1) {
			return true;
		}
		
		boolean ans2 = arr[1] > arr[0] ? true : false;      // If first two elements are sorted or not
		if (ans2 == false) {
			return false;
		}
		
		int[] temp = new int[arr.length-1];           // Create a new array with n-1 space
		for (int i =1; i < arr.length; i++) {
			temp[i-1] = arr[i];                      // remove first element
		}
		boolean ans1 = checkSorted(temp);
		return ans1;
		
	}
	
	public static void main(String[] args) {
		int[] array = {0,2,3,4,5};
		boolean ans = checkSorted(array);
		System.out.println(ans);

	}

}
