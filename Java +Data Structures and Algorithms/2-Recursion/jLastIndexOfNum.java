package bRecursion;

public class jLastIndexOfNum {

	public static int lastIndex(int input[], int x) {  // Helper
		int i = lastIndex(input, x, input.length-1);
        return i;
	}
    public static int lastIndex(int input[], int x, int startIndex) {
		
		if (startIndex <0) {
			return -1;
		}
		
		if ( x == input[startIndex]) {
			return startIndex;
		}
		
		int idx = lastIndex(input, x, startIndex-1);
		
		return idx;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
