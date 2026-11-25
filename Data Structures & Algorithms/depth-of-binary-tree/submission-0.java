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
    public int maxDepth(TreeNode root) 
    {
        return max(root,0);
        
    }
    int max(TreeNode node,int len)
    {
      
       if(node==null)
       return len;
       int left=max(node.left,len+1);
       int right=max(node.right,len+1);
       return Math.max(left,right);
    }
}
