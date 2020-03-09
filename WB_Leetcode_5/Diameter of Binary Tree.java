/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTree1(root);
        return max;
    }
    public int diameterOfBinaryTree1(TreeNode root) {
        if (root == null) return 0;
          
        int left =  diameterOfBinaryTree1(root.left);
      //  System.out.println("left "+left);
        int right = diameterOfBinaryTree1(root.right);
     //   System.out.println("right "+ right);
        max = Math.max(max, left+right);
        return 1+Math.max(left,right);
        
        
    }
}