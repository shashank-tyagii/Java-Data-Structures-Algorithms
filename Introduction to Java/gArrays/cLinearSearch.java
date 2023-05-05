// You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
// You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.

package gArrays;
import java.util.Scanner;
public class cLinearSearch {

	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] input = new int[n];
		for (int i =0; i<n; i++) {
			input[i]= scn.nextInt();
		}
		return input;
	}
	
	public static int searchIndex (int[] arr, int num) {
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int[] index = new int[t];
		for (int i =0; i<t;i++) {
			int[] arr = takeInput();
			int num = scn.nextInt();
			index[i] = searchIndex(arr, num); 
		}
		
		for (int i =0; i<t; i++) {
			System.out.println(index[i]);
		}
		
		}

	}

