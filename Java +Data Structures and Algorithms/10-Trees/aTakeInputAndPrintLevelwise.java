package kTrees;
import java.util.*;
public class aTakeInputAndPrintLevelwise {

	public static TreeNode<Integer> takeInput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the root node");
		int rootData = scn.nextInt();
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.poll();            // Remove the first element from queue
			System.out.println("Enter the number of child of : " + frontNode.data);
			int num = scn.nextInt();
			
			for (int i = 0; i <num; i++) {
				System.out.println("Enter the " +(i+1)+ "th" + "chidren of : " + frontNode.data);
				int childData = scn.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				frontNode.children.add(childNode);
				pendingNodes.add(childNode);
			}	
		}
		return root;

	}
	
	public static void printLevelWise(TreeNode<Integer> root){
		int rootData = root.data;
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		QueueUsingLL<TreeNode<Integer>> childNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
        System.out.println(root.data);
		
        while (!pendingNodes.isEmpty()) {
        	
        	// Print all the children of elements in Main queue and add children in child queue until it gets empty
		        while (!pendingNodes.isEmpty()) {
		            
		            try {
						TreeNode<Integer> frontNode = pendingNodes.dequeue();    // Remove the first element from queue
				     	int num = frontNode.children.size();
					
			            for (int j = 0; j <num; j++) {
							int childData = frontNode.children.get(j).data;
							System.out.print(childData + " ");
							childNodes.enqueue(frontNode.children.get(j));
			            }
					} catch (Exception e) {
						// TODO: handle exception
					}
		    
		        }
	        System.out.println();
	        
	     // Swap the TreeNodes
	        pendingNodes = childNodes;
	        childNodes = new QueueUsingLL<>();
	              
	        }
     	
		}



	
	public static void main(String[] args) {
		
		TreeNode<Integer> root = takeInput();
		printLevelWise(root);

	}

}
