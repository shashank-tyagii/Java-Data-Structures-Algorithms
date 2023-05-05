package gArrays;

import java.util.Scanner;

public class bArraySum {
	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] input = new int[n];
		for (int i =0; i<n; i++) {
			input[i]= scn.nextInt();
		}
		return input;
	}
	
	public static int sum (int[] arr) {
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int[] sum = new int[t];
		for (int i =0; i<t;i++) {
			int[] arr = takeInput();
			sum[i] = sum(arr); 
		}
		
		for (int i =0; i<t; i++) {
			System.out.println(sum[i]);
		}
		
		}

	}

