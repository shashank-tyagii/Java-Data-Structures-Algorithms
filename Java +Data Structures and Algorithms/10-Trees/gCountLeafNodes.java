package kTrees;

public class gCountLeafNodes {

	public static int countLeafNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.children.size() == 0) {
			return 1;
		}
		
		int sum =0;
		
		for (int i =0; i < root.children.size(); i++) {
			sum = sum + countLeafNodes(root.children.get(i));
		}
		
		return sum;
	}
}
