/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<Node>q = new Stack<>();
        q.push(root);
        
        while(!q.isEmpty()){
            Node nod = q.pop();
            list.add(nod.val);
            for(Node n : nod.children){
                q.push(n);
            }
        }
        Collections.reverse(list);
        return list;
    }
}