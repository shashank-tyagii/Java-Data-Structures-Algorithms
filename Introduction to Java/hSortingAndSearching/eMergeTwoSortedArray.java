// Merge two sorted Arrays
package hSortingAndSearching;
public class eMergeTwoSortedArray {

	public static int[] merge(int arr1[], int arr2[]) {
    	
		int i =0,j=0;
		int size = arr1.length+arr2.length;
		int[] mArray = new int[size];
		int k =0;
		while(i < arr1.length && j <arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mArray[k] = arr1[i];
				
				i++; k++;
			} else if ( arr1[i]> arr2[j]) {
				mArray[k] = arr2[j];
				j++; k++;
			} 
		}
		while (i <arr1.length) {
			mArray[k] = arr1[i];
			i++; k++;
		}
		while (j <arr2.length) {
			mArray[k] = arr2[j];
			j++; k++;
		}
		return mArray;
		
    }
	
	
	public static void main(String[] args) {
		
		int[] first = {1,3,5,7,9};
		int[] second = {2,4,6,8,10};
		int[] output = merge(first,second);
		print(output);

	}
	
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}

}
