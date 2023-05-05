package dOperatorsAndForLoop;

public class aBitwiseOperators {

	public static void main(String[] args) {
		System.out.println(2 & 3);      //and - 1 if both bits are	1.
		System.out.println(2 | 3);      //or- 1	if	either	bit	is	1
		System.out.println(2 ^ 3);      //xor - 1	if	both	bits	are	different.
		System.out.println(~2);         //not - Inverts	the	bits.	(Unary	bitwise	compliment)
		
		System.out.println(19 << 2);   // Left shift
		System.out.println(19 >> 2);   // Right shift

	}

}
