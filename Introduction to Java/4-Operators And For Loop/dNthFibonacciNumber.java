// Nth term of Fibonacci series F(n)

package dOperatorsAndForLoop;
import java.util.*;
public class dNthFibonacciNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int a = 1, b=1;
		int c = 0;
		if (n == 1 || n==2) {
			System.out.println(1);
		}else {
			
			for (int i =3; i<=n;i++) {
				c = a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
		

	}

}
