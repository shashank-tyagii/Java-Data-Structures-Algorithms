package skillTest3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class countSpecialNodes {

	static int ans;
	 //public static int countSpecialNodes(TreeNode<Integer> root) {
//		 ans = 0;
//		    dfs(val, n, adj, 1, new HashSet<Integer>());
//		    return ans;
	  //  }
	 
// DFS function to traverse the tree and find
// number of special nodes
static void dfs(int val[], int n, Vector<Integer> adj[], int v,
        HashSet<Integer> values)
{
 
    // If value of current node is already
    // present earlier in path then this
    // node and all other nodes connected to
    // it are not special
    if (values.contains(val[v]))
        return;
 
    // Insert value of current node in
    // set of values traversed
    ans++;
    values.add(val[v]);
 
    // Call dfs on all adjacent nodes
    for (int ele : adj[v])
    {
        dfs(val, n, adj, ele, values);
    }
 
    // Erase value of current node as all paths
    // passing through current node are traversed
    values.remove(val[v]);
}
 
}

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public int numChildren() {
        return this.children.size();
    }

    public TreeNode<T> getChild(int index) {
        if (index > this.children.size()) {
            return null;
        }

        return this.children.get(index);
    }
}
