package cPatterns;
import java.util.Scanner;
public class jIsocelesTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		
		for (int i=1; i<=n;i++) {
			
			for (int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i;j++) {
				System.out.print(j);
			}
			for (int j=1; j<i;j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
		
	}

}
