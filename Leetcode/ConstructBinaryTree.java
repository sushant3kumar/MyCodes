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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        root.left=null;
        root.right=null;
        for(int i=1;i<preorder.length;i++)
        {
            root=insert(root,preorder[i]);
        }
       /* Queue<TreeNode> qe= new LinkedList<>();
        qe.add(root);
        while(!qe.isEmpty())
        {
            System.out.print(qe.peek()+" ");
            TreeNode temp= qe.poll();
            qe.add(temp.left);
            qe.add(temp.right);
            
        }*/
        return root;
    }
    public TreeNode insert(TreeNode root,int data)
    {   
        if(root==null)
        {
            TreeNode temp =new TreeNode(data);
            temp.left=null;
            temp.right=null;
            return temp;
        }
        if(data<root.val)
        {
            root.left=insert(root.left,data);
        }
        if(data>root.val)
        {
            root.right= insert(root.right,data);
        }
        return root;
        
    }
}
