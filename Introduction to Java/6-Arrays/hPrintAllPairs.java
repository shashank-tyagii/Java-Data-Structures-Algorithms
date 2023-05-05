// Print all the possible pairs
// (1,4), (1,7) ,(1,6), (1,5), (4,7) ,(4,6), (4,5), (7,6), (7,5) ,(6,5)
package gArrays;
public class hPrintAllPairs {
	public static void printAllPairs(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            System.out.println("("+arr[i]+","+arr[j]+")");
	        }
	    }
	}

	    
	public static void main(String args[]) {
	    int[] arr={1,4,7,6,5};
	    printAllPairs(arr);
	    }
	}
