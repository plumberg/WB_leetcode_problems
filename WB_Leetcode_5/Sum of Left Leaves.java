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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int sum=0;
        
        TreeNode nod;
        q.add(root);
        while(!q.isEmpty()){
            nod = q.remove();
            if(nod.left!=null){
                q.add(nod.left);
                if(nod.left.left == null&& nod.left.right==null){
                    sum+=nod.left.val;
                }
            }
            
            if(nod.right!=null){
                if (nod.right.left != null || nod.right.right != null)
                q.add(nod.right);
            }
        }
    return sum;
    }
}