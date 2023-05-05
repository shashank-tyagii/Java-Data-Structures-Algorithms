package dHashmaps;

import java.util.HashMap;
import java.util.Set;

public class cMaxFrequency {

	 public static int maxFrequencyNumber(int[] arr){ 
		 HashMap<Integer, Integer> map = new HashMap<>();
		 int maxValue = 0;
		 Integer maxKey = Integer.MIN_VALUE;
		 
		 for (int i =0; i < arr.length; i++) {
			 if (map.containsKey(arr[i])) {
				 map.put(arr[i],map.get(arr[i])+1);
			 } else {
				 map.put(arr[i], 1);
			 }
		 }
		
		 for(int i=0;i<arr.length;i++)
       
        {
            if(map.get(arr[i])>maxValue){
                maxValue=map.get(arr[i]);
                maxKey=arr[i];}
        }
		 return maxKey;
	    }
}
