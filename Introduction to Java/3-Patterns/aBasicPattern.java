package cPatterns;

import java.util.Scanner;

public class aBasicPattern {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int i=1;
		
		while (i<=n) {   // Inside this while loop only print the ith row, don't think about all rows
			int j=1;
			while (j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
