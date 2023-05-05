package dHashmaps;
import java.util.HashMap;
public class iLongestSubsetZeroSum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int max = 0;
		map.put(0,0);    // Initial sum is zero
		for (int i = 0 ; i < arr.length; i++) {
			sum = sum + arr[i];
			if (map.containsKey(sum)) {
				int diff = i - map.get(sum);
				if (diff > max) {
					max = diff;
				}
				continue;
			}
			map.put(sum, i+1);    // Push all the sum
		}
		
		return max+1;
	}
}
//Ex : 1 2 3 4 -10 10
//Map - 0,0 ; 1,1 ; 3,2; 6,3 ; 10,4 ; 0,5 ; 10,6