package bConditionalAndLoops;

import java.util.Scanner;

public class bLargestOf3Numbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2= scn.nextInt();
		int num3 = scn.nextInt();
		
		// Method 1
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1);
		}
		else {
			if (num2>=num1 && num2>=num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}
		
		//Method 2
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

	}

}
