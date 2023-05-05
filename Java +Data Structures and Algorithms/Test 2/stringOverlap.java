package skillTest1;

public class stringOverlap {

	 public static void twoSubstrings(String s) {
	       if (isValid(s))
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	}

	    static boolean isValid(String s)
	{
	    if ((s.indexOf( "AB")!=-1) &&
	        (s.indexOf( "BA",s.indexOf( "AB") + 4)!=-1))
	        return true;
	 
	    return false;
	}
}
