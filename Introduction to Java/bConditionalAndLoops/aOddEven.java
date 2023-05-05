package bConditionalAndLoops;
import java.util.Scanner;

public class aOddEven {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int rem = num%2;
		
		//Method 1
		if(rem==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		//Method 2
		
		if (rem==0) {
			System.out.println("Even");
			return;
		}
		System.out.println("Odd");
	}

}
