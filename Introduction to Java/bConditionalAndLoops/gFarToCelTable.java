package bConditionalAndLoops;
import java.util.*;
import java.util.Scanner;

// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table
public class gFarToCelTable {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int start_val= scn.nextInt();
		int end_val= scn.nextInt();
		int step= scn.nextInt();
		
		int i = start_val;
		
		while (i <= end_val) {
			
			int degC =(int)((5.0/9)*(i - 32));
			
			System.out.println(i+" "+degC);
			i = i+step;
		}
		
		
	}

}
