package cBST;

public class cIsBST {
		public static boolean isBST(BinaryTreeNode<Integer> root) {
	      BSTPair temp = isBST(root, 0);
	        return temp.isBST;
		}
	    
	    public static BSTPair isBST(BinaryTreeNode<Integer> node, int a) {
			  if (node == null) {
	              BSTPair bp = new BSTPair();
	              bp.min = Integer.MAX_VALUE;
	              bp.max = Integer.MIN_VALUE;
	              bp.isBST = true;
	              return bp;
	            }

	            BSTPair lp = isBST(node.left, a);
	            BSTPair rp = isBST(node.right, a);

	            BSTPair mp = new BSTPair();
	            mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
	            mp.max = Math.max(node.data, Math.max(lp.max, rp.max));
	            mp.isBST = lp.isBST && rp.isBST && node.data >= lp.max && node.data <= rp.min;

	            return mp;	
		}
	    
	    public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
			if (root == null) {
				return true;
			}
			if (root.data < min || root.data > max) {
				return false;
			}
			boolean isLeftOk = isBST3(root.left, min, root.data - 1);
			boolean isRightOk = isBST3(root.right, root.data, max);
			return isLeftOk && isRightOk;
		}
	    
	}

 class BSTPair {
    int min;
    int max;
    boolean isBST;
  }
