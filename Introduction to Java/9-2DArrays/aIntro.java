package j2DArrays;

import java.util.Scanner;

public class aIntro {

	public static void main(String[] args) {
		int[][] input = takeInput();
		printArray(input);

	}
	
	
	public static int[][] takeInput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = scn.nextInt();
		System.out.println("Enter number of columns");
		int column = scn.nextInt();
		
		int[][] input = new int[row][column];
		for (int i =0; i < row; i++) {
			for (int j =0; j < column; j++) {
				System.out.println("Enter the element in " +i+ " row, "+j+" column");
				input[i][j] = scn.nextInt();
			}
		}
		return input;
	}
	
	public static void printArray(int[][] arr) {
		for (int i =0; i< arr.length; i++) {
			for (int j =0; j <arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
