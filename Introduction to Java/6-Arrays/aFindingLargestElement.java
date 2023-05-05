// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
package gArrays;
import java.util.Scanner;
public class aFindingLargestElement {

	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] input = new int[n];
		for (int i =0; i<n; i++) {
			input[i]= scn.nextInt();
		}
		return input;
	}
	
	public static int largestInArray(int[] arr) {
		int largest = arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		
		int[] arr= takeInput();
		int max = largestInArray(arr);
		System.out.println(max);
		
		
	}

}
