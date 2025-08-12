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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayDeque<TreeNode>ad=new ArrayDeque<>();
        ad.add(root);
        int c=1;
        //int min=Integer.MAX_VALUE;
        //ArrayList<TreeNode>arr=new ArrayList<>();
       // arr.add(root);
        while(!ad.isEmpty()){
            int s=ad.size();
            for(int i=0;i<s;i++){
            TreeNode curr=ad.poll();
            if(curr.left==null && curr.right==null){
                return c;
            }
            if(curr.left !=null){
                ad.add(curr.left);
                //arr.add(curr.left);
            }
            if(curr.right!=null){
                ad.add(curr.right);
                //arr.add(curr.right);
            }
           
        }
        c++;
        }
        return 0;   
    }
}
