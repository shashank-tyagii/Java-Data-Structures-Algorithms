package bConditionalAndLoops;
import java.util.Scanner;
import java.util.*;
public class fSumOfEvenNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int i=1;
		int sum =0;
		
		while(i<=n) {
			if (i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
