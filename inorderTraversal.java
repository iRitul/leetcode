/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        if(root==null) return inOrder;
        Stack<TreeNode> stack = new Stack<>();
        pushAllLeft(root,stack);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            inOrder.add(curr.val);
            pushAllLeft(curr.right,stack);
        }return inOrder;
    }
    public void pushAllLeft(TreeNode node, Stack stack){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
}
