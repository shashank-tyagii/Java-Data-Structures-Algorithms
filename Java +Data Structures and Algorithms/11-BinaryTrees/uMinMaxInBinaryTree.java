package bBinaryTrees;

public class uMinMaxInBinaryTree {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new Pair(10000, -10000);
		}
		
		Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
		Pair<Integer, Integer> rightPair = getMinAndMax(root.right);
		
		int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));

        return new Pair<>(minimum, maximum);
	}
	
	
}

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}
