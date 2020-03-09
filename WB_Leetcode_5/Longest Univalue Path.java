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
    int pathSize =0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        longestUnivaluePath(root, root.val);
        
        return pathSize;
    }
    
    public int longestUnivaluePath(TreeNode node, int val) {
        if(node == null) return 0;
        int left = longestUnivaluePath(node.left, node.val);
        int right =longestUnivaluePath(node.right, node.val);
        int total =0;
        pathSize = Math.max(pathSize, left+right);
        
        if(val == node.val)total = 1+ Math.max(left, right);
        
        return total;
    }
}