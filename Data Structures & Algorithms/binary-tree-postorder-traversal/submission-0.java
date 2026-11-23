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
class Solution 

{
    public List<Integer> postorderTraversal(TreeNode root) 
    {

        List<Integer> lis=new ArrayList<>();
        if(root==null)
        return lis;
        return post(root,lis);
    }
    List<Integer> post(TreeNode node,List<Integer> lis)
    {
        if(node==null)
        return null;
        post(node.left,lis);
        post(node.right,lis);
        lis.add(node.val);
        return lis;
    }
}