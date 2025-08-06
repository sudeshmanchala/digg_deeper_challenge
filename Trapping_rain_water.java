class Solution {
    public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int c=0;
        int prev=Integer.MIN_VALUE;
        int next=Integer.MIN_VALUE;
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        for(int i=0;i<height.length-1;i++){
            leftmax[i]=Math.max(height[i],prev);
            prev=leftmax[i];
        }
        for(int i=height.length-1;i>=0;i--){
            rightmax[i]=Math.max(height[i],next);
            next=rightmax[i];
        }
        for(int i=0;i<height.length-1;i++){
            if(height[i]<leftmax[i] && height[i]< rightmax[i]){
                c=c+(Math.min(leftmax[i],rightmax[i])-height[i]);
            }
        }
        return c;
    }
}
