package skillTest2;

public class subsetSumEqualToK {

	public static boolean subsetSumToKIdentical(int input[], int n,int k){
		return groupSumClump(0,input,k);

	}

	public static boolean groupSumClump(int start, int[] nums, int target) {
	    if(start >= nums.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	                              
	    if(groupSumClump(i, nums, target - sum))
	        return true;
	                                        
	    if(groupSumClump(i, nums, target))
	        return true;
	                                                  
	    return false;
	}
}
