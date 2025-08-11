class Solution {
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return(Integer.max(height(root.left),height(root.right))+1);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //int height=0;
        return height(root);
    }
}
