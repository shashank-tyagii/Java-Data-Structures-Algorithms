// Rotate the array about pivot
// 1 2 3 4 5 6 7 about 2 times  = 3 4 5 6 7 1 2 
package hSortingAndSearching;
public class gRotateArray {

 public static void rotate(int[] arr, int d) {
	 int[] temp = new int[d];
	 
	 for  (int i = 0; i < arr.length; i++) {
		 if (i <d) {                  // copy few values to a temporary array
			 temp[i] = arr[i];
		 } else {
		 arr[i-d] = arr[i]; }
	 }
	 
	 for (int i =0; i<d; i++) {        // copy back
		 arr[arr.length-d+i] = temp[i];
	 }
	 
    }
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int x = 2;
		rotate(arr,x);
	}
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}

}
