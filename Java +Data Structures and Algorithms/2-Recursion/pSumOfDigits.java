package bRecursion;

public class pSumOfDigits {

	public static int sumOfDigits(int input){
		if (input <=0) {
			return 0;
		}
		
		int lastDigit = input%10;
		input = input/10;
		int sum = lastDigit + sumOfDigits(input);
			return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));

	}

}
