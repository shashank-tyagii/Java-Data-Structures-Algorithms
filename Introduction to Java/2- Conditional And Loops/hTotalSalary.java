package bConditionalAndLoops;

import java.util.Scanner;

public class hTotalSalary {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int basic= Integer.parseInt(str) ;  // We cannot read String after an integer as space is also a string
		String grade = scn.next();
		char Grade = grade.charAt(0);
		double hra = 0.2*basic;
		double da= 0.5*basic;
		double pf = 0.11*basic;
		int allow = 0;
		if(Grade == 'A') {
			allow = 1700;
		}else if (Grade =='B') {
			allow = 1500;
		} else if (Grade =='C') {
			allow = 1300;
		}
		
		int totalSalary = (int)(Math.round(basic+hra+da+allow-pf));  // round function and explicit typecasting
		System.out.println(totalSalary);

	}

}
