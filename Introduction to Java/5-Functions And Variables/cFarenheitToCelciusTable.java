package fFunctionsAndVariables;

import java.util.Scanner;

public class cFarenheitToCelciusTable {

	public static void printFahrenheitTable(int start, int end, int step) {
		int celcius = 0;
		int farenheit = 0;
		for (int i = start; i <=end ; i=i+step) {
			
			celcius = (int)((5.0/9)*(i-32));
			System.out.println(i + " " + celcius);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();
		int step = scn.nextInt();
		
		printFahrenheitTable(start, end ,step);

	}

}
