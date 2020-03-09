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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
            int val = root.val;
        while(!q.isEmpty()){
            TreeNode nod = q.remove();
            if(nod.right!=null) q.add(nod.right);
            if(nod.left!=null) q.add(nod.left);

            val = nod.val;
        }
        
        return val;
    }
}