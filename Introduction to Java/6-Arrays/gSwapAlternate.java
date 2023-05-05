// Swap alternate
// 9 3 6 12 4 32 ---->> 3 9 12 6 32 4

package gArrays;
import java.util.Scanner;
public class gSwapAlternate {

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}
	 public static void swapAlternate(int arr[]) {
	    	
	        for (int i =0; i < arr.length; i++){
	            if (i== arr.length-1){
	                return;
	            }
	            int temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	            i++;
	        }
	    }
	
	public static void main(String[] args) {
		int[] arr={1,4,7,6,5};
	    swapAlternate(arr);
	    print(arr);

		
	}

}