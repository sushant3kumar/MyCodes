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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null)
        {
            int x=diameterOfBinaryTree(root.left);
            int y=diameterOfBinaryTree(root.right);
            
            int a= 0,b=0;
            if(root.left!=null)
            {
                a=height(root.left);
            }
            if(root.right!=null)
            {
                 b=height(root.right);
            }
            System.out.print(a+" "+b);
            return Math.max(a+b,Math.max(x,y));
        }
        return 0;
        
        
    }
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int rh=0;
            int lh=0;
            rh= height(root.right);
            lh= height(root.left);
            int x=(rh>lh?rh:lh);
            return x+1;
        }
    }
}
