class Solution {
    public int maxArea(int[] height) {
        if(height.length==1){
            return 0;
        }
        int low=0;
        int high=height.length-1;
        int max=Integer.MIN_VALUE;
        int ans=0;
        int c=-1;
        while(low<high){
            if(height[low]<height[high]){
                c=0;
                ans=height[low]*(high-low);
                if(ans>max){
                    max=ans;
                }
            }
            else{
                c=1;
                ans=height[high]*(high-low);
                if(ans>max){
                    max=ans;
                }
            }
            if(c==0){
                low++;
            }
            else{
                high--;
            }

        }
        return max;
        
    }
}
