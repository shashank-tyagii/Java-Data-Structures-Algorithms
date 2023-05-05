package bConditionalAndLoops;
import java.util.*;
public class dPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d =2;
		
		while (d<n) {
			if(n%d==0) {
				System.out.println("Non-Prime number");
				return;
			}
			d++;
		}
		System.out.println("Prime number");
		
	}

}
