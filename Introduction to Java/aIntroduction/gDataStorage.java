package aIntroduction;

public class gDataStorage {

	public static void main(String[] args) {
	
		char c = 'a';
		System.out.println(c+3); // Char c will be converted to ASCII value and has 2 bytes of data in memory
		
		int i = c;   // i will be equal to 97 ie ASCII value of character a
		
		// by default the compiler assign int 4 byte temp memory to long also, and in case of a very long number
		long lng = 123456789110l;  // l is added at the end
		
	// char abc = i;    This is not possible as 4 bytes of data cannot be copied to 2 bytes of data
		
		int j = 100;
		// The 100 will be converted to binary in the temporary memory of 4 bytes and same will be copied to memory allocated to j
		
		//float f = 1.23;
		// By default the Java reads decimal number as double and allocates 8 bytes for it's conversion to binary
		// and 8 byte of data can not be copied to 4 bytes of float number
		
		float f = 1.23f;  // To tell don't allocate more than 4 bytes in temp memory
		
		
		//Implicit typecasting
		int num = 60;
		long l = num;   // We are changing the datatype implicitely becuase of memory difference
		
		//Explicit typecasting
		int num1 = 60;
		short s = (short)num1;   // When we know that the data is not long, we can explicitely tell the compiler that high memory to low memory convert
		

		/*
		 How negative numbers are stored?
		 Lets say, a 4 bit data (.5 byte) = 1111 max and 0000 min i.e 15 max and 0 min
		 But we assign first digit as sign 1 for negative and  for positive
		 Then we will be left with +7 and -7 but zero came twice
		 So for negative numbers, we take 2's compliment and store. So, we will have -8 to 7
		 */
		
	}

}
