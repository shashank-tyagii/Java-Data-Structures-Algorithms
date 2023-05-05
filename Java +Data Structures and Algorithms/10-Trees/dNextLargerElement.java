package aaTrees;

public class dNextLargerElement {

	 public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		 TreeNode<Integer> helper = findNextLargerNode( root, n, Integer.MAX_VALUE);
		 return helper;
	 }
	
	    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n, int nextLarger){
			
	    	TreeNode<Integer> output = new TreeNode<>(Integer.MIN_VALUE);
            
            if (root.children.size() == 0){
                
                if (root.data > n && root.data < nextLarger) {
	    		return root; 
	    		} else {
                TreeNode<Integer> tmp = new TreeNode<>(Integer.MIN_VALUE);
                return tmp;
                }
            }
            
	    	if (root.data > n && root.data < nextLarger) {
	    		output = root;
	    		nextLarger = root.data;
	    	}
	    	
	    	for (int i =0; i < root.children.size(); i++) {
	    		
	    		TreeNode<Integer> temp =  findNextLargerNode(root.children.get(i), n, nextLarger);
	    		if (temp.data >n && temp.data <nextLarger) {
	    			output = temp;
		    		nextLarger = temp.data;
                }
	    	}
	    	return output;
		}
	
}
