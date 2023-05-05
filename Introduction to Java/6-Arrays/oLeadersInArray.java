// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// 13 17 5 4 6 -->>> 17, 6
package gArrays;
public class oLeadersInArray {

	public static void leaders(int[] input) {
	
		for (int i =0; i < input.length-1; i++) {
			int max = input[i];
			boolean isBig = false;
			for (int j = i+1; j < input.length; j++) {
				
				if (input[j] > max) {
					isBig = true;
					break;
				}
			}
			 if (isBig == false) {
				 System.out.print(max+ " ");
			 }
			
		}
		System.out.print(input[input.length-1]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
