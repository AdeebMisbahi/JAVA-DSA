
//     /*	Binary Tree Node class
//  * 
//  * class BinaryTreeNode<T> {
// 		T data;
// 		BinaryTreeNode<T> left;
// 		BinaryTreeNode<T> right;

// 		public BinaryTreeNode(T data) {
// 			this.data = data;
// 		}
// 	}
// 	*/
public class Solution {
  private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String path, int currSum) { 
    if(root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      currSum += root.data;
      if (currSum == k) {
        System.out.println((path + root.data + " "));
      } 
      return;
    }
    rootToLeafPathsSumToK(root.left, k, (path + root.data + " "), (currSum + root.data));
    rootToLeafPathsSumToK(root.right, k, (path + root.data + " "), (currSum + root.data)); 
  }
  public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
    rootToLeafPathsSumToK(root, k, "", 0);
  }
  
  
  
//   OR
  
//   public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
// 	       // Write your code here
//         helper(root,k,"");
//     }
//     private static void helper(BinaryTreeNode<Integer> root,int k,String s){
//         if(root==null)
//             return;
//         if(root.left==null && root.right==null && root.data==k)
//         {
//             System.out.println(s+root.data);
//             return;
//         }
//         s=s+root.data+" ";
   
//         helper(root.left,k-root.data,s);
//         helper(root.right,k-root.data,s);
        
//     }  
  
  
//  OR
  //     public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
// 		rootToLeafPathsSumToK(root,k,"");
// 	}
  // 	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String ans) {
//           if(k==root.data){      
//               if(root.right==null&&root.left==null){
//                  System.out.println(ans+" "+root.data);
//                  return; 
//               }else{
//                   return;
//               }
//           }
         
//         if(root.left!=null){
//           if(ans=="")
//             rootToLeafPathsSumToK(root.left ,k-root.data,ans+root.data);
//            else{ 
//             rootToLeafPathsSumToK(root.left ,k-root.data,ans+" "+root.data);
//            }
//         }
//         if(root.right!=null){  
//             if(ans=="")
//             rootToLeafPathsSumToK(root.right ,k-root.data,ans+root.data);
//            else{ 
//             rootToLeafPathsSumToK(root.right ,k-root.data,ans+" "+root.data);
//            }
//         }
//     }
  
  
  
  
  
}
