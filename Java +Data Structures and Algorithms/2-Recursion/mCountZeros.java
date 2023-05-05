//Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
package bRecursion;

public class mCountZeros {

    
    public static int countZerosRec(int input){
        int x = countZerosRec(input,0);
        return x;
    }
    
	public static int countZerosRec(int input, int count){
		// Write your code here
        	
		if (input <10 ) {
            if (input == 0){
                return count+1;
            } else {
                return count;
            }
			
		}
		
		int lastDigit = input%10;
		input = input/10;
        int ans;
		if (lastDigit == 0) {
			ans = countZerosRec(input, count+1);
		} else {
			ans = countZerosRec(input, count);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		int n = countZerosRec(30056);
		System.out.println(n);

	}

}
