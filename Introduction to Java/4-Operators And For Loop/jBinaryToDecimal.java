// Given a binary number as an integer N, convert it into decimal and print

package dOperatorsAndForLoop;
import java.util.Scanner;
public class jBinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int num =n;
		int decimal =0;
		int factor = 1;
		while (num>0) {
			int last = num %10;
			num = num/10;
			decimal = decimal + last *factor;
			factor = factor *2;
		}
		
		System.out.println(decimal);
	}

}
