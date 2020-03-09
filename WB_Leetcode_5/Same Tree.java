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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode>stack1 = new Stack<>();
        Stack<TreeNode>stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            TreeNode nod1 = stack1.pop();
            TreeNode nod2 = stack2.pop();
            if(nod1==null && nod2!=null) return false;
            if(nod2==null && nod1!=null) return false;
            if(nod1==null &&nod2==null) continue;
            if(nod1!=null &&nod2!=null && nod1.val!=nod2.val) return false;
            stack1.push(nod1.left);
            stack1.push(nod1.right);
            stack2.push(nod2.left);
            stack2.push(nod2.right);
        }
        
        return true;
    }
}