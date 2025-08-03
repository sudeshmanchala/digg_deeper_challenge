class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] result=new int[nums.length];
        int l=1;
        int[] right=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            left[i]=l*nums[i];
            l=left[i];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            right[i]=r*nums[i];
            r=right[i];
        }
        result[0]=right[1];
        result[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            result[i]=right[i+1]*left[i-1];
        }
        return result;
    }
}
