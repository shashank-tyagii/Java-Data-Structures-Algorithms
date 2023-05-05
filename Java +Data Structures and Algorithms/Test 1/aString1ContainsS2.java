package eTest1;

public class aString1ContainsS2 {

	public static boolean checkSequence(String a, String b) {
	
		 if (a.length() <= 0) {
				return false;
			}
			if (b.length() <= 0) {
				return true;
			}
			char ch = b.charAt(0);
			int i =0;
			while (i < a.length() && a.charAt(i) != ch) {
				i++;
			}
	        if (i == a.length()){
	            return false;
	        }
			
			boolean output = checkSequence(a.substring(i+1), b.substring(1));
			return output;
	}
	
	public static void main(String[] args) {
	

	}

}
