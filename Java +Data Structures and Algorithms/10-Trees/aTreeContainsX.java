// Given a generic tree and an integer x, check if x is present in the given tree or not. Return true if x is present, return false otherwise.
package aaTrees;

public class aTreeContainsX {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if (root == null) {
			return false;
		}
		
		
		if (root.data == x) {
			return true;
		}
		for (int i = 0; i <root.children.size(); i++) {
			if (checkIfContainsX(root.children.get(i), x) == true) {
				return true;
			}
		}
		
		return false;
	}

}
