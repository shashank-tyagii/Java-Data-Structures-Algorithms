// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.

package gArrays;
public class dArrangeNumbers {

	 public static void arrange(int[] arr, int n) {
	    	int i =0;
	        int j =n-1;
	        int num = 0;
	        while (i<=j){
	            if (i==j){
	                arr[i] = ++num;
	                return;
	            }
	            arr[i] = ++num;
	            arr[j] = ++num;
	            i++;
	            j--;
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
