//Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
//An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.

package eTest1;
import java.util.Scanner;
public class CheckAmstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int length =0;
		int temp = n;
		while (temp>0) {
			length++;
			temp=temp/10;
		}
		int sum =0;
		temp =n;
		while (temp>0) {
			int last = temp%10;
			temp = temp/10;
			sum = sum + (int)Math.pow(last, length);
		}
		
		
		if (sum==n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		
	}

}
