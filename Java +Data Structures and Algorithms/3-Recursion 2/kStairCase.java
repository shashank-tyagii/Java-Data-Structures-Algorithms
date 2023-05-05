// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.

package cRecursion2;

public class kStairCase {

	public static int staircase(int n){
		 
		if (n==0) {        // Right path
			return 1;
		} else if(n<0){   // This is not the right path
            return 0;
        }
		
		int n1 = staircase(n-1);
		int n2 = staircase(n-2);
		int n3 = staircase(n-3);
		
		return n1+n2+n3;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
