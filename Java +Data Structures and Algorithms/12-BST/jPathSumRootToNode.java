package cBST;

import java.util.ArrayList;

public class jPathSumRootToNode {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        // Write your code here
        helper(root,k,"");
    }
    private static void helper(BinaryTreeNode<Integer> root,int k,String s){
        if(root==null)
            return;
        if(root.left==null && root.right==null && root.data==k)
        {
            System.out.println(s+root.data);
            return;
        }
        s=s+root.data+" ";
   
        helper(root.left,k-root.data,s);
        helper(root.right,k-root.data,s);
        
    }

	
}
