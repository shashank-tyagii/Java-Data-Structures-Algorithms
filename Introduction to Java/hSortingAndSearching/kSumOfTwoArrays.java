package hSortingAndSearching;

public class kSumOfTwoArrays {

	 public static void sumOfTwoArrays(int arr1[], int arr2[]) {
		    
		    int n1 = arr1.length;
		    int n2 = arr2.length;
		 	int n3 = n1 > n2 ? n1 : n2 ;
		    int[] output = new int[n3+1];
		    int i = n1 - 1;
		    int j = n2 - 1;
		    int k = output.length - 1;
		    int carry = 0;
		    while (i >= 0 || j >= 0) {
		      int sum = carry;

		      if (i >= 0)
		        sum += arr1[i];

		      if (j >= 0)
		        sum += arr2[j];

		      carry = sum / 10;
		      int digit = sum % 10;
		      output[k] = digit;

		      i--;
		      j--;
		      k--;
		    }

		    if (carry > 0) {
		      output[k] = carry;
		    }
		    
		    print(output);
		  }
	 
	public static void main(String[] args) {
		int[] first = {9,3,5,7,9};
		int[] second = {2,4,6,8,10};
		sumOfTwoArrays (first,second);
	}
	public static void print(int input[]){
		int size = input.length;
		for(int i = 0; i < size; i++){
			System.out.print(input[i] +" ");
		}
		System.out.println();
		
	}

}
