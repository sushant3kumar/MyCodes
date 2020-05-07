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
    static int count=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        return((level(root,x,1)==level(root,y,1))
              && !isSibling(root,x,y));
    }
    
    public int level(TreeNode root,int n,int lev)
    {   
      if(root==null)
      {
          return 0;
      }
      if(root.val==n)
      {
          return lev;
      }
      int l= level(root.left,n,lev+1);
        if(l!=0)
        {
            return  l;
        }
        return level(root.right,n,lev+1);
        
    }
    public boolean isSibling(TreeNode root,int a,int b)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null )
        {
            return isSibling(root.right,a,b);
        }
        if(root.right==null)
        {
            return isSibling(root.left,a,b); 
        }
        return ((root.left.val==a && root.right.val==b)||(root.left.val==b && root.right.val==a)|| isSibling(root.right,a,b)||isSibling(root.left,a,b));
    }
}
