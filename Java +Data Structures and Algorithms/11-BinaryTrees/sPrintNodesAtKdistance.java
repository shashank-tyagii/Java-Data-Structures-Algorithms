package bBinaryTrees;

import java.util.ArrayList;

public class sPrintNodesAtKdistance {

	  // *******************PRINT K NODES FAR******************
	  public static void printKNodesFar(Node node, int data, int k) {
	    ArrayList< Node> path = new ArrayList<>();
	    find(node, data); //1
	    for (int i = 0; i < path.size(); i++) { //2
	      printKLevelsDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1)); //Pass the blocker towards one side as previous node
	    }

	  }

	  //**************** FIND FUNCTION ******************
	  static ArrayList< Node> path;
	  public static boolean find(Node node, int data) {   //Find the path towards the Node
	    if (node == null)
	      return false;
	    if (node.data == data) {
	      path.add(node);
	      return true;
	    }
	    boolean filc = find(node.left, data);
	    if (filc) {
	      path.add(node);
	      return true;
	    }
	    boolean firc = find(node.right, data);
	    if (firc) {
	      path.add(node);
	      return true;
	    }
	    return false;
	  }
	  //****************PRINT K LEVELS DOWN****************
	  public static void printKLevelsDown(Node node, int k, Node blocker) {
	    if (node == null || k < 0 || node == blocker)
	      return;
	    if (k == 0)
	      System.out.println(node.data);
	    printKLevelsDown(node.left, k - 1, blocker);
	    printKLevelsDown(node.right, k - 1, blocker);

	  }
	  
	  public static class Node {
		    int data;
		    Node left;
		    Node right;

		    Node(int data, Node left, Node right) {
		      this.data = data;
		      this.left = left;
		      this.right = right;
		    }
		  }

		  public static class Pair {
		    Node node;
		    int state;

		    Pair(Node node, int state) {
		      this.node = node;
		      this.state = state;
		    }
		  }
}



//
//
//private static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int target, int K) {
//    if (root == null) return -1;
//    if (root.data == target) {
//        nodesAtDistanceKDown(root, K);
//        return 0;
//    }
//    int leftDistance = nodesAtDistanceKHelper(root.left, target, K);
//    if (leftDistance != -1) {
//        if (leftDistance + 1 == K) {
//            System.out.println(root.data);
//        } else {
//            nodesAtDistanceKDown(root.right, K - leftDistance - 2);
//        }
//        return 1 + leftDistance;
//    }
//
//    int rightDistance = nodesAtDistanceKHelper(root.right, target, K);
//    if (rightDistance != -1) {
//        if (rightDistance + 1 == K) {
//            System.out.println(root.data);
//        } else {
//            nodesAtDistanceKDown(root.left, K - rightDistance - 2);
//        }
//        return 1 + rightDistance;
//    }
//    return -1;
//}
//
//private static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root, int K) {
//    if (root == null) return;
//    if (K == 0) {
//        System.out.println(root.data);
//        return;
//    }
//    nodesAtDistanceKDown(root.left, K - 1);
//    nodesAtDistanceKDown(root.right, K - 1);
//}
//
//public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int K) {
//    nodesAtDistanceKHelper(root, node, K);
//}

