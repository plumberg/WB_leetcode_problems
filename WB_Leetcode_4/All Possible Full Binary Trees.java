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
    public List<TreeNode> allPossibleFBT(int N) {
        if(N <= 0 || N % 2 == 0) return new ArrayList<>(); // reduces runtime by not allowing traversal when it's not necessary 
        List<TreeNode>list = new ArrayList<>();
        if(N==1){
            list.add(new TreeNode(0));
            return list;
        }
        
        for(int i =1;i<N;i++){
            List<TreeNode>leftTrees = allPossibleFBT(i);
            List<TreeNode>rightTrees = allPossibleFBT(N-1-i); // from the higher number
            for(TreeNode lefty : leftTrees){ //iterate through all nodes, from both sides
                for(TreeNode righty : rightTrees){
                    TreeNode newNod = new TreeNode(0);//create a new node
                    newNod.left = lefty;
                    newNod.right = righty;
                    list.add(newNod);// after created, add to the list
                }
            }
        }
        
        return list;
    }
}