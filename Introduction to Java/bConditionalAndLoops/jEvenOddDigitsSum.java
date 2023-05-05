
// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separate

package bConditionalAndLoops;
import java.util.*;
public class jEvenOddDigitsSum {
  //Method 1
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int oddSum =0;
		int evenSum =0;
		for (int i =0; i <str.length();i++) {
			char c = str.charAt(i);
			int num = c - '0';
			if (num%2 ==0) {
				evenSum = evenSum+num;
			}else {
				oddSum = oddSum+num;
			}
		}
		
		System.out.println(evenSum + " "+ oddSum);

	}
	
 // Method 2
	


}
