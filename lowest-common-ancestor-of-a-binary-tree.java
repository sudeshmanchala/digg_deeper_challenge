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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<TreeNode,TreeNode>hm=new HashMap<>();
        ArrayDeque<TreeNode>ad=new ArrayDeque<>();
        ad.add(root);
        hm.put(root,null);
        while(!ad.isEmpty()){
            TreeNode curr=ad.poll();
            if(curr.left!=null){
                hm.put(curr.left,curr);
                ad.add(curr.left);
            }
            if(curr.right!=null){
                hm.put(curr.right,curr);
                ad.add(curr.right);
            }
        }
        ArrayList<TreeNode>arr1=new ArrayList<>();
        ArrayList<TreeNode>arr2=new ArrayList<>();
        TreeNode ans=p;
        TreeNode ans2=q;
        while(ans!=null){
            arr1.add(ans);
            ans=hm.get(ans);
        }
        Collections.reverse(arr1);
         while(ans2!=null){
            arr2.add(ans2);
            ans2=hm.get(ans2);
        }
        Collections.reverse(arr2);
        TreeNode a=null;
        int size1=arr1.size();
        int size2=arr2.size();
        int s=Integer.min(size1,size2);
        for(int i=0;i<s;i++){
            if((arr1.get(i))==(arr2.get(i))){
                a=arr1.get(i);
            }
            else{
                break;
            }
        }

        
        return a;
    }
}
