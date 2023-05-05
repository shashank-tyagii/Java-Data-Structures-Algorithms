package bRecursion;

public class iFirstIndexOfNumber {

	public static int firstIndex(int input[], int x, int startIndex) {
		
		if (startIndex == input.length) {
			return -1;
		}
		
		if ( x == input[startIndex]) {
			return startIndex;
		}
		
		int idx = firstIndex(input, x, startIndex+1);
		
		return idx;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
