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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        ArrayList<Integer>list1 = new ArrayList<>();
        Stack<TreeNode>q1 = new Stack<>();
        q1.push(root1);
        while(!q1.isEmpty()){
            TreeNode nod = q1.pop();
            if(nod.left==null && nod.right==null) {
              // System.out.println("list1 "+nod.val);
                list1.add(nod.val);
            }
            if(nod.right!=null)q1.push(nod.right);
            if(nod.left!=null)q1.push(nod.left);
           
        }
        
        Stack<TreeNode>q2 = new Stack<>();
        ArrayList<Integer>list2 = new ArrayList<>();
                q2.push(root2);
        while(!q2.isEmpty()){
            TreeNode nod = q2.pop();
            if(nod.left==null && nod.right==null) {
               // System.out.println("list2 "+nod.val);
                list2.add(nod.val);
            }
            if(nod.right!=null)q2.push(nod.right);
            if(nod.left!=null)q2.push(nod.left);
            
        }
        
        if(list1.size()!=list2.size()) return false;
        for(int i =0;i<list1.size();i++){
        //    System.out.println("if " +list1.get(i)+ " != "+list2.get(i) +" return false;");
            if(list1.get(i)!=list2.get(i)) return false;
        }
        
        return true;
    }
}