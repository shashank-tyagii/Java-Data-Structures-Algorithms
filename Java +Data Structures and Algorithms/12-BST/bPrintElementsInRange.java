package cBST;

public class bPrintElementsInRange {

public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		
        if (root == null) {                      // Base case
            return;
        }
            if (root.data > k2) {
				elementsInRangeK1K2(root.left, k1, k2);
			} 
            else if (root.data >= k1 && root.data <= k2) {
                elementsInRangeK1K2(root.left, k1, root.data-1);
                System.out.print(root.data + " ");                 // in order printing
                elementsInRangeK1K2(root.right, root.data + 1, k2);
			}
            else if (root.data < k1) {
				elementsInRangeK1K2(root.right, k1, k2);
		    } 
	}
	
}
