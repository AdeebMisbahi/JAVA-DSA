

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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

	private static Pair<Integer, Integer> ans=new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE);

public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
     getMinAndMaxHelper(root);
     return ans;
}
	
private static void getMinAndMaxHelper(BinaryTreeNode<Integer> root) {
	if(root==null) {
		return;
		
	}
	int maxVAl=ans.maximum;
	int minVal=ans.minimum;
	int rootData=root.data;
	if(rootData<minVal) {
		ans.minimum=root.data;
	}
	if(rootData>maxVAl) {
		ans.maximum=root.data;
	}
	getMinAndMaxHelper(root.left);
	getMinAndMaxHelper(root.right);
	
}

	
}
