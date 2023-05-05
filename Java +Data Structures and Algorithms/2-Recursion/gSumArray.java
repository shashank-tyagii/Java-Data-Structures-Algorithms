// Given an array of length N, you need to find and return the sum of all elements of the array.
package bRecursion;
public class gSumArray {

	public static int sum(int input[]) {                // Method 1
		if (input.length == 0) {
			return 0;
		}
		
		int[] temp = new int[input.length-1];
		for (int i =0; i < input.length-1; i++) {
			temp[i] = input[i];
		}
		
		int sum = input[input.length-1] + sum(temp) ;
		return sum;
		
	}
	public static int sum2(int[] input, int startIndex) {          // method 2
		if (startIndex == input.length) {
			return 0;
		}
		
		return input[startIndex] + sum2(input,startIndex+1);
	}
	
	public static void main(String[] args) {
		int[] array = {0,2,3,4,5};
		int ans = sum(array);
		int ans2 = sum2(array,0);
		System.out.println(ans);
		System.out.println(ans2);
	}

}
