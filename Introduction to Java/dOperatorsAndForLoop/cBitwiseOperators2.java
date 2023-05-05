package dOperatorsAndForLoop;

public class cBitwiseOperators2 {

	public static void main(String[] args) {
		    int a=10,b=20;
		    //a = 01010
		    //b = 10100
		    int c=a&b;                  //00000
		    System.out.print(c);     
		    int d=a|b;                  //11110           (only 0-0 is zero)  
		    System.out.print(d);
		    int e=a^b;                  //11110           ( 0-0 is zero and 1-1 is zero in XOR)
		    System.out.print(e);
		    int f=c+d+e;               // 60 - 111100
		    System.out.print(~f);      
		   
		    //Step 1 : Invert all the digits of 0000...111100 (60) in 32 bits i.e 1111..........000011
		    //Step 2 : Since first unit is 1 i.e negative number
		    //Step 3 : To identify, take 1's compliment i.e 0000....111100
		    //Step 4: Add 1 to it i.e 0000.....111101 i.e 61 of negative
		    
		    // To get binary of negative number, take 2's compliment
		    // To get number from negative binary, take 2's compliment
		    
	}

}

