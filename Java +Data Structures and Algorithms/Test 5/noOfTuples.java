package skillTest4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class noOfTuples {

	 public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in);
	       int n = scn.nextInt();
	       
	       int input[]= new int[n];
	       
	       for (int i =0 ; i <n; i++) {
	    	   input[i] = scn.nextInt();
	       }
	       
	       int ans = tupleSameProduct(input);
	       System.out.println(ans);
	    }

	   public static int tupleSameProduct(int[] nums) {
	        
	        Map<Integer, Integer> map = new HashMap();
	        
	        for(int i = 0; i < nums.length - 1; i++)
	        {
	            for(int j = i + 1; j < nums.length; j++)
	            {
	                int product = nums[i] * nums[j];
	                map.put(product, map.getOrDefault(product, 0) + 1);
	            }
	        }
	        
	        int count = 0;
	        
	        for(int key : map.keySet())
	        {
	            if(map.get(key) > 1)
	            {
	                
	                count += 8 * ((map.get(key) * (map.get(key) - 1)) / 2);
	            }
	        }
	        
	        return count;       
	    }
		
	
}
