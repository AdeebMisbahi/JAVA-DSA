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
public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return; 
	}
	BinaryTreeNode<Integer> toInserted=new BinaryTreeNode<>(root.data);
	 BinaryTreeNode<Integer> rootLft=root.left;
	 toInserted.left=rootLft;
	 root.left=toInserted;
	insertDuplicateNode(rootLft);
	insertDuplicateNode(root.right);
	}
	

	
	
}
