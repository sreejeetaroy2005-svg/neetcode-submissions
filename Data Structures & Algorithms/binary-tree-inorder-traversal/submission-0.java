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
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        TreeNode curr=root;
        List<Integer> lis=new ArrayList<>();
        if(root==null)
        return lis;
        lis=traversal(root,lis);
        return lis;
        
        
    }
    public List<Integer> traversal(TreeNode node,List<Integer> arr)
    {
        if(node==null)
        return null;
        traversal(node.left,arr);
        arr.add(node.val);
        traversal(node.right,arr);
        
        return arr;
    }
}