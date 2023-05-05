package aaTrees;

public class hRemoveLeafNodes {

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}

		if (root.children.size()== 0) {
			return null;
		}
		for (int i = root.children.size()-1; i >=0; i--) {   // BACK TO FRONT because of deleted 
			TreeNode<Integer> temp = removeLeafNodes(root.children.get(i));
			if (temp == null) {                             // only when it is null
				root.children.remove(i);
			}
		}
		return root;
		
	}
}
