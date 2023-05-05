package cRecursion2;

public class hPrintKeypad {

	public static void printKeypad(int input, String output){
		
		if (input == 0 || input == 1) {
			System.out.println(output);
			return;
		}
		
		char[][] helper = {{}, {}, {'a','b','c'},{'d','e','f'}, {'g','h','i'}, {'j','k','l'} , {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
		
		int lastDigit = input%10;
		char[] temp = helper[lastDigit];
		
		for (int i =0 ; i < temp.length; i++) {
			
		printKeypad(input/10, output + temp[i] );
		
}
	}
	
	
	public static void main(String[] args) {
		printKeypad(23, "");
	}

}
