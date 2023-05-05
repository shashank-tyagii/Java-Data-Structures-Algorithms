package kTrees;

public class eFindHeight {

	public static int getHeight(TreeNode<Integer> root){
		
		if (root == null) {
			return 0;
		}
		
		int max = 0;
		for (int i=0; i < root.children.size(); i++ ) {
			int h = getHeight(root.children.get(i));
			if ( h> max) {
				max = h;
			}
		}
		
		return max + 1;
	}
}
