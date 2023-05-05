// String Buffer - Mutable
package iStrings;
public class fStringBuffer {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
        str.setCharAt(0,'d');              // Mutable version, we can add, insert elements
        str.append("def");
        System.out.println(str+" "+str.length());
	}

}
