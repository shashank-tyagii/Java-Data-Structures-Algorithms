// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
package bRecursion;

public class hCheckNumberInArray {

	public static boolean checkNumber(int input[], int x) {     // Method 1
		if (input.length == 0) {
			return false;
		}
		if (x == input[0] ) {    // If first element is the number
			return true;
		}
		int[] temp = new int[input.length-1];           // Create a new array with n-1 space
		for (int i =1; i < input.length; i++) {
			temp[i-1] = input[i];                      // remove first element
		}
		boolean ans = checkNumber(temp, x);
		return ans;
	}
	
	public static boolean checkNumber2(int input[], int x, int startIndex) {   // Method 2
		if (startIndex == input.length) {
			return false;
		}
		
		if (input[startIndex] == x) {
			return true;
		}
		
		boolean ans = checkNumber2(input, x, startIndex+1);
		return ans;
		
	}
	public static boolean checkNumber2(int input[], int x) {   // Helper function
		return checkNumber2(input, x, 0);
	}
	
	
	public static void main(String[] args) {
		int[] array = {0,2,3,4,5};
		boolean ans = checkNumber(array, 0);
		System.out.println(ans);

}
}
