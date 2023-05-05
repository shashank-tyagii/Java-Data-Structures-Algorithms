// Strings comparison

package iStrings;
public class dStringComparison {

	public static void main(String[] args) {
		  String str="abc";
	      String str1="abc";
	      String str3=new String("abc");
	      if(str1==str3){         // == sign only checks for address which is different in both cases
	          System.out.println("Both are equal");
	      } else {
	    	  System.out.println("Both are not equal");
	      }
	      
	      if(str1.equals(str3)){  // equals to function checks for content
	          System.out.println("Both are equal");
	      }
	      else{
	          System.out.println("Both are not equal");
	      }
	      if(str1==str){         // == sign only checks for address which is different in both cases, both these strings points to same address
	          System.out.println("Both are equal");
	      } else {
	    	  System.out.println("Both are not equal");
	      }
	      
	      
	}

}
