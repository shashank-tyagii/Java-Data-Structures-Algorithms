package gDynamicProgramming;

public class jEditDistance {

	public static int editDistanceDP(String s1, String s2){		
		
        int[][] storage = new int[s1.length() + 1][s2.length() + 1];
        return editDistanceDP(s1, s2,storage);
        
    }

	// String 1 = a a b c d
	// String 2 = a z x c d
    public static int editDistanceDP(String s1, String s2, int[][] storage) {
        int m = s1.length();
        int n = s2.length();
        if (storage[m][n] > 0) {
            return storage[m][n];

        }
        if (m== 0) {
            storage[m][n] = n;
            return storage[m][n];

        }
        if (n== 0) {
            storage[m][n] = m;
            return storage[m][n];

        }
        if (s1.charAt(0) == s2.charAt(0)) {   // a == a , no action needs to be taken
            storage[m][n] = editDistanceDP(s1.substring(1), s2.substring(1), storage);
            return storage[m][n];

        } else {   // a !=z
    	 // Insert a in front of 2nd string and will cancel out
      	 // String 1 = b c d , String 2 = z x c d
           int op2 = editDistanceDP(s1.substring(1), s2,storage); 
           
               
         // Delete z in front of 2nd string 
       	 // String 1 = a b c d , String 2 =  x c d
            int op1 = editDistanceDP(s1, s2.substring(1),storage); 
            
        
            
        // Replace a with z
        // String 1 = b c d , String 2 = x c d 
            int op3 = editDistanceDP(s1.substring(1),s2.substring(1),storage);  // Replace
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
            return storage[m][n];
        }

    }
    
    
    public static int editDistance(String s, String t){
		if(s.length() == 0){
			return t.length();
		}
		if(t.length() == 0){
			return s.length();
		}
		
		if(s.charAt(0) == t.charAt(0)){
			return editDistance(s.substring(1), t.substring(1));
		}else{
			// insert
			int op1 = editDistance(s, t.substring(1));
			// delete 
			int op2 = editDistance(s.substring(1), t);
			//substitute
			int op3 = editDistance(s.substring(1), t.substring(1));
			return 1 + Math.min(op1, Math.min(op2, op3));
		}
	}
}
