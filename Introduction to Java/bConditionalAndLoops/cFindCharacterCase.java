package bConditionalAndLoops;
import java.util.*;

public class cFindCharacterCase {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		char c = str.charAt(0);
		
		if (c>=65 && c<=90) {
			System.out.println("1");
		}
		else if(c>=97 && c<=122) {
			System.out.println("-1");
		}
		else {
			System.out.println("0");
		}
		
	}

}
