/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
public static void printCurrentLevel(BinaryTreeNode<Integer> root, int level)
    {
        if (root == null){
		
				return;
				}
        if (level == 1){
            System.out.print(root.data + " ");
				
		}	
		
         if (level > 1) {
		
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
		
    }
    public static int heaight(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int lh=heaight(root.left);
		int rh=heaight(root.right);
return 1+Math.max(lh, rh);
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
	  int h=heaight(root);	
	   
        for (int i = 1; i <= h; i++){
            printCurrentLevel(root, i);
			System.out.print(System.lineSeparator());
	}
	}
}


// Another Way
// Using Queue  =>

import java.util.LinkedList;
import java.util.Queue;
public class Solution { 
  public static void printLevelWise(BinaryTreeNode<Integer> root) {
    if (root== null)
      return;
    // create a queue
    Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
    pendingNodes.add(root);
    pendingNodes.add(null);
    while(!pendingNodes.isEmpty()){
     BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
      if (frontNode == null) {
        System.out.println();
        if (!pendingNodes.isEmpty()) {
          pendingNodes.add(null);
        }
      } else { 
        System.out.print(frontNode.data + " ");
        if (frontNode.left != null) {
          pendingNodes.add(frontNode.left); 
        } 
        if (frontNode.right != null) {
          pendingNodes.add(frontNode.right); 
        }
      }
    }
  }
}


