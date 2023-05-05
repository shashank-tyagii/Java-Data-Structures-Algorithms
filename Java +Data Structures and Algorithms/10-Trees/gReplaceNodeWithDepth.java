package aaTrees;

public class gReplaceNodeWithDepth {

	public static void replaceWithDepthValue(TreeNode<Integer> root){
        replaceWithDepthValue(root,0);
    }
	public static void replaceWithDepthValue(TreeNode<Integer> root, int count){

		if (root == null) {
			return;
		}
		
		root.data = count;
		
		for (int i =0; i < root.children.size(); i++) {
			replaceWithDepthValue(root.children.get(i), count + 1);
		}
		
	}
	
}
