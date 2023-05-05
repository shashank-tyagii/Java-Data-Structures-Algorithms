package aIntroduction;

import java.util.Scanner;

public class fOperatorsIntro {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        
		// int cel = (5/9)*(f - 32);   // Wrong output i.e (5/9) will be zero
		int cel = (5 * (f - 32))/9;    
		
		// int cel = (int)((5.0/9)*(f - 32));  // Correct output as double/int is double i.e 1.8
		System.out.println(cel);
		
		System.out.println(9/5);   // Output is 1
		System.out.println(9.0/5); // Output is 1.8
		
		System.out.println(9  + 5);
		System.out.println(9  - 5);
		System.out.println(9  / 5); // Output will be 1
		System.out.println(9  * 5);
		System.out.println('a'/3);  // Will take the ASCII value of character
		
		System.out.println(9 % 5);
		char c = 'a'; 
		char ii = (char)(c + 3);   // char(97+3)
		System.out.println(ii);
		
		System.out.println('a' + 'b');  // Will add the ASCII Values
		
		int i = 1; int j =2;
		boolean isEq = (i == j);
		boolean neq = (i != j);
		boolean isgr = (i > j);
		boolean isgreq = (i >= j);
		boolean isless = (i < j);
		boolean isLessEq = (i <= j);
		
		
		//boolean isALargest = (a >= b) && (a >= c);
		
		// Mutiplication, division, modulus have same priority. It goes from left to right
	}

}
