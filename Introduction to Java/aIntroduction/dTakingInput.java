package aIntroduction;
import java.util.Scanner;

public class dTakingInput {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);    // System.in mean the location of the input stream i.e console
		
		int a = scn.nextInt();  // Integer input
		float f = scn.nextFloat();
		double d = scn.nextDouble();
		long l = scn.nextLong();
		
		//Note : We can not take character as an input, only string can be taken
		//char c = scn.
		
		String str = scn.next();       // Takes only next word and breaks after space
		String line = scn.nextLine();  // Take whole line as input
	
		char c = str.charAt(0);

	}

}
