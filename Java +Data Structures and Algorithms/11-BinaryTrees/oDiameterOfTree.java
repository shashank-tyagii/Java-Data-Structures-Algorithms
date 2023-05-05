package bBinaryTrees;

public class oDiameterOfTree {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		DiameterPair temp = diameterBetter(root);
		return temp.diameter;
	}
	public static DiameterPair diameterBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			DiameterPair temp = new DiameterPair();
			temp.height = 0;
			temp.diameter = 0;
			return temp;
		}
		
		DiameterPair leftDia = diameterBetter(root.left);
		DiameterPair rightDia = diameterBetter(root.right);
		
		int height = 1 + Math.max(leftDia.height, rightDia.height);
		
		int option1 = leftDia.height + rightDia.height;  
		int diameter = Math.max(option1, Math.max(leftDia.diameter, rightDia.diameter));
		
		DiameterPair ans = new DiameterPair();
		ans.diameter = diameter;
		ans.height = height;
		return ans;
	}
	
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		return Math.max(option1, Math.max(option2, option3));
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);
	}
}

class DiameterPair{
	int height;
	int diameter;
}
