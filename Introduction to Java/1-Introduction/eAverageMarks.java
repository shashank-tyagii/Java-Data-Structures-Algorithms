package aIntroduction;
import java.util.Scanner;
import java.util.*;

public class eAverageMarks {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name = scn.next();
		int m1 = scn.nextInt();
		int m2 = scn.nextInt();
		int m3 = scn.nextInt();
		
		System.out.println(name);
		System.out.println((m1+m2+m3)/3);
		

	}

}
