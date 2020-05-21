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
    public int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mh(root);
        return max;
    }
    public int mh(TreeNode root)
    {
         if(root==null)
        {
            return 0;
        }
        int lsum=  mh(root.left)+root.val;
        int rsum= mh(root.right)+root.val;
        max= Math.max(max,Math.max(Math.max(lsum,rsum),lsum+rsum-root.val));
        
        return Math.max(lsum,Math.max(rsum,0));
    }
}
