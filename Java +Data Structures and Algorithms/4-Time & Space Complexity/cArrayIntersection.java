// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
package dTimeSpaceComplexity;

import java.util.Arrays;

public class cArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void intersection(int[] arr1, int[] arr2) {
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    
	    int i =0;
	    int j=0;
	    
	    while (i < arr1.length && j <arr2.length) {
	    	if (arr1[i] != arr2[j]) {
	    		if (arr1[i] < arr2[j]) { i++;} 
	    		else {j++;}
	    	} else {
	    		System.out.println(arr1[i]);
	    		i++;j++;
	    	}
	    }
	}


}
