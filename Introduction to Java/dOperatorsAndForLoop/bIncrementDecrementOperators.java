package dOperatorsAndForLoop;

public class bIncrementDecrementOperators {

	public static void main(String[] args) {
		int a =10;
		System.out.println(++a); //11           //Pre-increment : It will first Increase the value and then print
		
		int b=20;
		System.out.println(b++); //20            //Post-increment : The value will be increased after this line
		
		int c = 30;
		System.out.println(--c);                 //Pre-decrement
		
		int d = 40;
		System.out.println(d--);                 //Post decrement
		
		//Shortcuts
		
		a +=3;                       // a= a+3
		System.out.println(a);
		
		a -=3;                       // a=a-3
		System.out.println(a);
		
		a *=3;                       // a= a*3
		System.out.println(a);
		
		a /=3;                      // a= a/3
		System.out.println(a);

	}

}
